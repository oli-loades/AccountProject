package qa.com.account.accountproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumAccountTests {
	
	private AccountService accServ;

	@Before
	public void setup() {
		accServ = new AccountService();
	}

	@Test
	public void getNumAccountsByFirstNameTest() {
		accServ.addAccount(new Account("abc","xyz",1));
		accServ.addAccount(new Account("abc","xyz",2));
		accServ.addAccount(new Account("abc","xyz",3));
		accServ.addAccount(new Account("test","xyz",4));
		assertEquals(0,accServ.getNumAccountsByFirstName("test"));
		assertEquals(1,accServ.getNumAccountsByFirstName("xyz"));
		assertEquals(3,accServ.getNumAccountsByFirstName("abc"));
			
		
	}

}
