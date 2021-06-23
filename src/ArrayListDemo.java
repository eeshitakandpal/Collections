import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList <String> obj = new ArrayList <String>();
		String sobj1 = String.valueOf("Element 1");
		String sobj2 = String.valueOf("Element 2");
		String sobj3 = String.valueOf("Element 3");
		String sobj4 = String.valueOf("Element 4");

		System.out.println("Size of ArrayList is :"+obj.size());

		obj.add(sobj1);
		obj.add(sobj2);
		obj.add(sobj3);
		obj.add(sobj4);

		System.out.println("\nArrayList after adding the objects :"+obj);
		System.out.println("Size of ArrayList after adding the objects :"+obj.size());

		obj.remove(2);
		obj.remove(sobj4);

		System.out.println("\nArrayList after removing the objects :"+obj);
		System.out.println("Size of ArrayList after removing the objects :"+obj.size());

		System.out.println("\nThe final ArrayList is :");
		ListIterator<String> i = obj.listIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
