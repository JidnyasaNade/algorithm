
package topics.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author manjulkar_a 
 * Problem : One number out of all continuous numbers is
 *         duplicated within the array find the number.
 */
public class FindADuplicateInSequencialArray {

	public static void main(String[] args) {
		Integer[] a = { 1, 0, 2, 3,6,9,0,3};
		findDup(a);
	}

	private static void findDup(Integer[] a) {
		
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> l = Arrays.asList(a);
		List<Integer> duplicateNum = new ArrayList<>();
		
		for (Integer integer : l) {
			
			if(set.contains(integer)){
				duplicateNum.add(integer);
			}else{
				set.add(integer);
			}
		}
		
		System.out.println(duplicateNum);
	}

}
