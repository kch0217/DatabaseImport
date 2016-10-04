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
				forbi =  create.batch(create.insertInto(AUTH_USERPROFILE, AUTH_USERPROFILE.ID, AUTH_USERPROFILE.USER_ID,  AUTH_USER.FIRST_NAME, AUTH_USER.LAST_NAME, AUTH_USER.EMAIL, AUTH_USER.PASSWORD, AUTH_USER.IS_STAFF, AUTH_USER.IS_ACTIVE,  AUTH_USER.IS_SUPERUSER, AUTH_USER.LAST_LOGIN, AUTH_USER.DATE_JOINED  ).values( (Integer) null, null, null, null, null, null, null, null, null, null, null).onDuplicateKeyIgnore());
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
