package partsPackage;

import java.util.HashMap;
import java.util.Map;

public class ItemSorter {

	
	public static  HashMap<Integer, Item> sortItems(  Map <Integer, Item> unsorted , String key) {
	    HashMap<Integer, Item> sorted_items = new HashMap<Integer, Item>();

		for ( int i  = 0; i < unsorted.size(); i++) { // for the number of items 
			String[] split_name = unsorted.get(i).getName().split(" ");
			int id =0;
			for( int m =0; m<split_name.length; m++) {// for the length of the current item
				String current_word = split_name[m];
				if(current_word == key) {
					sorted_items.put(id, unsorted.get(i));
					id++;
					break;
				}
				
				
			}
				
		}
		
		return sorted_items;
		
	}
}
