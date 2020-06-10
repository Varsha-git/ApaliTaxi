package service;

public class Calculate {

	public double calculateCost(int distance) {

		double cost = 0;
		int base = 50;
		int first = 3, fare = 10;
		int remdistance = distance - first;
		int aftermilestones = 8;
		int milestonedist = 75;
		if (distance < milestonedist) {
			int calc = (remdistance * fare);
			// System.out.println(calc);
			cost = calc + base;
		} else {
			cost = distance * aftermilestones;
		}
		return cost;
	}

}
