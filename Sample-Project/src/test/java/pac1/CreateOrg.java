package pac1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOrg {
	@Test
	public void createOrg() {
		Reporter.log("Org created", true);
	}
	@Test
	public void deleteOrg() {

	}
	@Test
	public void modifyOrg() {
		Reporter.log("Org is modified", true);	
		

	}
	
}
