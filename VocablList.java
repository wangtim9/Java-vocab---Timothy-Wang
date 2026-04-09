import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VocabList() {
	public void makeQuestion(ArrayList<String> termlist, ArrayList<String> deflist) {
		int temp = Math.random() * termlist
		ArrayList<String> options = new ArrayList<String>(4);
		options.add(deflist.get(Math.random()*deflist.size());
		options.add(deflist.get(Math.random()*deflist.size());
		options.add(deflist.get(Math.random()*deflist.size());
		options.add(deflist.get(temp);
		while (
	public static void Main(String[] args) {
		ArrayList<String> terms;
		ArrayList<String> defs;
		File Terms = new File("unit1terms.txt");
		try (Scanner Scan = new Scanner(Terms) {
			while (Scan.hasNextLine()) {
				String term = Scan.nextLine();
				terms.add(term);
			}
		}
		File Defs = new File("unit1defs.txt");
		try Scanner Scan = new Scanner(Defs) {
			while (Scan.hasNextLine()) {
				String def = Scan.nextLine();
				defs.add(def);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
		System.out.println(terms.get(Math.random() * terms.size());
		
         }
