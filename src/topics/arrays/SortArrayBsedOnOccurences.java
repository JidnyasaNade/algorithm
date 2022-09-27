package topics.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayBsedOnOccurences {

	public static void main(String[] args) {
		int[] a = { 2, 2, 2, 4, 4, 4, 4, 4, 6, 7, 8, 8, 6, 0, 0, 0, 0, 0, 0,};

		// expected output = {0,0,0,0,0,0,4,4,4,4,4,2,2,2,6,6,8,8,7}

		sortArray(a);
	}

	@SuppressWarnings("unchecked")
	private static void sortArray(int[] a) {

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();

		List sortedList = new ArrayList<>(); 
		
		for (int i = 0; i < a.length; i++) {

			int occ = 1;

			if (map.get(a[i]) != null) {

				int newOcc = map.get(a[i]) + 1;
				map.put(a[i], newOcc);
			} else {
				map.put(a[i], occ);
			}

		}
		
		 map.entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	    .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
		
		System.out.println(reverseSortedMap);
		
			for (Map.Entry<Integer, Integer> entry : reverseSortedMap.entrySet()) {

				for (int j = 1; j <= entry.getValue(); j++) {
					
					sortedList.add(entry.getKey());

					}
				}

		System.out.println(sortedList);

	}

}
