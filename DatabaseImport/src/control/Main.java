package control;

import java.nio.file.Path;
import java.util.List;

import database.DatabaseConnection;
import database.Establish;
import schemaComparison.loadFile;

public class Main {
	
	public static String filePath = "H:\\Opon edX\\hkustx-2014-09-28\\User";
	public static String fieldPath = "H:\\Opon edX\\hkustx-2014-09-28\\User\\schema_list\\auth_user.txt";
	public static String tableName = "auth_user";
	public static String className = "AuthUser";
	public static String fieldName = "AUTH_USER";
	public static String dbuser = "testroot";
	public static String dbpw = "testroot";
	public static String dbpath = "jdbc:mysql://localhost:3306/bitnami_edx";
	
	//Also need to change connection

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Establish.go();
		DatabaseConnection.connect(dbpath, dbuser, dbpw);
		List<Path> paths = loadFile.loadFileList(filePath, tableName);
		loadFile.getAllValuesAndAdd(paths);
		
		

	}

}
