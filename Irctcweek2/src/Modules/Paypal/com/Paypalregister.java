package Modules.Paypal.com;

import org.openqa.selenium.WebDriver;
import Modules.WrapperMethods.CommonWrapperMethods;

public class Paypalregister {

	public static void main(String[] args) {
	
		WebDriver driver = null;
		
		CommonWrapperMethods cwm = new CommonWrapperMethods(driver);
		
		cwm.InvokeApp("https://developer.paypal.com/","ch");
		
		cwm.clickbylinkText("Sign Up");
	
		cwm.setvalueById("emailAddress", "test@testleaf.com");
		
		System.out.println("GIT installed");
	}
	
	}


