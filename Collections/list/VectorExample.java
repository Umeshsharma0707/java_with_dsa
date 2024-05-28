package collections.list;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(1);
		v.add(10);
		v.add(43);
		v.add(76);
		v.add(35);
		System.out.println(v);
		
		System.out.println(v.get(2));
		System.out.println(v.size());
		v.remove(2);
		
//		System.out.println(v.removeAll(v));
		System.out.println(v.size());
		v.add(90);
		v.add(400);
		System.out.println(v);
		v.set(2, 99);  // used to replace the element
		System.out.println(v);
		v.insertElementAt(55, 2); // used to insert the element at desired place	
		System.out.println(v);
		System.out.println(v.size());
		
	}
}
