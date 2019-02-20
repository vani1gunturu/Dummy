package irctc;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/vani/selenium components/chromedriver_linux64/chromedriver");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.com");

	}

}
