package schemaComparison;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import control.Main;
import database.DatabaseConnection;

public class loadFile {
	
	public static Map<Integer, ArrayList<String>> records;
	public static List<Integer> correspondingUsefulFieldIndex;
	public static List<String> listOfFields;
	
	public static ArrayList<Path> loadFileList(String path, String tableList){
		ArrayList<Path> list = new ArrayList<>();
		String tablename = "-" + tableList + "-";
//		try(Stream<Path> paths = Files.walk(Paths.get(path))) {
//		    paths.forEach(filePath -> {
//		        if (Files.isRegularFile(filePath) && filePath.getFileName().toString().contains(tablename)) {
//		            list.add(filePath);
//		        }
//		    });
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		final File folder = new File(path);
		for (final File fileEntry: folder.listFiles()){
			if (!fileEntry.isDirectory() && fileEntry.getName().contains(tablename)){
				list.add(fileEntry.toPath());
			}
			
		}
		System.out.println("Total number of file to load is "+ list.size());
		return list;
	}
	

	
	private static List<String> loadSchema(){
		List<String> listoffields = new ArrayList<>();
		List<String> list = new ArrayList<>();
		try (Stream<String> stream = Files.lines(Paths.get(Main.fieldPath))) {

			list = stream.collect(Collectors.toList());
			for (String st: list){
				listoffields.add(st.split(" ")[0]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return listoffields;
	}
	
	//Map contains the index and field name in the old data that can be used
	private static List<Integer> usedIndex(List<String> firmedField, List<String> oldField){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i< oldField.size(); i++){
			if (firmedField.contains(oldField.get(i))){
				list.add(i);
			}
		}
		
		System.out.println("=====================unused fields in the table================");
		firmedField.forEach(field ->{
			if (!oldField.contains(field)){
				System.out.println(field);
			}
		});
		
		System.out.println("======================END=================\n");
		
		return list;
	}
	
	
	
	
	
	public static void getValue(Path file){
		
		List<String> list = new ArrayList<>();
		records = new TreeMap<Integer, ArrayList<String>>();
//		try (Stream<String> stream = Files.lines(Paths.get(file.toString()))) {
//
//			list = stream.collect(Collectors.toList());
//			
//			if (!list.isEmpty()){
//				//first line
//				listOfFields = new ArrayList<String>(Arrays.asList(list.remove(0).split("\t")));
//				//get the useful field
//				correspondingUsefulFieldIndex = usedIndex(loadSchema(), listOfFields);
//				
//				list.forEach(record -> {
//					ArrayList<String> temp = new ArrayList<String>(Arrays.asList(record.split("\t")));
//					records.put((Integer)Integer.parseInt(temp.get(0)), temp);
//				});
//				
//				
//				
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			list = Files.readAllLines(file, Charset.defaultCharset());
			if (!list.isEmpty()){
				//first line
				listOfFields = new ArrayList<String>(Arrays.asList(list.remove(0).split("\t")));
				
				//get the useful field
				correspondingUsefulFieldIndex = usedIndex(loadSchema(), listOfFields);
				
				
				for (String record: list){
					ArrayList<String> temp = new ArrayList<String>(Arrays.asList(record.split("\t")));
					records.put((Integer)Integer.parseInt(temp.get(0)), temp);
				}
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void getAllValuesAndAdd(List<Path> files){
	
//		files.forEach(file->{
//			System.out.println("Handling "+ file);
//			
//			
//			loadFile.getValue(file);
//			DatabaseConnection.batchInsert();
//			
//		});
		
		for (Path file: files){
			System.out.println("Handling "+ file);
			
			
			loadFile.getValue(file);
			DatabaseConnection.batchInsert();
		}

	}


}
