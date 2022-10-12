package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotClass 

{
	public static void screenShot(WebDriver driver,String name) throws IOException
	{
		Date d= new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date= d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
	
		File seleFile =ts.getScreenshotAs(OutputType.FILE);
		
		File myFile = new File("./\\ScreenshotFolder\\"+name+date+".jpeg");
	
		FileHandler.copy(seleFile, myFile);
		
	}
}