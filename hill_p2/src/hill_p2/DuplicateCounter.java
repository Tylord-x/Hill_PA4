package hill_p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateCounter {
	private int wordCounter;
	private Map<String, Integer> countWords;
	   public DuplicateCounter() {
	       this.countWords = new HashMap<String, Integer>();
	   }

	   public void count(String dataFile) throws FileNotFoundException {
	       Scanner scnr = new Scanner(new File(dataFile));
	      
	       while (scnr.hasNext()) {
	    	   String word = scnr.next();
	    	   Integer count = countWords.get(word);
	    	   wordCounter++;
	    	   if (count != null) {
	    		   count = count + 1;
	    	   } 
	    	   else {
	    		   count = 1;
	    	   }
	    	   countWords.put(word, count);
	       }
	       //scnr.close();

	   }
	  
	   public void write(String outputFile) throws IOException
	   {
	       FileWriter fw=new FileWriter(new File(outputFile));
	       for (Entry<String, Integer> entry : countWords.entrySet()) {
	    	   fw.write(entry.getKey() + " " + entry.getValue()+"\n");
	       }
	       fw.write("Number of words in the file :"+wordCounter+"\n");
	       fw.close();
	      
	   }
	}

