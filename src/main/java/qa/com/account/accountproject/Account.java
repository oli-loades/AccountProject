package qa.com.account.accountproject;

public class Account {
	private String firstName;
	private String surname;
	private int accNo;

	public Account(String firstName, String surname, int accNo) {
		this.firstName = firstName;
		this.surname = surname;
		this.accNo = accNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

}
