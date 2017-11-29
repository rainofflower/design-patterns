package compose;

import java.util.ArrayList;
import java.util.Iterator;

public class SubMenu extends MenuComponent {
	private ArrayList<MenuComponent> menuItems;
	
	public SubMenu(){
		menuItems = new ArrayList<>();
		addItem("Apple Cookie", "Apple&candy&Cookie", true, 1.99f);
		addItem("Banana Cookie", "Banana&candy&Cookie", false, 1.59f);
		addItem("Orange Cookie", "Orangle&candy&Cookie", true, 1.29f);
	}
	
	private void addItem(String name, String description, boolean vegetable,
			float price){
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		menuItems.add(menuItem);
	}
	
	public Iterator getIterator(){
		return new ComposeIterator(menuItems.iterator());
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("****This is SubMenu****");
	}
}
