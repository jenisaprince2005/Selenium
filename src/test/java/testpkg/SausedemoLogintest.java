package testpkg;

import org.testng.annotations.Test;

import Basepkg.BaseClass;
import page.SausedemoLoginPage;

public class SausedemoLogintest extends BaseClass {
@Test
public void test() {
	SausedemoLoginPage lp= new SausedemoLoginPage(driver);
	lp.setvalue("standard_user", "secret_sause");
	lp.logins();
	}


}
