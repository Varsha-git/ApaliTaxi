package controller;

import java.util.Scanner;

import model.Mini;
import model.Sedan;
import model.Suv;
import service.Calculate;

public class Main {

	public static void main(String[] args) {

		System.out.println("WELCOME TO AAPLI  TAXI");
		int choice;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter your choice :");
			System.out.println("1.Mini Taxi \t 2. Sedan \t 3. SUV ");
			choice = sc.nextInt();
			int distance;
			Mini miniobj = null;
			Sedan sedanobj = null;
			Suv suvobj = null;
			Calculate calobj = new Calculate();
			switch (choice) {

			case 1:
				System.out.println("Enter your Distance in km");
				distance = sc.nextInt();
				miniobj = new Mini(distance);
				double cost = calobj.calculateCost(distance);
				System.out.println(cost);
				break;
			case 2:
				System.out.println("Enter your Distance in km");
				distance = sc.nextInt();
				// sedanobj.setDistance(distance);
				sedanobj = new Sedan(distance);
				cost = sedanobj.calculateCost(distance);
				System.out.println(cost);
				break;
			case 3:
				System.out.println("Enter your Distance in km");
				distance = sc.nextInt();
				if (distance < 75) {
					suvobj = new Suv(distance);
					cost = suvobj.calculateCost(distance);
					System.out.println(cost);
				} else {
					System.out.println("Not allowed");
				}
				break;

			}
		}

	}

}
