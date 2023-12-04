package Flipkart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart 
{
public static void main(String[] args) {
	WebDriver d= new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("https://www.flipkart.com/");
	
	d.findElement(By.xpath("//span[@role='button']")).click();
	d.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung mobiles");
	d.findElement(By.xpath("//button[@type='submit']")).click();
	d.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	Set<String> a = d.getWindowHandles();
	ArrayList<String> b=new ArrayList<String>(a);
	d.switchTo().window(b.get(1));
	d.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
}
}
