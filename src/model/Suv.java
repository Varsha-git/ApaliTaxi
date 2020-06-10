package model;

public class Suv extends Mini {

	public Suv(int distance) {
		super(distance);

	}

	public double calculateCost(int distance) {
		double cost = 0;
		int base = 100;
		int first = 5, fare = 15;
		int remdistance = distance - first;
		int calc = (remdistance * fare);
		// System.out.println(calc);
		cost = calc + base;
		return cost;
	}

}
