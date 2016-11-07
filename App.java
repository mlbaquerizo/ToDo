class App {
	public static void main(String[] args) {
		String message;
		String[] itemArray = {"buy groceries", "walk the dog"};
		ToDoList myToDoList = new ToDoList("My ToDo", itemArray);
		ListController myController = new ListController(myToDoList);

		myController.addItem("eat dinner");

		if(args.length > 0){
			switch (args[0]){
				case "full": myController.showList("full");
					break;
				case "complete": myController.showList("complete");
					break;
				case "pending": myController. showList("pending");
					break;	
				default: System.out.println("Commands: full, complete, pending");
			}
		} else {
			System.out.print("Please use commands: full, complete, pending");
		}

		// TODO: Allow user input. Program start brings up "What do you want to do?" dialogue
	}
}