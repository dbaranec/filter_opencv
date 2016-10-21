import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		File file = new File(args[0]);
		PrintWriter writer = new PrintWriter("out.txt", "UTF-8");

		Scanner inputFile = new Scanner(file);
		// vypis cisel vecsich ako hodnota highest
		String var = args[1];
		double highestZ = Double.parseDouble(var);
		String data = "";
		int count = 0;
		while (inputFile.hasNext()) {
			int x = inputFile.nextInt();
			int y = inputFile.nextInt();
			double numberZ = inputFile.nextDouble();

			if (count != x)
				writer.println();

			count = x;
			
			if (numberZ < highestZ) {
				writer.print(x);
				writer.print("\t" + y);
				writer.println("\t" + numberZ);

			}

		}

		// Close file
		inputFile.close();

	}
}
