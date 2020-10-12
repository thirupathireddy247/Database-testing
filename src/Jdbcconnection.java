import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String  host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/qadbt", "root", "Thirupathi@63");
		Statement s=con.createStatement();
		ResultSet rs= s.executeQuery("select * from EmployeeInfo where name='thiru'");
		while(rs.next())
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");

			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(rs.getString("id"));
			driver.findElement(By.id("pass")).sendKeys(rs.getString("location"));
			
		
		}
		
		
		

	}

}
