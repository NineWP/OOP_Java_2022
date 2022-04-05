import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lab10_Pro3_64010761 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("Lab10_64010761/Salary.txt");
        String rank = "";
        double salary;

        try (
			// Create output file
			PrintWriter output = new PrintWriter(file);
		) {
			// Save data to file
			for (int i = 1; i <= 1000; i++) {
				output.print("FirstName" + i + " LastName" + i);
				rank = getRank();
				salary = getSalary(rank);
				output.printf(" " + rank + " %.2f\n", salary);
			}
		}
    }

    // this function will return random rank
    public static String getRank() {
		String[] ranks = {"assistant", "associate", "full"};
		return ranks[(int)(Math.random() * ranks.length)];
	}

	// this function will return random salary
	public static double getSalary(String rank) {
		if (rank.equals("assistant"))
			return  50000 + (double)(Math.random() * 30001);
		else if (rank.equals("associate"))
			return 60000 + (double)(Math.random() * 50001);
		else
			return 75000 + (double)(Math.random() * 55001); 
	}
}
