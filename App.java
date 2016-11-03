class App {
	public static void main(String[] args) {
		String[] itemArray = {"buy groceries", "walk the dog"};
		ToDoList myToDoList = new ToDoList("My ToDo", itemArray);
		ListController myController = new ListController(myToDoList);

		myController.addItem("eat dinner");
		myController.showList("fdsa");
		myController.deleteItem(3);
		myController.showList("full");
		myController.showList("complete");
		myController.showList("pending");

		// TODO: Allow user input. Program start brings up "What do you want to do?" dialogue
	}
}