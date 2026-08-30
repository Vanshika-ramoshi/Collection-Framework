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
	a1.add(34);
    
     int num = 67;
	if(a1.contains(num)) {
		System.out.println("Present");
	}else {
		System.out.println("No this element is not present in list");
	}

//	System.out.println(a1);

	for (Integer a2 : a1) {
		System.out.println(a2);
		
	}
  }
}
