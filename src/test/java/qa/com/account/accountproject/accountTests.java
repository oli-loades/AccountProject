package qa.com.account.accountproject;

import static org.junit.Assert.*;

import static qa.com.account.accountproject.*;

import org.junit.*;

public class accountTests {
	
	private AccountService accServ;

	@Before
	public void setup() {
		accServ = new AccountService();
	}
	
	@Test
	public void addAccountTest() {
		accServ.addAccount(new Account("abc","xyz",1));
		assertEquals(true,accServ.addAccount(new Account("abc","xyz",2)));
		assertEquals(false,accServ.addAccount(new Account("abc","xyz",1)));
	}
	
	@Test
	public void containsAccountTest() {
		accServ.addAccount(new Account("abc","xyz",1));
		assertEquals(true,accServ.containsAccount(1));
		assertEquals(false,accServ.containsAccount(2));
	}
	
	@Test
	public void getAccountTest() {
		accServ.addAccount(new Account("abc","xyz",1));
		assertEquals("abc",accServ.getAccount(1).getFirstName());
		assertEquals(null,accServ.getAccount(2));
	}

}
