package com.java.practice.MapInterface;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
public class SortedMapEx2 {

	private static Object s;

	public static void main(String[] args) {
		SortedMap<String,String> stm = new TreeMap();
		stm.put("String","str");
		stm.put("Array", "arr");
		stm.put("character", "char");
		stm.put("integer", "int");
		stm.put("boolean", "bl");
		stm.put("float","f");
		stm.put("double","d");
		stm.put("short", "s");
		stm.put("long", "l");
		stm.put("byte", "b");
System.out.println(stm);
		
		//Iterator itr =  itr.iterator();
		
System.out.println(stm.entrySet());//Returns a Set view of the mappings contained in  map with  Square brackets.
		
System.out.println(stm.firstKey()); //it return first key present in the map
		
System.out.println(stm.headMap("integer"));//it return  the portion of this map whose keys are  less than toKey
		
System.out.println(stm.keySet());// it return the set key contained in the map
		
System.out.println(stm.lastKey()); // it returns the last key present in the map
		
System.out.println(stm.subMap("double","short"));//it returns the portion of the map whose keys range fromKey, inclusive, to toKey, exclusive.

System.out.println(stm.tailMap("byte"));

System.out.println(stm.values());

System.out.println(stm.containsKey("String"));

System.out.println(stm.containsValue("Strings"));

TreeMap<String,String> tm = new TreeMap();
System.out.println(stm.equals(tm));

System.out.println(stm.get("integer"));

tm.putAll(stm);
System.out.println(tm);

System.out.println(stm.size());

System.out.println(stm.replace("Array", "arr","ar"));
System.out.println(stm);

System.out.println(stm.remove("Array"));
System.out.println(stm);

System.out.println(stm.getOrDefault("String","arr" ));

stm.clear();
System.out.println(stm.isEmpty());
		// TODO Auto-generated method stub

	}

}
