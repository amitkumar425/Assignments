//This is the Driver class implementing the class called Laptop.java,Car.java,Television.java,
//CellPhone.java and School.java.
//It creates the objects of each class and tries to add them to different classes under 
//the collection framework and print them via different approaches

package com.capgimeni.collectionClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTester {

	public static void main(String[] args) {

		// Creating the list object to store the objects of different types
		List list = new ArrayList();

		// Creating the multiple objects of various class
		Laptop hp = new Laptop("HP", "HpPavelion", "Windows", "Intel");
		Laptop dell = new Laptop("DELL", "DellInspiron", "Windows", "Intel");
		Laptop lenovo = new Laptop("Lenovo", "LenovoThinkPad", "Windows", "Intel");

		Car alto = new Car("Suzuki", "alto800", 2000, 1_50_000);
		Car dezire = new Car("Suzuki", "SwiftDezire", 2007, 4_50_000);
		Car tatasumo = new Car("Mahindra", "MahindraTataSumo", 1990, 5_50_000);

		Television philips = new Television("PHILIPS", "LCD", false, 10_000);
		Television onida = new Television("ONIDA", "LED", false, 9_000);
		Television lg = new Television("LG", "PLASMA", true, 30_000);

		CellPhone nokia = new CellPhone("NOKIA", "nokia3310", "Nokia 3310 is very Durable phone", "Symbian", 2_500);
		CellPhone samsung = new CellPhone("SAMGUNG", "J7 PRO", "Samsung J7 PRO is a Samrt phone", "Anaroid", 20_500);
		CellPhone mi = new CellPhone("MI MAX PRIME", "MI MAX", "MI MAX PRIME is very Good Smart phone", "Anaroid",
				20_500);

		School dav = new School("DAV", "KHAGARIA", "KHAGARIA", 10);
		School dps = new School("DPS", "BOKARO", "BOKARO STEEL CITY", 5);
		School chinmaya = new School("Chinmaya Vidyalaya", "BOKARO", "BOKARO STEEL CITY", 1);

		// Adding the objects to the list
		list.add(chinmaya);
		list.add(dps);
		list.add(dav);

		list.add(mi);
		list.add(samsung);
		list.add(nokia);

		list.add(lg);
		list.add(onida);
		list.add(philips);

		list.add(tatasumo);
		list.add(dezire);
		list.add(alto);

		list.add(lenovo);
		list.add(dell);
		list.add(hp);

		// Printing the list item using forEach(Consumer c)
		list.stream().forEach(arg -> System.out.println(arg));

		// Creating the object of hashset to inset the duplicates and observe the
		// outputs
		Set hashset = new HashSet();

		// Creating some duplicate objects
		Laptop hpequal = new Laptop("HP", "HpPavelion", "Windows", "Intel");
		Car altoequal = new Car("Suzuki", "alto800", 2000, 1_50_000);
		Television philipsequal = new Television("PHILIPS", "LCD", false, 10_000);
		CellPhone nokiaequal = new CellPhone("NOKIA", "nokia3310", "Nokia 3310 is very Durable phone", "Symbian",
				2_500);
		School davequal = new School("DAV", "KHAGARIA", "KHAGARIA", 10);

		// Adding the objects to the hashset
		hashset.add(chinmaya);
		hashset.add(dps);
		hashset.add(dav);
		hashset.add(davequal);

		hashset.add(mi);
		hashset.add(samsung);
		hashset.add(nokia);
		hashset.add(nokiaequal);

		hashset.add(lg);
		hashset.add(onida);
		hashset.add(philips);
		hashset.add(philipsequal);

		hashset.add(tatasumo);
		hashset.add(dezire);
		hashset.add(alto);
		hashset.add(altoequal);

		hashset.add(lenovo);
		hashset.add(dell);
		hashset.add(hp);
		hashset.add(hpequal);

		// Printing the hashset item using forEach(Consumer c)
		hashset.stream().forEach(arg -> System.err.println(arg));

		// Creating the object of LinkedHashSet() to insert the names of student of the
		// class
		Set linkedhashedset = new LinkedHashSet();

		// Adding the names to the linkedhashset
		linkedhashedset.add("Alfez Ullah");
		linkedhashedset.add("Amit Kumar");
		linkedhashedset.add("Mehul Sen Gupta");
		linkedhashedset.add("Subhomoy Sarkar");
		linkedhashedset.add("Abhiroop Biswas");
		linkedhashedset.add("Arijit Biswas");

		// Printing the contents of the linkedhashset using forEach(Consumer c)
		linkedhashedset.stream().forEach(arg -> System.out.println(arg));

		// Creating TreeSet() to insert the names of the student of our class
		Set treeset = new TreeSet();

		// Adding the names to the treeset
		treeset.add("Alfez Ullah");
		treeset.add("Amit Kumar");
		treeset.add("Mehul Sen Gupta");
		treeset.add("Subhomoy Sarkar");
		treeset.add("Abhiroop Biswas");
		treeset.add("Arijit Biswas");
		treeset.add("Alfez Ullah");

		// Printing the content of treeset using forEach(Consumer c)
		treeset.stream().forEach(obj -> System.out.println(obj));

		
		// Creating New Car Object to test the TreeSet() with overridden compareTo()
		Car mahindra = new Car("Dukati", "alto800", 2000, 1_50_000);

		
		// Creating new TreeSet() object to test the odering
		Set treesetofcar = new TreeSet<Car>();

		// Adding Car objects to TreeSet
		treesetofcar.add(alto);
		treesetofcar.add(tatasumo);
		treesetofcar.add(mahindra);
		
		//Printing the treesetofcar using overridden compareTo()
		treesetofcar.stream().forEach(t -> System.out.println(t));

		

		// Creating a HashMAp()
		Map map = new HashMap<String, String>();

		// Adding <key,value> to the map
		map.put("Amit", "Litchi");
		map.put("Mehul SenGupta", "Banana");
		map.put("Subhomoy Sarkar", "Oranges");
		map.put("Alfaiz Ullah", "Mangoes");

		// get() approach
		System.out.println(map.get("Amit"));
		System.out.println(map.get("Mehul SenGupta"));
		System.out.println(map.get("Subhomoy Sarkar"));
		System.out.println(map.get("Alfaiz Ullah"));

		// keySet() approach
		System.out.println(map.keySet());
		System.out.println(map.values());

		// entrySet() approach
		Set<Entry<String, String>> set = map.entrySet();
		set.stream().forEach(arg->System.out.println(arg));

	}

}
