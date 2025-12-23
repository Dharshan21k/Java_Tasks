package Maps;
//it has key and value pair ,key can not be duplicate and  allows one null key,does not maintain insertion order
import java.util.HashMap;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hashMap=new HashMap<>();//put,delete,get O(1)
		hashMap.put(1,1+1);
		hashMap.put(2,2+2);
		hashMap.put(-1, null);
		hashMap.put(null, null);
		hashMap.put(0, null);
		System.out.println(hashMap);
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "C");
		map.put(1, "A");
		map.put(2, "B");
		
		System.out.println(map);
	}

}
