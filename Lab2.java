package cisc3130Lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab2 {
	public static void main(String[]args) throws IOException {
		FileReader fr = new FileReader("regional-global-daily-latest.csv"); //Have to use BufferedReader because it stopped reading when I used Scanner
	        BufferedReader br = new BufferedReader(fr);
	        File output= new File(("Artists-WeekOf09062020.txt")); //Prints to this file
	        PrintWriter outputWriter = new PrintWriter(output);
	        Set<artistName> names=new HashSet<artistName>(); //Creating a hashset to put all my data in
	        br.readLine();
	        br.readLine();
	        HashSet<artistName> nameSet = new HashSet<artistName>(); //Creating a hashset to put all my data in
	        for (String line = br.readLine(); line != null; line = br.readLine()) { // Checks the file if theres a  line and sets the line to a string for nameLine
	        	String nameLine=line.split(",")[2]; // Sets the line with the artist name through split
	        	artistName temp=new artistName(nameLine);
	        	if (nameSet.add(temp)==false) { // If the object wasn't added into the hashset
	        		for(artistName artist : nameSet ) { //Goes through by looking for the artist Obj
	        			if(artist.equals(temp)) {
	        				artist.setFrequency(artist.getFrequency()+1);
	        			}
	        		}
	        	}

	        }
	        for(artistName artist : nameSet ) { //Prints to outputF the toString from artistName
	        	outputWriter.println(artist);
	        }
	        br.close();
	        outputWriter.close();
	        
	}
}
