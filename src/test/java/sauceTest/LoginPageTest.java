package sauceTest;

import org.testng.annotations.Test;

import sauce.LoginPage;
import setup.BaseTest;
import utils.DataInjectionIntern;
import utils.CSVUtils;


//"LoginPageTest" est dépendant de "BaseTest" , on fait "entends" pour qu'il sache le driver ---> "setUp" avant et après
public class LoginPageTest extends BaseTest {
	
	//L'annotation "@Test" assure un vrai test
	//@Test
	//public void loginTest() {
	//	new LoginPage(driver).login("standard_user", "secret_sauce");	
//}
	@Test(dataProvider = "csvData", dataProviderClass = CSVUtils.class)
	public void loginWithCsvData(String username, String password) {
		new LoginPage(driver).login(username, password);
}

}
