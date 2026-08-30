package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(30);
		a1.add(20);
		a1.add(40);
	List<Integer> uniques= new ArrayList();
		// WAP remove duplicates
	for (Integer num : a1) {
		if(!uniques.contains(num)) {
			uniques.add(num);
			
		}
	}
	 System.out.println("Original List: " +  a1);
     System.out.println("After Removing Duplicates: " + uniques);
   }
}
