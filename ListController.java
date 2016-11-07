public class ListController {
	private ToDoList toDoList;
	private ListView view;



	public ListController(ToDoList l){
		this.toDoList = l;
		this.view = new ListView();
	}

	public void showList(String statusCode){
		String message;
		switch (statusCode) {
			case "full": message = view.buildFullList(toDoList);
				break;
			case "pending": message = view.buildPendingList(toDoList);
				break;
			case "complete": message = view.buildCompletedList(toDoList);
				break;
			default: message = ("Use 'full', 'pending', or 'complete' to view the respective list.");
		}

		System.out.println(message);
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