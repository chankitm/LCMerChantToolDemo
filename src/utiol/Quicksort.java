package utiol;

import java.text.RuleBasedCollator;
import java.util.List;

public class Quicksort {
	List<String> productKeys;
	private int number;
	RuleBasedCollator collationKey;
	int counter;
	public List<String> sort(List<String> values, RuleBasedCollator collationKey) {
		// check for empty or null array
		if (values == null || values.size() == 0) {
			return null;
		}
		this.productKeys = values;
		this.collationKey = collationKey;
		this.counter = 0;
		number = values.size();
		quicksort(0, number - 1);
		System.out.println("Quicksort counter = "+counter);
		
		return this.productKeys;
	}

	private void quicksort(int low, int high) {
		this.counter++;
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		String pivot = productKeys.get(low + (high - low) / 2);

		// Divide into two lists
		while (i <= j) {
			// while (productKeys[i] < pivot) {
			while (collationKey.compare(pivot, productKeys.get(i)) > 0) {
				i++;
			}

			// while (productKeys[j] > ) {
			while (collationKey.compare(productKeys.get(j), pivot) > 0) {
				j--;
			}

			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		String temp = productKeys.get(i);
		productKeys.set(i, productKeys.get(j));
		productKeys.set(j, temp);
	}
}
