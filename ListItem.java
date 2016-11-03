public class ListItem {
	private String name;
	private boolean status;

	public ListItem(String n){
		name = n;
	}

	public ListItem(){
		super();
	}

	public String getName(){
		return name;
	}
	public boolean getStatus(){
		return status;
	}

	public void setName(String n){
		name = n;
	}
	public void setStatus(boolean s){
		status = s;
	}

	public boolean isComplete(){
		return getStatus();
	}
}
