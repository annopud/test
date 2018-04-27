package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;


public class ImportDtail {
	public static void main(String[] args) {
		 String line;
		 Control n = new Control();
	    File file = new File("C:\\Users\\T\\Desktop\\iphone\\promotion1.log");
	    List<NoNBill> NumNCost = new ArrayList<NoNBill>() ;
        Gson gson = new Gson();
	    try(FileReader fis = new FileReader(file);
	    		BufferedReader bis = new BufferedReader(fis);
	    		FileWriter writer = new FileWriter("D:\\Detail.json");
	    		){
	    	
	      // dis.available() returns 0 if the file does not have more lines.
	      while ((line = bis.readLine())!=null) {
	    	  	String[] Cust = line.split("\\|");
	    	  	NumNCost.add(new NoNBill(Cust[3],n.Cost(Cust[2],Cust[1])));

	      }
	    	gson.toJson(NumNCost, writer);
	      System.out.println(gson.toJson(NumNCost));
	      // dispose all the resources after using them.
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
}
