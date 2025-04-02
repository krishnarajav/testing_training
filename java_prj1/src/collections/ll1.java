package collections;
import java.util.LinkedList;
public class ll1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("red");
		ll.add("green");
		ll.add("blue");
		ll.add(1, "black");
		
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.removeFirst();
		System.out.println(ll);
	}

}
