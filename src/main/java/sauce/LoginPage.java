package sauce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private final WebDriver driver;
	WebDriverWait wait;
	
	//Un constructeur qui va initialiser driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	//on va utiliser le driver avec les éléments de la page login
	//on va simuler les trois actions nécessaires de la page login
	public void login(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		wait.until(ExpectedConditions.urlContains("/inventory.html"));
		
	////////////////////////	
		
	}
}
