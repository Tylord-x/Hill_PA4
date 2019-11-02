package hill_p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
   private Set<String> uniqueWord;
   public void remove(String dataFile) throws FileNotFoundException{
       String word;
       uniqueWord = new HashSet<String>();
       Scanner scnr =new Scanner(new File(dataFile));
       while(scnr.hasNext())
       {
           word=scnr.next();
           uniqueWord.add(word);
       }
       scnr.close();
      
      
   }
  
  public void write(String outputFile) throws IOException{
	   File file;
	   FileWriter fileWrite = null;
	   file = new File(outputFile);
	   if(file.exists()) {
		   fileWrite = new FileWriter(new File(outputFile));
		   Iterator itr=uniqueWord.iterator();

		   while(itr.hasNext()){
			   String string=(String)itr.next();
			   fileWrite.write(string+"\n");     
		   }
		   	fileWrite.close();
  
	   }
	   else
	   {
		   file.createNewFile();
		   fileWrite=new FileWriter(file);
		   Iterator itr=uniqueWord.iterator();

		   while(itr.hasNext()){
			   String string=(String)itr.next();
			   fileWrite.write(string+"\n");     
		   }
		   fileWrite.close();
	   }

   	}

}