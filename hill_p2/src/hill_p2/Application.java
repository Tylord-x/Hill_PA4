package hill_p2;

//import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		DuplicateCounter dc=new DuplicateCounter();
	       dc.count("problem2.txt");
	       dc.write("unique_word_counts.txt");
	}

}
