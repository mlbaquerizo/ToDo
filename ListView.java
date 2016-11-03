import java.util.*;
public class ListView {

	public void showFullList(ToDoList toDoList){
		System.out.println("Full List for: " + toDoList.getName());
		List<ListItem> list = toDoList.getList();
		int counter = 1;
		for(ListItem item : list){
			System.out.println(counter + ": " + item.getName() + "; STATUS: " + (item.isComplete() ? "complete" : "pending"));
			counter ++;
		}
	}

	public void showCompletedList(ToDoList toDoList){
		System.out.println("Completed Items for: " + toDoList.getName());
		List<ListItem> list = toDoList.getList();
		int counter = 1;
		for(ListItem item : list){
			if(item.isComplete()){
				System.out.println(counter + ": " + item.getName());
				counter ++;
			}
		}
	}

	public void showPendingList(ToDoList toDoList){
		System.out.println("Pending Items for:" + toDoList.getName());
		List<ListItem> list = toDoList.getList();
		int counter = 1;
		for(ListItem item : list){
			if(!item.isComplete()){
				System.out.println(counter + ": " + item.getName());
				counter ++;
			}
		}
	}
}