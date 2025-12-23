package Sets;
//does not maintains insertion order,sort all elements and uses red black tree does not allow null values
import java.util.TreeSet;

public class TreeSets {
	public static void main(String[] args) {
	TreeSet<Integer> treeSet=new TreeSet<>();//add,delete,serach O(log n)
	treeSet.add(10);
	treeSet.add(9);
	//treeSet.add(null);
	treeSet.add(-1);
	System.out.println(treeSet); //op [-1,9,10]
	

}
}
