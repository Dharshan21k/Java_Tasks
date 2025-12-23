package Sets;
//does not allow duplicates,no index based access because it uses hashing,no order insertion based hash value,accept one null value
import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();// add,delete,search O(1) because it depends on hashed value
		hashSet.add("ss");
		hashSet.add("hii");
		hashSet.add("aa");
		hashSet.add("ab");
		hashSet.add("hi");
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet); //the op will be [ss,aa,ab,,hi,hii,null] becuase while hasing the aa wil be at front 
		HashSet<Integer> hashInteger=new HashSet<>();
		hashInteger.add(10);
		hashInteger.add(5);
		hashInteger.add(20);
		hashInteger.add(1);
		System.out.println(hashInteger);//[1,20,5,10]
		//contains,clear all method are same as list
		
		
		
		
	}

}
