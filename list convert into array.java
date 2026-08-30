		package arrays;

		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.Collection;
		import java.util.Collections;
		import java.util.List;

		public class Practice {

			public static void main(String[] args) {
				//list converts into array
			 List<Integer> a1 = new ArrayList();
		
			a1.add(45);
			a1.add(67);
			a1.add(78);
			a1.add(90);
			a1.add(34);
			
			Integer[] arr = a1.toArray(new Integer[5]);
			
			for (int i : arr) {
				System.out.println(i);
			}
			}
		}
