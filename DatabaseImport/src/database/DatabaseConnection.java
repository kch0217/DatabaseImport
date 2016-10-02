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
			BatchBindStep forbi = create.batch(create.insertInto(AUTH_USER_TEST, AUTH_USER_TEST.USERNAME,  AUTH_USER_TEST.FIRST_NAME, AUTH_USER_TEST.LAST_NAME, AUTH_USER_TEST.EMAIL, AUTH_USER_TEST.PASSWORD, AUTH_USER_TEST.IS_STAFF, AUTH_USER_TEST.IS_ACTIVE,  AUTH_USER_TEST.IS_SUPERUSER, AUTH_USER_TEST.LAST_LOGIN, AUTH_USER_TEST.DATE_JOINED  ).values( (String)null, null, null, null, null, null, null, null, null, null).onDuplicateKeyIgnore());
			for(Map.Entry<Integer,ArrayList<String>> entry : loadFile.records.entrySet()) {
			  forbi.bind(entry.getValue().get(1), entry.getValue().get(2), entry.getValue().get(3), entry.getValue().get(4), entry.getValue().get(5), entry.getValue().get(6), entry.getValue().get(7), entry.getValue().get(8), entry.getValue().get(9), entry.getValue().get(10));	  
			}
			
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
