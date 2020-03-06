package com.niit.WAW.myrest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class countryService {
static HashMap<Integer,country>countryIdMap=getCountryIdMap();
countryService()
{
	if(countryIdMap==null)
	{
		countryIdMap=new HashMap<Integer,country>();
		country India=new country(1,"India",10000);
		country Nepal=new country(2,"Nepal",10000);
		country SouthKorea=new country(3,"South Korea",10000);
		country UK=new country(4,"U.K.",10000);
		countryIdMap.put(1, India);
		countryIdMap.put(2, Nepal);
		countryIdMap.put(3, SouthKorea);
		countryIdMap.put(4, UK);
	}}
	public List getAllCountries()
	{
		List countries=new ArrayList(countryIdMap.values());
		return countries;
		
	}
	public country getCountry(int id)
	{
		country country=countryIdMap.get(id);
		return country;
		
	}
	public country addCountry(country country)
	{
		country.setId(countryIdMap.size()+1);
		countryIdMap.put(country.getId(),country);
		return country;
		
	}
	public country UpdateCountry(country country)
	{
		if(country.getId()<=0)
			countryIdMap.put(country.getId(), country);
			return null;
		
	}
	public void deleteCountry(int id) {
		countryIdMap.remove(id);
		
	}
	public static HashMap<Integer,country>getCountryIdMap()
	{
		return countryIdMap;
	}
}

