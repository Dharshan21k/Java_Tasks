package Lists;
//fast access,allow duplicate elements and uses dynamic array
import java.util.ArrayList;

public class ArrList {
	public static void main(String args[]) {
		//inserted in order and allow more than one null value too
			ArrayList<Integer> arrayList=new ArrayList<>();
			arrayList.add(1);
			arrayList.add(2);
			arrayList.add(3);
			arrayList.add(null);
			arrayList.add(null);//O(1) adding element at end
			System.out.println(arrayList);
			//contains return an boolean value best case o(1) but worst case O(n) maybe element in last will be matching
			if(arrayList.contains(3)) {
				System.out.println("element found");
				
			}
			System.out.println("element based on index:"+arrayList.get(2));// O(1) because inside this method have return arrList[index]
			//clear
			arrayList.clear();// O(n) because it is clearing all element in arraylist
			
			
			System.out.println(arrayList);// this will print empty list
	}

}
