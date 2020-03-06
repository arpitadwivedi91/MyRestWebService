package com.niit.WAW.myrest;

public class country {

public country() {
		super();
	}
public country(int id, String countryName, long population) {
	super();
	this.id = id;
	this.countryName = countryName;
	this.population = population;
}
int id;
String countryName;
long population;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public long getPopulation() {
	return population;
}
public void setPopulation(long population) {
	this.population = population;
}

}
