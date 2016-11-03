import java.util.*;
public class ToDoList {
	private List<ListItem> list = new ArrayList<ListItem>();
	private String name;

	public ToDoList(String... items){
		this();
		for(String item : items){
			ListItem newItem = new ListItem(item);
			addItem(newItem); 
		}
	}

	public ToDoList(String n, String... items){
		this(items);
		name = n;
	}

	public ToDoList(String n){
		this();
		name = n;
	}

	public ToDoList(){
		super(); 
	}

	public List<ListItem> getList(){
		return list;
	}

	public String getName(){
		return name;
	}

	public void setName(String n){
		name = n;
	}

	public void addItem(ListItem i){
		list.add(i);
	}

	public void addItem(String s){
		ListItem newItem = new ListItem(s);
		list.add(newItem);
	}

	public void completeItem(int itemPos){
		if(itemPos >= 1){
			try{
				int itemPosAdj = itemPos - 1;
				ListItem item = (ListItem) list.get(itemPosAdj);
				if(!item.isComplete()){
					item.setStatus(true);
				} else {
					System.out.println("Item #" + itemPos + " is already complete!");
				}

			} catch(IndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} else {
			System.out.println("Choose a list number from 1 through " + list.size());
		}
	}

	public void deleteItem(int itemPos){
		if(itemPos >= 1){
			try{
				int itemPosAdj = itemPos - 1;
				this.list.remove(itemPosAdj);
			} catch(IndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} else {
			System.out.println("Choose a list number from 1 through " + list.size());
		}
	}

}