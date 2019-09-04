package mydemo_1.mydemo_1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;

	public class Drivers {
		static WebDriver driver = null;
	public static WebDriver configureDriver(String browserName) {
	
	 if(browserName.equals("explorer")) {
	  System.setProperty("webdriver.ie.driver","C:\\Users\\anusha.k.m\\Downloads\\IEDriverServer_x64_3.14.0 (1)\\IEDriverServer.exe");
	     driver = new InternetExplorerDriver();   
	 }
	 else if(browserName.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\training_b6b.01.07\\\\Desktop\\\\oxygen\\\\IEDriverServer_x64_3.14.0\\chromedriver.exe");
	     driver = new ChromeDriver();   
	 }
	 else if(browserName.equals("firefox")) {
	  System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\training_b6b.01.07\\\\Desktop\\\\oxygen\\\\IEDriverServer_x64_3.14.0\\geckodriver.exe");
	     driver = new FirefoxDriver();  
	 }
	 
	 return driver;
	}



}