package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoFrame
{
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	//switch to frame
	//d.switchTo().frame("iframeResult");  // 1.string frame name
	//d.switchTo().frame("iframeResult");  // 2.string frame id
	//d.switchTo().frame(d.findElement(By.xpath("//iframe[@id='iframeResult']")));  //frame webelement
	d.switchTo().frame(1); //int frame index
	
	
	
	//click on date and time button 
	d.findElement(By.xpath("//button[@type='button']")).click();
}
}
