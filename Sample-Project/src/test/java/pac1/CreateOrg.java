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
		Reporter.log("Org deleted", true);
		System.out.println("changed");
		System.out.println("AE2 did changes");
		System.out.println("bhai");
		System.err.println("bhaichara");
	}

}
