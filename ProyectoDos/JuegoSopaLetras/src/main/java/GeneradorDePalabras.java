import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

// Andres Quiros Picado

public class GeneradorDePalabras {
	
	private ArrayList<Integer> numeroGenerado = new ArrayList<Integer>(); 
	private Random generador = new Random();	
	private ArrayList<String> dictar = new ArrayList<String>();	
	
	public GeneradorDePalabras(){
		try{
			  
			  FileInputStream fstream = new FileInputStream("palabras.txt");
			 
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;

			
			  while ((strLine = br.readLine()) != null)   {
				  dictar.add(strLine);
			  }
			  
			  
			  in.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public String GenerarPalabra(){
		Integer num;
		
		while(true){
			
			
			if(numeroGenerado.size() == dictar.size())
				return "";
			
			num = Math.abs(generador.nextInt()%dictar.size());
			if(!numeroGenerado.contains(num)){
				numeroGenerado.add(num);
				break;
			}
		}
		return dictar.get(num).toUpperCase();
	}
		
}