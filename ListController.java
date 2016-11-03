public class ListController {
	private ToDoList toDoList;
	private ListView view;

	public ListController(ToDoList l){
		this.toDoList = l;
		this.view = new ListView();
	}

	public void showList(String statusCode){
		switch (statusCode) {
			case "full": view.showFullList(toDoList);
				break;
			case "pending": view.showPendingList(toDoList);
				break;
			case "complete": view.showCompletedList(toDoList);
				break;
			default: System.out.println("Use 'full', 'pending', or 'complete' to view the respective list.");
		}
	}

	public void addItem(String s){
		toDoList.addItem(s);
	}

	public void completeItem(int i){
		toDoList.completeItem(i);
	}

	public void deleteItem(int i){
		toDoList.deleteItem(i);
	}
}