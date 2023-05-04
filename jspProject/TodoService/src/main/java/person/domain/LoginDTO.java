package person.domain;

public class LoginDTO {
	
	String firstName;
	String lastName;
	String personID;
	public LoginDTO() {

	}
	public LoginDTO(String firstName, String lastName, String personID) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.personID = personID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPersonID() {
		return personID;
	}
	public void setPersonID(String personID) {
		this.personID = personID;
	}
	@Override
	public String toString() {
		return "LoginDAO [firstName=" + firstName + ", lastName=" + lastName + ", personID=" + personID + "]";
	}
	
}
