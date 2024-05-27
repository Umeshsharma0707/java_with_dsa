package collections;

import java.util.Objects;

public class Students {
	String name;
	int rollNo;
	
	public Students(String name, int rollNo){
		
		this.name = name;
		this.rollNo = rollNo;
		
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNo=" + rollNo + "] \n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return rollNo == other.rollNo;
	}
	
	
	
}	
