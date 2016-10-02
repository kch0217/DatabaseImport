package database;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class Establish {
	static int lport = 3306;
	static String rhost = "127.0.0.1";
	static int rport = 3306;
	
	public static void go(){
		String user = "bitnami";
		String password = "Edx2016";
		String host = "123.1.162.180";
		int hostport = 16022;
		
		
		try {
			JSch jsch = new JSch();
			Session session;
			session = jsch.getSession(user, host, hostport);
			session.setPassword(password);
			session.setConfig("StrictHostKeyChecking", "no");
			session.connect();
			System.out.println("================Port Forwarding==============");
			System.out.println(session.getServerVersion());
			int assigned_port = session.setPortForwardingL(lport, rhost, rport);
			System.out.println("localhost:" + assigned_port + " -> " + rhost + ":" +rport);
			System.out.println("================Done==============");
			System.out.println();
			
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
