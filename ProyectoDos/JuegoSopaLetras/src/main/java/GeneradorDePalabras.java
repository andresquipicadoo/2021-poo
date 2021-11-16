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
			  BufferedReader burfd = new BufferedReader(new InputStreamReader(in));
			  String strLine;

			
			  while ((strLine = burfd.readLine()) != null)   {
				  dictar.add(strLine);
			  }
			  
			  
			  in.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public String GenerarPalabra(){
		Integer n;
		
		while(true){
			
			
			if(numeroGenerado.size() == dictar.size())
				return "";
			
			n = Math.abs(generador.nextInt()%dictar.size());
			if(!numeroGenerado.contains(n)){
				numeroGenerado.add(n);
				break;
			}
		}
		return dictar.get(n).toUpperCase();
	}
		
}