package qa.com.account.accountproject;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "account")
public class Account {
	
	
	private String firstName;
	
	private String surname;
	
	private int accNo;

	public Account() {};
	
	public Account(String firstName, String surname, int accNo) {
		this.firstName = firstName;
		this.surname = surname;
		this.accNo = accNo;
	}
	
	@XmlElement (name = "firstname")
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@XmlElement (name = "surname")
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@XmlAttribute (name = "accNo")
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

}
