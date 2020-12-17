package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length-i; j++) {
				if (array[j-1] > array[j]) {
					num = array[j-1];
					array[j-1] = array[j];
					array[j] = num;
				}
			}
		}
	}
	
}
