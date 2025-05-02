package pac2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContact {
	@Test
	public void createCon() {
		Reporter.log("Con created", true);
	}
	@Test
	public void deleteCon() {
		Reporter.log("Con deleted", true);
	}

	

}
