package qa.com.account.accountproject;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

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
	
	@Test 
	public void accountToJSONTest() {
			assertEquals("{\"" +"firstName\"" + ":" + "\"abc\"" +"," + "\"surname\"" + ":" + "\"xyz\"" + "," + "\"accNo\"" + ":1" + "}",AccountToJSONConverter.convert(new Account("abc","xyz",1)));

	}

}
