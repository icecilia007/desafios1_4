import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		  try {
	            try (BufferedReader br = new BufferedReader(new FileReader(new File("file.txt")))) {
	                String line;
	                int n = Integer.parseInt(br.readLine());

	                for (int i = 0; i < n; i++) {
	                    line = br.readLine();

	                    int halfLength = line.length() / 2;

	                    String unscrambledLine = unscramble(line);
	                    System.out.println(unscrambledLine);
	                }

	                br.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	         }

	}
	private static String unscramble(String line) {
        StringBuilder leftHalf = new StringBuilder();
        StringBuilder rightHalf = new StringBuilder();

        int middleIndex = line.length() / 2;

        for (int i = 0; i < middleIndex; i++) {
            rightHalf.append(line.charAt(i));
        }

        for (int i = middleIndex; i < line.length(); i++) {
            leftHalf.append(line.charAt(i));
        }

        return rightHalf.reverse().toString() + leftHalf.reverse().toString();
    }

}
