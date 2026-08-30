package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {

	public static void main(String[] args) {

	ArrayList<Integer> a1 = new ArrayList();

	a1.add(45);
	a1.add(67);
	a1.add(78);
	a1.add(90);
	a1.add(34); //add
	a1.set(0, 12);// update
	a1.remove(2); //remove 

	Collections.sort(a1);
	Collections.reverse(a1);
	Collections.swap(a1, 1 , 0);//index 12,67--->67,12

	System.out.println(a1.size());//size of a list

	System.out.println("first=" + a1.get(0));
	System.out.println("last ="+a1.get(3));

//	 int num = 67;
//	if(a1.contains(num)) {
//		System.out.println("Present");
//	}else {
//		System.out.println("No this element is not present in list");
//	}

//	System.out.println(a1);

//	for (Integer a2 : a1) {
//		System.out.println(a2);
//		
//	}
//		List<Integer> a1 = new ArrayList();
//		a1.add(10);
//		a1.add(20);
//		a1.add(10);
//		a1.add(30);
//		a1.add(20);
//		a1.add(40);
//	System.out.println(a1.reversed());//reverse element of list

//		List<Integer> a2 = new ArrayList();
//		a2.add(10);
//		a2.add(20);
//		a2.add(10);
//		a2.add(30);
//		a2.add(20);
//		a2.add(40);
//		a2.addAll(a2);
//		Collections.copy(a2, a1);
//		System.out.println(a2);

//	List<Integer> uniques= new ArrayList();

		// WAP remove duplicates
//	for (Integer num : a1) {
//		if(!uniques.contains(num)) {
//			uniques.add(num);
//			
//		}
//	}
//	 System.out.println("Original List: " +  a1);
//     System.out.println("After Removing Duplicates: " + uniques);

		
		
		//list converts into array
//	 List<Integer> a1 = new ArrayList();
//
//	a1.add(45);
//	a1.add(67);
//	a1.add(78);
//	a1.add(90);
//	a1.add(34);
//	
//	Integer[] arr = a1.toArray(new Integer[5]);
//	
//	for (int i : arr) {
//		System.out.println(i);
//	}
	}

}
