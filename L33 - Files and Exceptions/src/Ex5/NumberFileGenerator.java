package Ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberFileGenerator {
	public static void main(String[] args) {
		ArrayList<File> files = new ArrayList<>();
		int antal = 0;
		String filename = "L33 - Files and Exceptions/src/Ex5/";
		try (Scanner scanner = new Scanner(System.in)) {
			while (antal <= 0) {
				try {
					System.out.println("Filename:");
					filename += scanner.next();
					System.out.print("Antal tal der skal skrives i filen: ");
					antal = scanner.nextInt();
				}
				catch (InputMismatchException ex) {
					System.out.println("Antal skal være et positivt heltal.");

				}
			}
		}
		try (PrintWriter printWriter = new PrintWriter(filename)) {
			Random rnd = new Random();
			for (int i = 1; i <= antal; i++) {
				int number = rnd.nextInt(10000);
				printWriter.println(number);
			}
			System.out.println("Fil med " + antal + " tal nu er lavet.");
			files.add(new File(filename));
		}
		catch (FileNotFoundException ex) {
			System.out.println("Error finding or creating file: " + filename);
		}
	}
	/*
	som finder maximum for tallene i filen med filnavnet filename.
	Metoden skal fange eventuelle exceptions og udskrive dem.
	 */
	public static int max(String filename) {
		try (Scanner scanner = new Scanner(new File(filename))) {
			int max = Integer.MIN_VALUE;
			while (scanner.hasNextInt()) {
				int i = scanner.nextInt();
				max = Math.max(max, i);
			}
			return max;
		} catch (FileNotFoundException e) {
			System.err.println("Error finding file: " + filename);
			return Integer.MIN_VALUE;
		}
	}
	/*
b)public static int min(String filename)
som finder minimum for tallene i filen med filnavnet filename.
Metoden skal fange eventuelle exceptions og udskrive dem.	 */
	public static int min(String filename) {
		try (Scanner scanner = new Scanner(new File(filename))) {
			int min = Integer.MAX_VALUE;
			while (scanner.hasNextInt()) {
				int i = scanner.nextInt();
				min = Math.min(min, i);
			}
			return min;
		} catch (FileNotFoundException e) {
			return Integer.MAX_VALUE;
		}
	}
	/*
	c)public static double average(String filename) throws IOException
som finder gennemsnittet af tallene i filen med filnavnet filename.
Metoden skal ikke fange eventuelle exceptions (de skal fanges i main() metoden – se spørgsmål d).
	 */
	public static double average(String filename) throws IOException {
		double avg = 0;
		try (Scanner scanner = new Scanner(new File(filename))) {
			int sum = 0;
			int count = 0;
			while (scanner.hasNextInt()) {
				int i = scanner.nextInt();
				count++;
				sum += i;
				if (count > 0) {
					avg = sum / count;
				}
			}
			return avg;
		}
	}
}
