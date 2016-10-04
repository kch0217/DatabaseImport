package database;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.Map;

import org.jooq.BatchBindStep;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import control.Main;
import schemaComparison.loadFile;

import static schema.Tables.*;

public class DatabaseConnection {
	
	static DSLContext create;
	
	public static void connect(String url, String userName, String password){
		try (Connection conn = DriverManager.getConnection(url, userName, password)) {
			create = DSL.using(conn, SQLDialect.MYSQL);
			
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void batchInsert(){
		try (Connection conn = DriverManager.getConnection(Main.dbpath, Main.dbuser, Main.dbpw)) {
			create = DSL.using(conn, SQLDialect.MYSQL);
			BatchBindStep forbi = null;
			if (Main.fieldName.equals("AUTH_USER")){
				forbi =  create.batch(create.insertInto(AUTH_USER, AUTH_USER.ID, AUTH_USER.USERNAME,  AUTH_USER.FIRST_NAME, AUTH_USER.LAST_NAME, AUTH_USER.EMAIL, AUTH_USER.PASSWORD, AUTH_USER.IS_STAFF, AUTH_USER.IS_ACTIVE,  AUTH_USER.IS_SUPERUSER, AUTH_USER.LAST_LOGIN, AUTH_USER.DATE_JOINED  ).values( (Integer) null, null, null, null, null, null, null, null, null, null, null).onDuplicateKeyIgnore());
				for(Map.Entry<Integer,ArrayList<String>> entry : loadFile.records.entrySet()) {
					  forbi.bind(entry.getValue().get(0),entry.getValue().get(1), entry.getValue().get(2), entry.getValue().get(3), entry.getValue().get(4), entry.getValue().get(5), entry.getValue().get(6), entry.getValue().get(7), entry.getValue().get(8), entry.getValue().get(9), entry.getValue().get(10));	  
				}
			}
			else if (Main.fieldName.equals("AUTH_USERPROFILE")){
				forbi =  create.batch(create.insertInto(AUTH_USERPROFILE, AUTH_USERPROFILE.ID, AUTH_USERPROFILE.USER_ID,  AUTH_USERPROFILE.NAME, AUTH_USERPROFILE.LANGUAGE, AUTH_USERPROFILE.LOCATION, AUTH_USERPROFILE.META, AUTH_USERPROFILE.COURSEWARE, AUTH_USERPROFILE.GENDER,  AUTH_USERPROFILE.MAILING_ADDRESS, AUTH_USERPROFILE.YEAR_OF_BIRTH, AUTH_USERPROFILE.LEVEL_OF_EDUCATION, AUTH_USERPROFILE.GOALS, AUTH_USERPROFILE.ALLOW_CERTIFICATE, AUTH_USERPROFILE.COUNTRY, AUTH_USERPROFILE.CITY ).values( (Integer) null, null, null, null, null, null, null, null, null, null, null, null, null, null, null).onDuplicateKeyIgnore());
				for(Map.Entry<Integer,ArrayList<String>> entry : loadFile.records.entrySet()) {
					  forbi.bind(entry.getValue().get(0),entry.getValue().get(1), entry.getValue().get(2), entry.getValue().get(3), entry.getValue().get(4), entry.getValue().get(5), entry.getValue().get(6), entry.getValue().get(7), entry.getValue().get(8), entry.getValue().get(9), entry.getValue().get(10), entry.getValue().get(11), entry.getValue().get(12), entry.getValue().get(13), entry.getValue().get(14));	  
				}
			}
			else if (Main.fieldName.equals("STUDENT_COURSEENROLLMENT")){
				forbi =  create.batch(create.insertInto(STUDENT_COURSEENROLLMENT, STUDENT_COURSEENROLLMENT.ID, STUDENT_COURSEENROLLMENT.USER_ID,  STUDENT_COURSEENROLLMENT.COURSE_ID, STUDENT_COURSEENROLLMENT.CREATED, STUDENT_COURSEENROLLMENT.IS_ACTIVE, STUDENT_COURSEENROLLMENT.MODE).values( (Integer) null, null, null, null, null, null).onDuplicateKeyIgnore());
				for(Map.Entry<Integer,ArrayList<String>> entry : loadFile.records.entrySet()) {
					  forbi.bind(entry.getValue().get(0),entry.getValue().get(1), entry.getValue().get(2), entry.getValue().get(3), entry.getValue().get(4), entry.getValue().get(5));	  
				}
			}
			else if (Main.fieldName.equals("USER_API_USERCOURSETAG")){
				forbi =  create.batch(create.insertInto(USER_API_USERCOURSETAG, USER_API_USERCOURSETAG.USER_ID,  USER_API_USERCOURSETAG.COURSE_ID, USER_API_USERCOURSETAG.KEY, USER_API_USERCOURSETAG.VALUE).values( (Integer) null, null, null, null).onDuplicateKeyIgnore());
				for(Map.Entry<Integer,ArrayList<String>> entry : loadFile.records.entrySet()) {
					  forbi.bind(entry.getValue().get(0),entry.getValue().get(1), entry.getValue().get(2), entry.getValue().get(3));	  
				}
			}
//			else if (Main.fieldName.equals("USER_ID_MAP")){
//				forbi =  create.batch(create.insertInto(, USER_API_USERCOURSETAG.USER_ID,  USER_API_USERCOURSETAG.COURSE_ID, USER_API_USERCOURSETAG.KEY, USER_API_USERCOURSETAG.VALUE).values( (Integer) null, null, null, null).onDuplicateKeyIgnore());
//				for(Map.Entry<Integer,ArrayList<String>> entry : loadFile.records.entrySet()) {
//					  forbi.bind(entry.getValue().get(0),entry.getValue().get(1), entry.getValue().get(2), entry.getValue().get(3));	  
//				}
//			}
			else if (Main.fieldName.equals("CERTIFICATES_GENERATEDCERTIFICATE")){
				forbi =  create.batch(create.insertInto(CERTIFICATES_GENERATEDCERTIFICATE, CERTIFICATES_GENERATEDCERTIFICATE.ID, CERTIFICATES_GENERATEDCERTIFICATE.USER_ID,  CERTIFICATES_GENERATEDCERTIFICATE.DOWNLOAD_URL, CERTIFICATES_GENERATEDCERTIFICATE.GRADE, CERTIFICATES_GENERATEDCERTIFICATE.COURSE_ID, CERTIFICATES_GENERATEDCERTIFICATE.KEY, CERTIFICATES_GENERATEDCERTIFICATE.DISTINCTION, CERTIFICATES_GENERATEDCERTIFICATE.STATUS, CERTIFICATES_GENERATEDCERTIFICATE.VERIFY_UUID, CERTIFICATES_GENERATEDCERTIFICATE.DOWNLOAD_UUID, CERTIFICATES_GENERATEDCERTIFICATE.NAME, CERTIFICATES_GENERATEDCERTIFICATE.CREATED_DATE, CERTIFICATES_GENERATEDCERTIFICATE.MODIFIED_DATE, CERTIFICATES_GENERATEDCERTIFICATE.ERROR_REASON, CERTIFICATES_GENERATEDCERTIFICATE.MODE).values( (Integer) null, null, null, null, null, null, null, null, null, null, null, null, null, null, null).onDuplicateKeyIgnore());
				for(Map.Entry<Integer,ArrayList<String>> entry : loadFile.records.entrySet()) {
					  forbi.bind(entry.getValue().get(0),entry.getValue().get(1), entry.getValue().get(2), entry.getValue().get(3), entry.getValue().get(4), entry.getValue().get(5), entry.getValue().get(6), entry.getValue().get(7), entry.getValue().get(8), entry.getValue().get(9), entry.getValue().get(10), entry.getValue().get(11), entry.getValue().get(12), entry.getValue().get(13), entry.getValue().get(14));
				}
			}
			else if (Main.fieldName.equals("COURSEWARE_STUDENTMODULE")){
				forbi =  create.batch(create.insertInto(COURSEWARE_STUDENTMODULE, COURSEWARE_STUDENTMODULE.ID, COURSEWARE_STUDENTMODULE.MODULE_TYPE, COURSEWARE_STUDENTMODULE.MODULE_ID, COURSEWARE_STUDENTMODULE.STUDENT_ID, COURSEWARE_STUDENTMODULE.STATE, COURSEWARE_STUDENTMODULE.GRADE, COURSEWARE_STUDENTMODULE.CREATED, COURSEWARE_STUDENTMODULE.MODIFIED, COURSEWARE_STUDENTMODULE.MAX_GRADE, COURSEWARE_STUDENTMODULE.DONE, COURSEWARE_STUDENTMODULE.COURSE_ID).values( (Integer) null, null, null, null, null, null, null, null, null, null, null).onDuplicateKeyIgnore());
				for(Map.Entry<Integer,ArrayList<String>> entry : loadFile.records.entrySet()) {
					  forbi.bind(entry.getValue().get(0),entry.getValue().get(1), entry.getValue().get(2), entry.getValue().get(3), entry.getValue().get(4), entry.getValue().get(5), entry.getValue().get(6), entry.getValue().get(7), entry.getValue().get(8), entry.getValue().get(9), entry.getValue().get(10));
				}
			}

			if (forbi != null)
				forbi.execute();
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
