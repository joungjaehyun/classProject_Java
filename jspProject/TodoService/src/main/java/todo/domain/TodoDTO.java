package todo.domain;

public class TodoDTO {
	
	private int todoNum;
	private String title;
	private String duedate;
	private boolean finished;
	private String personID;
	public TodoDTO() {

	}

	
	public TodoDTO(int todoNum, String title, String duedate, boolean finished, String personID) {
		super();
		this.todoNum = todoNum;
		this.title = title;
		this.duedate = duedate;
		this.finished = finished;
		this.personID = personID;
	}



	public int getTodoNum() {
		return todoNum;
	}

	public void setTodoNum(int todoNum) {
		this.todoNum = todoNum;
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
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}


	public String getPersonID() {
		return personID;
	}


	public void setPersonID(String personID) {
		this.personID = personID;
	}
	
	
	
}
