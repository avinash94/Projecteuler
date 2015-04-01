import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class solution67 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(new File(
				"C:/Users/MA/Desktop/p067_triangle.txt")));
		int triangle[][] = { { 0 }, { 0 } };
		int lines = 0;
		String s;
		while ((s = br.readLine()) != null)
			lines++;

		BufferedReader br_ = new BufferedReader(new FileReader(new File(
				"C:/Users/MA/Desktop/p067_triangle.txt")));
		int j = 0;
		String strLine[] = new String[lines];
		triangle = new int[lines][lines];
		while ((s = br_.readLine()) != null) {
			strLine = s.split(" ");
			for (int i = 0; i < strLine.length; i++) {
				triangle[j][i] = Integer.parseInt(strLine[i]);
			}
			j++;
		}

		for (int i = lines - 2; i >= 0; i--) {
			for (int k = 0; k <= i; k++) {
				triangle[i][k] += Math.max(triangle[i + 1][k],
						triangle[i + 1][k + 1]);
			}
		}
		System.out.println(triangle[0][0]);
	}
}
