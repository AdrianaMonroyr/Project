package src;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {
private String name;
private double price;
private int amount; 

	

public String getname() {
	return name;
}

public void setname(String name) {
	this.name = name;
}
public double getprice() {
	return price;
}

public void setprice(double price) {
	this.price = price;
}

public int  getamount() {
	return amount;
}

public void setamount(int amount) {
	this.amount = amount;
}
public Ingredient(String name, double price, int amount) {
	this.name = name;
	this.price = price;
	this.amount= amount;
}	
	
;
}
