package Maps;
//always follow insertion order
import java.util.LinkedHashMap;

public class LinkedHashMaps {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();//put,get O(1)
		linkedHashMap.put(null, " no fruit");
		linkedHashMap.put(2,"Apple");
		linkedHashMap.put(1, null);
		linkedHashMap.put(-1,"orange");
		System.out.println(linkedHashMap);//op {null=no fruit,2=Apple,1=null,-1=orange}
		
	}

}
