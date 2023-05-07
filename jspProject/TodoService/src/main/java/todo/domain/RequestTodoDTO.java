package todo.domain;

public class RequestTodoDTO {

	private String title;
	private String duedate;
	private String personID;
	public RequestTodoDTO() {
		super();
	}
	public RequestTodoDTO(String title, String duedate, String personID) {
		super();
		this.title = title;
		this.duedate = duedate;
		this.personID = personID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public String getPersonID() {
		return personID;
	}
	public void setPersonID(String personID) {
		this.personID = personID;
	}
	@Override
	public String toString() {
		return "RequestTodoDTO [title=" + title + ", duedate=" + duedate + ", personID=" + personID + "]";
	}
	
}
