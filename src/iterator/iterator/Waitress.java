package iterator.iterator;

import iterator.tradition.MenuItem;

import java.util.ArrayList;

public class Waitress {

	private ArrayList<Iterator> iterators = new ArrayList<>();
	
	public Waitress(){
		
	}

	public void addIterators(Iterator iterator) {
		iterators.add(iterator);
	}
	
	public void printMenu(){
		Iterator iterator;
		MenuItem menuItem;
		for(int i = 0; i<iterators.size();i++){
			iterator = iterators.get(i);
			
			while(iterator.hasNext()){
				menuItem = (MenuItem) iterator.next();
				System.out.println(menuItem.getName()+"***"+menuItem.getPrice()+"***"+menuItem.getDescription());
			}
		}
	}
	
	
}
