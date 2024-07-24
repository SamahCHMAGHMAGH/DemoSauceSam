package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

//Initialisation de driver
public class BaseTest {
	
	protected static WebDriver driver;
	
	//Création d'une nouvelle instance de ChromeDriver qui sera utilisée pour controler le navigateur
	//Préparation de l'environnement de test avant les tests
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	//c'est une méthode qui assure le nettoyage après les tests et la fermeture de driver
	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit(); //Quitter toutes les fenêtres de navigation et terminez la session WebDriver
			driver = null; //Définir driver sur null pour indiquer que la session WebDriver est terminée
			
			
	//Les deux méthodes "setUp" et "tearDown" assure la préparation de l'environnement de test avant les tests, et le nettoyage après les tests		
		}
	}
}