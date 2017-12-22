import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C {

	FirefoxDriver driver;

	String userName;
	String password;

	public C(FirefoxDriver x) {

		driver = x;

	}

	public C(FirefoxDriver dr, String x, String g) {

		driver = dr;
							
		
		userName = x;
		password = g;
	}

	public void login() {

		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("u_0_4")).click();

	}

	public void verifyTitle() {

		String l = driver.getTitle();

		System.out.println(l);

	}

}
