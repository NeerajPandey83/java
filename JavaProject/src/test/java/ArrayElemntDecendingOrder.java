import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayElemntDecendingOrder {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(50);
		list.add(80);
		list.add(20);
		list.add(60);
		list.add(40);
		list.add(30);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
