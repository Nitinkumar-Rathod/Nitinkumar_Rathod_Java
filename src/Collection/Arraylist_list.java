package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_list {

	public static void main(String[] args) {

		List al = new ArrayList();

		// 1. Add new elements/objects into Arraylist

		al.add("Nitin");
		al.add("Anil");
		al.add("Rathod");
		al.add(true);
		al.add(55.10);
		al.add('A');

		System.out.println(al); // [Nitin, Anil, Rathod, true, 55.1, A]

		// 2. size of given arraylist

		System.out.println("Size of arraylist is :- " + al.size());

		// 3. Remove the element

		al.remove(2);
		System.out.println(al); // [Nitin, Anil, true, 55.1, A]

		// 4. retrieve the data
		System.out.println(al.get(1));

		// 5. Updating existing element with new element :

		al.set(4, "Anil");
		System.out.println(al);  //[Nitin, Anil, true, 55.1, Anil]
		
		// 6. whether the arraylist is empty or not :
		
		System.out.println(al.isEmpty());
		
		// 7. inserting new elements into the existing arrayList
		al.add(1, "Python");
		System.out.println(al);         // [Welcome, Python, v, 105.2, java]  --> added element at mentioned index position
		
		al.add("C-sharp");
		System.out.println(al);      // [Welcome, Python, v, 105.2, java, C-sharp]   -->  added element at last
		
		//8. retriving the index of given element in the arraylist
		System.out.println("Index is : "+al.indexOf("Python"));      // Index is : 1
		
		// 9. contains 
		System.out.println(al);       // [Welcome, Python, v, 105.2, java, C-sharp]
		System.out.println( al.contains("Python"));    // true
		System.out.println( al.contains("python"));    // false

		System.out.println("Reading data using for each loop : ");
		
		for(Object values : al) {
			System.out.println(values);
		}
		
		System.out.println("Reading data using Iterator : ");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
	}
}