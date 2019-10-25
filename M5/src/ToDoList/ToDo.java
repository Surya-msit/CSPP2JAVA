package ToDoList;

class ToDoList {
	private String Name;
	private String Description;
	private String Date;
	private String Status;

	public ToDoList(String n,String d,String da, String s) 
	{
		Name=n;
		Description=d;
		Date = da;
		Status= s;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String toString() {
		return "ToDoList [Name=" + Name + ", Description=" + Description + ", Date=" + Date + ", Status=" + Status + "]";
	}
	
}
