package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;




public class ConnectionManager {
	public static final String PATH = "C:\\Users\\bijel_m6vqjgt\\Desktop\\sf2-2018-owp2019\\WebContent\\SF2-2018-OWP2019-Database.db";
	static DataSource dataSource;
	
	public static void open() {
		try {
			
			Properties dsp = new Properties();
			dsp.setProperty("driverClassName", "org.sqlite.JDBC");
			dsp.setProperty("url", "jdbc:sqlite:" + PATH);
			
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
