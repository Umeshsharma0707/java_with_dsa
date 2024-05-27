package collections;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
	public static void main(String[] args) {
		
		Set<Students> st = new HashSet<Students>();
		
		st.add(new Students("umesh", 10));
		st.add(new Students("rakesh", 35));
		st.add(new Students("umesh", 10));
		
		System.out.println(st);
		
		
	}
}
