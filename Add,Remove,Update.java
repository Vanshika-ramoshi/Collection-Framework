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

	// Collections.sort(a1);
	// Collections.reverse(a1);
	// Collections.swap(a1, 1 , 0);//index 12,67--->67,12

	// System.out.println(a1.size());//size of a list

	System.out.println("first element =" + a1.get(0));
	System.out.println("last element ="+a1.get(3));
}
}
