import java.util.*;
public class ListView {

	public String buildFullList(ToDoList toDoList){
		StringBuilder listString = new StringBuilder("Full List for: " + toDoList.getName());
		listString.append("\n============================");
		List<ListItem> list = toDoList.getList();
		int counter = 1;
		for(ListItem item : list){
			listString.append("\n" + counter + ": " + item.getName() + "; STATUS: " + (item.isComplete() ? "complete" : "pending"));
			counter ++;
		}

		return listString.toString();
	}

	public String buildCompletedList(ToDoList toDoList){
		StringBuilder listString = new StringBuilder("Completed Items for: " + toDoList.getName());
		listString.append("\n============================");
		List<ListItem> list = toDoList.getList();
		int counter = 1;
		for(ListItem item : list){
			if(item.isComplete()){
				listString.append("\n" + counter + ": " + item.getName());
				counter ++;
			}
		}

		return listString.toString();
	}

	public String buildPendingList(ToDoList toDoList){
		StringBuilder listString = new StringBuilder("Pending Items for:" + toDoList.getName());
		listString.append("\n============================");
		List<ListItem> list = toDoList.getList();
		int counter = 1;
		for(ListItem item : list){
			if(!item.isComplete()){
				listString.append("\n" + counter + ": " + item.getName());
				counter ++;
			}
		}

		return listString.toString();
	}

}