package model;

public class Sedan extends Mini {

	public Sedan(int distance) {
		super(distance);
	}

	public double calculateCost(int distance) {

		// System.out.println("in sedan calculate=" + distance);

		double cost = 0;
		int base = 80;
		int first = 5, fare = 12;
		int remdistance = distance - first;
		int aftermilestones = 10;
		int milestonedist = 100;
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
