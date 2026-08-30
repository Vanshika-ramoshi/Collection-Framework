package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
    //copy all elements pne list to another list
List<Integer> a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(30);
		a1.add(20);
		a1.add(40);
//	System.out.println(a1.reversed());//reverse element of list

		List<Integer> a2 = new ArrayList();
		a2.add(10);
		a2.add(20);
		a2.add(10);
		a2.add(30);
		a2.add(20);
		a2.add(40);
		a2.addAll(a2);
		// Collections.copy(a2, a1);
		System.out.println(a2);
  }
}
