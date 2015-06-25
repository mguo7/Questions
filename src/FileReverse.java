import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * Read a file content and write it to a new file in reverse order
 */

public class FileReverse {

	private ArrayList<String> lines = new ArrayList<String>();

	private void parseWords(Path file) {

		Charset charset = Charset.forName("UTF-8");

		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {

			String line = "";

			while ((line = reader.readLine()) != null) {
				//System.out.println(line);
				this.lines.add(line);

			} // out of line
		} catch (IOException e) {

			System.err.println("Error: unexpected IOexception.");

		}

	}

	private void printFile() {

		Path file = Paths.get("output.txt");
		Charset charset = Charset.forName("UTF-8");

		try (BufferedWriter output = Files.newBufferedWriter(file, charset)) {

			// Print out the words
			for (int i = this.lines.size(); i > 0; i--) {

				output.write(this.lines.get(i - 1));
				output.newLine();

			}// out of word
		} catch (Exception e) {
			// "Error printing to file " + filename
			System.err.println("Errors on printing file");

		}
	}

	private void showMenu() {

		System.out.println("Reading file from default file 'File.txt'");
		Path file = Paths.get("File.txt");
		System.out.println("Catching lines from file");
		parseWords(file);
		System.out.println("Now printing output file.");
		printFile();
		System.out.println("Approved.The output filename is 'output.txt'");

	}

	public static void main(String[] args) {

		FileReverse file = new FileReverse();
		file.showMenu();
	}
}
