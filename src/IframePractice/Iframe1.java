package IframePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 
{
	public static void main(String[] args) {
		
	
WebDriver d=new ChromeDriver();
d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

d.switchTo().frame("iframeResult");
d.findElement(By.xpath("//button[@type='button']")).click();

d.switchTo().parentFrame();
d.findElement(By.xpath("//a[@onclick='openMenu()']")).click();
}
}
