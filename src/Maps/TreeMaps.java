package Maps;
//it does not follow any insertion order,it always sort the element ,it follows red black tree
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String args[]) {
		TreeMap<Integer,String> treeMap=new TreeMap<>();//it sorts by keys,time complexity O(log n)
		treeMap.put(1,"Apple");
		treeMap.put(-1,"Banana");
		treeMap.put(-8,"ZZZZZZZZZ");
		System.out.println(treeMap);//op {-8=ZZZZZZZZZ,-1=Banana,1=Apple}
	}

}
