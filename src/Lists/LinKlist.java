package Lists;
//maintain insertion order,allow duplicates,uses Doubly linkedlist
import java.util.LinkedList;

public class LinKlist {
	public static void main(String args[]) {
		LinkedList<Integer> linkedList=new LinkedList<>();//fast insertion and deletion
		linkedList.add(1);//O(1)
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(4);
		linkedList.add(null);
		System.out.println(linkedList.peek());// return first element
		System.out.println(linkedList);
		linkedList.clear();
		System.out.println(linkedList);
		
	}

}
