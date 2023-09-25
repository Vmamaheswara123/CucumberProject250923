package BaseObjects;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver ;
	
	public void baseMethod() {
		System.out.println("Inside method of baseMethod");
		 String env = System.getProperty("env", "uat");
    	 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + env);

    	 String browser = System.getProperty("browser", "firefox");
    	 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + browser);

    	if(browser.toLowerCase().equals("chrome")) {
    		String path = "D:\\WorkSpace_Repo\\Automation_01\\Drivers\\chromedriver.exe";
    		System.setProperty("webdriver.chrome.driver", path);
    		driver = new ChromeDriver();
    	}else if(browser.toLowerCase().equals("firefox")) {
//    		String path = "D:\\WorkSpace_Repo\\Automation_02\\Drivers\\firefox.exe";
//    		System.setProperty("webdriver.gheko.driver", path);
//    		driver = new FirefoxDriver();
    	}
		
    	
    	if(env.toLowerCase().equals("sit")) {
            driver.get("https://www.google.com");
    	}else if(env.toLowerCase().equals("uat")) {
            driver.get("https://www.google.com");
    	}

	}
}
