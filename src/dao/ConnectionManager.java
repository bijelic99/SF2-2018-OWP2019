package dao;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.apache.tomcat.util.net.SecureNioChannel.ApplicationBufferHandler;
import org.omg.CORBA.PUBLIC_MEMBER;




public class ConnectionManager {
	public static final String WindowsPATH = "C:\\Users\\bijel_m6vqjgt\\Desktop\\sf2-2018-owp2019\\WebContent\\SF2-2018-OWP2019-Database.db";
	public static final String LinuxPATH = "/home/dejan/SF2-2018-OWP2019/WebContent/SF2-2018-OWP2019-Database.db";
	public static final String systemDelimiter = File.separator;
	
	static DataSource dataSource;
	
	public static void open(String basePath) {
		try {
			
			Properties dsp = new Properties();
			dsp.setProperty("driverClassName", "org.sqlite.JDBC");
			dsp.setProperty("url", "jdbc:sqlite:" + basePath + "SF2-2018-OWP2019-Database.db");
			
			dataSource = BasicDataSourceFactory.createDataSource(dsp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public static Connection getConnection() throws SQLException {
		
			return dataSource.getConnection();
		
	}
	
	
}
