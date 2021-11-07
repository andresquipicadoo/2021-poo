import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

// Andres Quiros Picado

public class WordGenerator {
	
	private ArrayList<Integer> generatedNum = new ArrayList<Integer>(); 
	private Random generator = new Random();	
	private ArrayList<String> dict = new ArrayList<String>();	
	 
	//Constructor
	public WordGenerator(){
		try{
			  // Open the file that is the first 
			  FileInputStream fstream = new FileInputStream("palabras.txt");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;

			  //Add the words in the text file into the dictionary
			  while ((strLine = br.readLine()) != null)   {
				  dict.add(strLine);
			  }
			  
			  //Close the input stream
			  in.close();
		}catch (Exception e){//Catch exception if any
			e.printStackTrace();
		}
		
	}
	
	
	public String generateWord(){
		Integer n;
		
		while(true){
			
			//check if all possible numbers were generated
			if(generatedNum.size() == dict.size())
				return "";
			
			n = Math.abs(generator.nextInt()%dict.size());
			if(!generatedNum.contains(n)){
				generatedNum.add(n);
				break;
			}
		}
		return dict.get(n).toUpperCase();
	}
		
}