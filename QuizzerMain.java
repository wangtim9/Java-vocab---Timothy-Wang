import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizzerMain {
	public static void main(String[] args) {
		int count = 0;
		ArrayList<String> terms = new ArrayList<String>();
		ArrayList<String> defs = new ArrayList<String>();
		File Terms = new File("unit1terms.txt");
		try (Scanner Scan = new Scanner(Terms)) {
			while (Scan.hasNextLine()) {
				String term = Scan.nextLine();
				terms.add(term);
				//System.out.print("new term\n");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
		File Defs = new File("unit1defs.txt");
		try (Scanner Scan2 = new Scanner(Defs)) {
			while (Scan2.hasNextLine()) {
				String def = Scan2.nextLine();
				defs.add(def);
				//System.out.print("new def\n");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
		//System.out.println(terms);
		//System.out.println(defs);
		Quizzer quiz = new Quizzer(terms, defs);
		quiz.makeQuestion(terms, defs);
	}
}
			
			
class Quizzer {
	private ArrayList<String> terms2;
	private ArrayList<String> definitions;
	
	public Quizzer(ArrayList<String> t, ArrayList<String> d) {
		terms2 = new ArrayList<String>();
		definitions = new ArrayList<String>();
	}
	
	//public ArrayList<String> getTerms() {
		//return terms;
	//}
	
	//public ArrayList<String> getDefs() {
		//return definitions;
	//}
	
	public void makeQuestion(ArrayList<String> termlist, ArrayList<String> deflist) {
		int c = 0;
		int[] ugh = new int[5];
		ugh[0] = 5;
		int temp = (int)(Math.random()*termlist.size());
		ArrayList<String> options = new ArrayList<String>(4);
		options.add(deflist.get((int)(Math.random()*deflist.size())));
		options.add(deflist.get((int)(Math.random()*deflist.size())));
		options.add(deflist.get((int)(Math.random()*deflist.size())));
		options.add(deflist.get(temp));
		//problem: prints same thing 4 times
		for (int i = 0; i < options.size(); i++) {
			while (c == 0) {
				int b = (int)(Math.random()*options.size());
				for (int j = i; j < ugh.length; j++) {
					if (ugh[j] != b) {
						System.out.println(options.get(b));
						ugh[i+1] = b;
						c++;
						continue;
					}
				}
			}
		}
	}
}
		
