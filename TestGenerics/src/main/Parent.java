package main;

import java.util.ArrayList;
import java.util.List;

public class Parent extends Human {
	private List<Child> children;
	
	public Parent() {
		children = new ArrayList<>();
	}
	
	public Parent(List<Child> children) {
		children = new ArrayList<>();
		children.addAll(children);
	}
	
	public void addChild(Child child) {
		children.add(child);
	}
	
	public void removeChild(Child child) {
		children.remove(child);
	}
}
