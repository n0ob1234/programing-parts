package partsPackage;

import java.util.HashMap;
import java.util.Map;

public class Item {

	String name;
	double cost;
	public Item(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
