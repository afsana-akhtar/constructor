import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class B {

	public static void main(String[] args) {
		
 /*    int a=14;
	A c=new A(a);	
	c.m1();	
		
	A d=new A(20);
	d.m1();	
		
	A e=new A(15,5);	//sum of (x+u)
	e.m2();	
	c.m1();	 //c hold the value 14.
		
	
	A f=new A("hi", "hello");
	f.logIn();
	
	A g=new A("to","do");
	
	g.logIn(); 
	
		***selenium practics***   */
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MouryRaz\\Desktop\\jar file\\geckodriver-v0.19.0-win64(1)\\geckodriver.exe");
		
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		
		C x=new C(dr);
		x.login();     //null
		
		C y=new C(dr, "userIdNai", "amarPassword");
		y.login(); 
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
