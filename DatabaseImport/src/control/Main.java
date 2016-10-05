package control;

import java.nio.file.Path;
import java.util.List;

import database.DatabaseConnection;
import database.Establish;
import schemaComparison.loadFile;

public class Main {
	
	public static String filePath = "H:\\Opon edX\\hkustx-2014-09-28\\User";
	public static String fieldPath = "H:\\Opon edX\\hkustx-2014-09-28\\User\\schema_list\\auth_user.txt";
	public static String tableName = "auth_userprofile";
//	public static String className = "AuthUserprofile";
	public static String fieldName = "AUTH_USERPROFILE";
	public static String dbuser = "testroot";
	public static String dbpw = "testroot";
	public static String dbpath = "jdbc:mysql://localhost:3306/bitnami_edx";
	
	//Also need to change connection

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Establish.go();
//		DatabaseConnection.connect(dbpath, dbuser, dbpw);
//		List<Path> paths = loadFile.loadFileList(filePath, tableName);
//		loadFile.getAllValuesAndAdd(paths);
		loadFile.divideLargeFile("F:\\Opon edX\\hkustx-2014-09-28\\Studentmodule\\HKUSTx-COMP102x-2T2014-courseware_studentmodule-prod-analytics.sql", "F:\\Opon edX\\hkustx-2014-09-28\\Studentmodule\\temp");
		
		System.out.println("=======================Finished=====================");
		
		

	}

}
