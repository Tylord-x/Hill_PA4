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
	private Map<String, Integer> wordCount;
	   public DuplicateCounter() {
	       this.wordCount = new HashMap<String, Integer>();
	   }

	   public void count(String dataFile) throws FileNotFoundException {
	       Scanner scnr = new Scanner(new File(dataFile));
	      
	       while (scnr.hasNext()) {
	    	   String word = scnr.next();
	    	   Integer counter = wordCount.get(word);
	    	   wordCounter++;
	    	   if (counter != null) {
	    		   counter++;
	    	   } 
	    	   else {
	    		   counter = 1;
	    	   }
	    	   wordCount.put(word, counter);
	       }
	       //scnr.close();

	   }
	  
	   public void write(String outputFile) throws IOException
	   {
	       FileWriter fileWrite=new FileWriter(new File(outputFile));
	       fileWrite.write("Number of times each word occurs\n\n");
	       for (Entry<String, Integer> entry : wordCount.entrySet()) {
	    	   fileWrite.write(entry.getKey() + ": " + entry.getValue()+"\n");
	       }
	       fileWrite.write("\nNumber of words in the file : "+wordCounter+"\n");
	       fileWrite.close();
	      
	   }
	}

