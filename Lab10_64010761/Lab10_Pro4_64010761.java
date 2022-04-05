import java.util.ArrayList;
import java.util.Scanner;

public class Lab10_Pro4_64010761 {
    public static void main(String[] args) {
		// Create three ArrayLists
		ArrayList<Double> assistant = new ArrayList<>();
		ArrayList<Double> associate = new ArrayList<>();
		ArrayList<Double> full = new ArrayList<>();

		// Read data from url
		try {
			java.net.URL url = new java.net.URL("file:///C:/NINE/KMITL_YEAR_1/OOP_Java_2022/Lab10_64010761/Salary.txt");
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext()) {
				String[] line = (sc.nextLine()).split(" ");
				processData(assistant, associate, full, line[2], new Double(line[3]));
			}
		}
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
			System.exit(0);
		}
		catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
			System.exit(1);
		}

		// Compute totals
		double totalAssistant = getTotal(assistant);
		double totalAssociate = getTotal(associate);
		double totalFull = getTotal(full);
		double totalFaculty = (totalAssistant + totalAssociate + totalFull);

		// Display results
		System.out.println("\n   Total salary");
		System.out.println("---------------------");
		System.out.printf("Assistant professors: $%.2f\n", totalAssistant);
		System.out.printf("Associate professors: $%.2f\n", totalAssociate);
		System.out.printf("Full professors:      $%.2f\n", totalFull);
		System.out.printf("All faculty:          $%.2f\n", totalFaculty);

		System.out.println("\n   Average salary");
		System.out.println("---------------------");
		System.out.printf("Assistant professors: $%.2f\n", 
			(totalAssistant / assistant.size()));
		System.out.printf("Associate professors: $%.2f\n", 
			(totalAssociate / associate.size()));
		System.out.printf("Full professors:      $%.2f\n", 
			(totalFull / full.size()));
		System.out.printf("All faculty:          $%.2f\n", 
			(totalFaculty / (assistant.size() + associate.size() + full.size())));
	}

	//Return the sum of the elements in an ArrayList
	public static double getTotal(ArrayList<Double> list) {
		double total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		return total;
	}

	// Add Salaries to the corresponding rank
	public static void processData(ArrayList<Double> a, ArrayList<Double> b, 
		ArrayList<Double> c, String rank, double salary) {
		if (rank.equals("assistant")){
			a.add(salary); 
		}
		else if (rank.equals("associate"))
			b.add(salary);
		else if (rank.equals("full"))
			c.add(salary);
	}
}
