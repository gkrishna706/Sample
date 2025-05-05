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
<<<<<<< HEAD
		Reporter.log("Org deleted", true);
		System.out.println("what is this");
		
		
	}
=======
		Reporter.log("Org is deleted", true);	
		
>>>>>>> branch 'master' of https://github.com/gkrishna706/Sample

	}
	@Test
	public void modifyOrg() {
		Reporter.log("Org is modified", true);	
		

	}
	
}
