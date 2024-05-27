package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		
		ArrayList<String> studentsName = new ArrayList<String>();
		
		studentsName.add("umesh"); // .add() is used to add elements in list
 		studentsName.add("mahesh");
		studentsName.add("ram");
		
		studentsName.set(1, "rakesh"); // to change element of index
		
		System.out.println(studentsName);
		
		List<String> newList = new ArrayList<String>();
		
		newList.add("abcd"); 
		
		newList.addAll(studentsName); // to merge two list or add bunch of elements
		
		System.out.println(newList);
		
		System.out.println(studentsName.get(0)); // to get element of index
		
		System.out.println(studentsName.remove(String.valueOf("umesh"))); // to remove
		System.out.println(studentsName);
		
		studentsName.contains("maheshh");
		
		studentsName.clear(); // to clear whole list
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) { 
			System.out.println("element is : " + list.get(i));
		}
		for(Integer e : list) {
			System.out.println(e);
		}
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println("iterator " + it.next());
		}
		
		
	}
}
