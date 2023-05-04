package person.domain;

public class PersonDTO {

	private String firstName;
	private String lastName;
	private String personID;
	private String password;
	
	public PersonDTO() {

	}
	public PersonDTO(String firstName, String lastName, String personID, String password) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.personID = personID;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
