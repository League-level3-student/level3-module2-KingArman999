package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
		if (eggs.get(i).equalsIgnoreCase("cracked")) {
			return i;
		}
		}
		return 0;
	}
	public static int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
		if (oysters.get(i).equals(true)) {
			return i;
		}
		}
		return 0;
	}
	public static double findTallest(List<Double> peeps) {
		double biggest = 0;
		for (int i = 0; i < peeps.size(); i++) {
		if (peeps.get(i)>biggest) {
			biggest = peeps.get(i);
		}
		return biggest;
		}
		return 0;
	}
}
