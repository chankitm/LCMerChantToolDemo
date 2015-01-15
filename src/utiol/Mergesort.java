package utiol;

import java.text.RuleBasedCollator;
import java.util.ArrayList;
import java.util.List;

public class Mergesort {
	private List<String> productKeys;
	private List<String> helper;
	private RuleBasedCollator collationKey;
	private int number;
	private int counter;

	public List<String> sort(List<String> values, RuleBasedCollator collationKey) {
		this.productKeys = values;
		this.collationKey = collationKey;
		number = values.size();
		this.helper = new ArrayList<String>();
		this.counter = 0;
		mergesort(0, number - 1);
		
		System.out.println("Mergesort counter = "+counter);
		
		return this.productKeys;
	}

	private void mergesort(int low, int high) {
		System.out.println("mergesort,"+" low = "+low+" high = "+high);
		counter++;
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			mergesort(low, middle);
			// Sort the right side of the array
			mergesort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {
		System.out.println("merge "+", low = "+low+", middle = "+middle+", high = "+high);

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			// helper[i] = productKeys[i];
			System.out.println("merge copy"+", low = "+low+", i = "+i+", high = "+high);
			System.out.println("merge copy"+", helper.size() = "+helper.size()+", productKeys.size() = "+productKeys.size());
//			helper.set(i, productKeys.get(i));
			helper.add(productKeys.get(i));
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			// (collationKey.compare(productKeys.get(j-1), toInsert ) > 0)
			// if (helper[i] <= helper[j]) {
			if (collationKey.compare(productKeys.get(j), productKeys.get(i)) >= 0) {
//				productKeys[k] = helper[i];
				productKeys.set(k, helper.get(i));
				i++;
			} else {
//				productKeys[k] = helper[j];
				productKeys.set(k, helper.get(j));
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
//			productKeys[k] = helper[i];
			productKeys.set(k, helper.get(i));
			k++;
			i++;
		}

	}
}