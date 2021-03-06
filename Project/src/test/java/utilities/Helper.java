package utilities;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Helper {

	// Method to take screenshot when the test cases fail
	public static void captureScreenshot(WebDriver driver , String screenshotname) throws IOException 
	{
		String RandomNumber =  generateRandomNumber();
		
		Path dest = Paths.get("./ScreenShots",screenshotname+RandomNumber+"gh.png"); 
		
		//take screenshot
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//copy the screen shot to another file
		FileUtils.copyFile(scrFile, new File(dest.toString()));
	}
	
	//method to generate random string
	public static String generateRandomNumber()
	{
		String Numbers = "123456789";
		String randomString = "" ;
		int lenght = 6;
		char[] text = new char[6];


		Random random = new Random();

		//create an array (text[]) with random alphabet
		for ( int i=0 ; i<lenght ; i++ )
		{
			text[i] = Numbers.charAt(random.nextInt(Numbers.length()));
		}

		//convert the array to string
		for ( int i=0 ; i<text.length ; i++ )
		{
			randomString +=text[i];
		}
		return randomString;
	}
}
