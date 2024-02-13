package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class RadioandCircunferece_V1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter Radius");
		double radius = sc.nextDouble();
		double c = circumference(radius);
		double v = volume(radius);
		System.out.printf("Cimcunference: %5.2f%n",c);
		System.out.printf("Volume: %5.2f%n",v);
	
	
}
