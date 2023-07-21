import org.openqa.selenium.webdriver;

public class seleniumFirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver","\"F:\\eclipse\\chromedriver\\chromedriver.exe\""")
	WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com");
		dr.manage().window().maximise();
		
		thread.sleep(4000);
		dr.close();
		
	}

}
