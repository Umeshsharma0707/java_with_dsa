package collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for(int i = 1; i <=5; i++) {
			arrList.add(i);  // add() : to add elements
		}
		
		System.out.println(arrList);
		
		// to change elements
		
		arrList.set(2, 5); // set(index, element) : to change element at specified index
		
		System.out.println(arrList);
		
		// to remove specific element 
		arrList.remove(Integer.valueOf(5));
		
		System.out.println(arrList);
		
		arrList.remove(2); // .remove(index): to remove element of specific index
		System.out.println(arrList);
		
		
		// to get elements from arrayList
		
		System.out.println(arrList.get(2));;
		
		//iterations of arrayList
		// for loop
		System.out.println("for loop");
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " , ");
		}
		System.out.println();
		
		// for each loop
		System.out.println("for each loop");
		for(Integer element : arrList) {
			System.out.println(element);
		}
		// iterator 
		System.out.println("iterating using iterator");
		Iterator<Integer> it = arrList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		arrList.clear();
		
		arrList.addAll(arrList);
	
		System.out.println(arrList);
}
}
