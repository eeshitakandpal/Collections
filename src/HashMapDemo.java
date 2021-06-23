import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <String, Integer> obj = new HashMap <String, Integer>();
		
		System.out.println("Size of HashMap is :"+obj.size());
		
		Scanner sc = new Scanner(System.in);
        try{
        	for (int i = 0; i < 2; i++) {
            
        		System.out.println("Enter Key(String) :");
        		String b = sc.next();
            	System.out.println("Enter Value(Integer) :");
            	Integer a = sc.nextInt();

            	obj.put(b, a);
        	}

        	obj.forEach((k, v) -> System.out.printf( "%s : %d \n" , k,v) );
        }
        finally {
        	sc.close();
        }
        
        System.out.println("\nHashMap after adding the objects :"+obj);
		System.out.println("Size of HashMap after adding the objects :"+obj.size());
		
        Integer iobj1 = Integer.valueOf(114);
		Integer iobj2 = Integer.valueOf(111);

		obj.put("L1", iobj1);
		obj.put("L2", iobj2);

		System.out.println("\nHashMap after adding the objects :"+obj);
		System.out.println("Size of HashMap after adding the objects :"+obj.size());

		obj.remove("L1");
		
		System.out.println("\nHashMap after removing the objects :"+obj);
		System.out.println("Size of HashMap after removing the objects :"+obj.size());

		System.out.println("\nThe final HashMap is :");
		obj.forEach((k, v) -> System.out.printf( "%s : %d \n" , k,v) );

	}

}
