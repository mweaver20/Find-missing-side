package righTriangleSideFinder;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String side1, side2, results;
		int side1Length, side2Length, AB, AC, BC;
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		
		System.out.println("Please enter the name of the first side");
		side1 = input.next();
		System.out.println("Please enter the length of the first side");
		side1Length = input.nextInt();
		System.out.println("Please enter the name of the second side");
		side2 = input.next();
		System.out.println("Please enter the length of the second side");
		side2Length = input.nextInt();
		
		myMap.put(side1, side1Length);
		myMap.put(side2, side2Length);
		
		
		if(!side1.equals("AB") && !side2.equals("AB")) {
			AC = myMap.get("AC");
			BC = myMap.get("BC");
			AB = (int) Math.sqrt((AC * AC) - (BC * BC));
			results = "AB: " + AB;
			System.out.println(results);
			
		} else if(!side1.equals("AC") && !side2.equals("AC")) {
			AB = myMap.get("AB");
			BC = myMap.get("BC");
			AC = (int) Math.sqrt((AB * AB) + (BC * BC));
			results = "AC: " + AC;
			System.out.println(results);
			
		} else if(!side1.equals("BC")  && !side2.equals("BC")) {
			AB = myMap.get("AB");
			AC = myMap.get("AC");
			BC = (int) Math.sqrt((AC * AC) - (AB * AB));
			results = "BC: " + BC;
			System.out.println(results);
			
		}
		input.close();
	}

}
