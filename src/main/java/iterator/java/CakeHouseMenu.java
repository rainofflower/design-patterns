package iterator.java;

import iterator.tradition.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class CakeHouseMenu {

	private ArrayList<MenuItem> menuItems;
	//private int position=0;

	public CakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("KFC Cake BreakFast", "boiled eggs&toast&cabbage", true, 3.99f);
		addItem("MDL Cake BreakFast", "fried eggs&toast", false, 3.59f);
		addItem("Stawberry Cake", "fresh stawberry", true, 3.29f);
		addItem("Regular Cake BreakFast", "toast&sausage", true, 2.59f);
	}
	
	public void addItem(String name, String description, boolean vegetable,
			float price){
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		menuItems.add(menuItem);
	}

	public Iterator getIterator(){
		return menuItems.iterator();
	}

}
