package qa.com.account.accountproject;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
	private Map<Integer, Account> accounts;

	public AccountService() {
		accounts = new HashMap<Integer, Account>();
	}

	public boolean addAccount(Account newAccount) {
		boolean added = false;
		if (!accounts.containsKey(newAccount.getAccNo())) {
			accounts.put(newAccount.getAccNo(), newAccount);
			added = true;
		}
		return added;
	}

	public boolean containsAccount(int accNo) {
		return accounts.containsKey(accNo);
	}

	public Account getAccount(int accNo) {
		return accounts.get(accNo);
	}
}
