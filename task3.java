package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Hy Starting Automation");

//		WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");  
//		WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://learning.ccbp.in/course?c_id=2f4192f7-7495-49ca-a6ce-6b74005e25f1&t_id=bf403c3e-a02f"
				+ "-4a6b-8f95-23b9ee670f9e&s_id=7b59ee04-3d4f-4687-a1fa-8f5f59fb1f08");
		
		
	}

}
