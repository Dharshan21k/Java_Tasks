package Sets;
// maintains insertion order,uses doubly linked list,allow one null value
import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String args[]) {
		LinkedHashSet<String> linkedSet=new LinkedHashSet<>();// add,search,delete O(1)
		linkedSet.add("Apple");
		linkedSet.add(null);
		linkedSet.add("orange");
		linkedSet.add("aa");
		linkedSet.add(null);
		linkedSet.add(null);
		System.out.println(linkedSet);
	}

}
