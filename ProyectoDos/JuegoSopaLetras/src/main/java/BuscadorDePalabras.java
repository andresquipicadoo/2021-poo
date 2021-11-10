import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class BuscadorDePalabras {

	private int cantPalabras;	
	private String[][] SopaLetras; 
	private GeneradorDePalabras generadorPalabras;
	private ArrayList<String> listaPaises = new ArrayList<String>();
	private int length;
	
	public BuscadorDePalabras(int cantPalabras, int length){
		generadorPalabras = new GeneradorDePalabras();
		this.cantPalabras = cantPalabras;
		this.length = length;
	}

	
	public void Iniciar(){
		int numeroGenerado = 0;
		
		
		SopaLetras = new String[length][length];
		
		Random rand = new Random();
		
		while(numeroGenerado < cantPalabras){
			
			ArrayList<Integer> randomFilas = new ArrayList<Integer>();
			ArrayList<Integer> randmColumnas = new ArrayList<Integer>();
			
			String palabras =generadorPalabras.GenerarPalabra();
			listaPaises.add(palabras);

			
			boolean vertical;
                        
			int n = (rand.nextInt())%2;
			if(n == 0)
				vertical = true;
			else
				vertical = false;
                        
                        boolean diagonal;
                        int nu = (rand.nextInt())%2;
			if(nu == 0)
				diagonal = true;
			else
				diagonal = false;
                       
			if(vertical){
				
				for(int i = 0; i<length; i++){
					randmColumnas.add(i);
				}
				
				for(int j = 0; j<(length-palabras.length()); j++){
					randomFilas.add(j);
				}
				Collections.shuffle(randmColumnas, new Random());
				Collections.shuffle(randomFilas, new Random());
				
				for(int j = 0; j < randmColumnas.size(); j++){
					boolean success = false;
					for(int i = 0; i < randomFilas.size(); i++){
						int r = randomFilas.get(i);
						
						
						boolean haveRoom = true;
						for(int k = 0; k < palabras.length(); k++){
							if(SopaLetras[k+r][randmColumnas.get(j)]!=null){
								
								if(!SopaLetras[k+r][randmColumnas.get(j)].equals(palabras.substring(k, k+1))){
									haveRoom = false;
									break;
								}
							}
						}
						
						if(haveRoom){
							
							for(int k = 0; k < palabras.length(); k++){
								SopaLetras[f+c][randmColumnas.get(j)] = palabras.substring(k, k+1);
							}
							success = true;
							break;
						}
					}
					if(success)
						break;
				}
			}else{
				for(int i = 0; i<length; i++){
					randomFilas.add(i);
				}
				
				for(int j = 0; j<length-palabras.length(); j++){
					randmColumnas.add(j);
				}
				
				Collections.shuffle(randmColumnas, new Random());
				Collections.shuffle(randomFilas, new Random());
				
				for(int j = 0; j < randomFilas.size(); j++){
					boolean success = false;
					for(int i = 0; i < randmColumnas.size(); i++){
						int c = randmColumnas.get(i);
						
						
						boolean haveRoom = true;
						for(int k = 0; k < palabras.length(); k++){
							if(SopaLetras[randomFilas.get(j)][k+c]!=null){
						
								if(!SopaLetras[randomFilas.get(j)][k+c].equals(palabras.substring(k, k+1))){
									haveRoom = false;
									break;
								}
							}
						}
					
						if(haveRoom){
						
							for(int k = 0; k < palabras.length(); k++){
								SopaLetras[randomFilas.get(j)][k+c] = palabras.substring(k, k+1);
							}
							success = true;
			     				break;
                                                        			}
					}
					if(success)
						break;
				}
                        }
                        if (diagonal){
                            for(int i = 0; i<length; i++){
					randmColumnas.add(i);
				}
				
				for(int j = 0; j<(length-palabras.length()); j++){
					randomFilas.add(j);
				}
                                Collections.shuffle(randmColumnas, new Random());
				Collections.shuffle(randomFilas, new Random());
                                for(int j = 0; j < randomFilas.size(); j++){
					boolean success = false;
					for(int i = 0; i < randmColumnas.size(); i++){
						int c = randmColumnas.get(i);
						
						
						boolean haveRoom = true;
						for(int k = 0; k < palabras.length(); k++){
							if(SopaLetras[randomFilas.get(j)][k+c]!=null){
						
								if(!SopaLetras[randomFilas.get(j)][k+c].equals(palabras.substring(k, k+1))){
									haveRoom = false;
									break;
								}
							}
						}
					
						if(haveRoom){
						
							for(int k = 0; k < palabras.length(); k++){
								SopaLetras[randomFilas.get(j)][k+c] = palabras.substring(k, k+1);
							}
							success = true;
			     				break;
                                                        			}
					}
					if(success)
						break;
				}
                        
                        } 
                
                                
			numeroGenerado++;
		}
	}
	

	
	public int getNumeroPalabras() {
		return cantPalabras;
	}

	
	public void setNumeroPalabras(int numeroPalabras) {
		this.cantPalabras = numeroPalabras;
	}

	
	public String[][] getCuadriculaSopaletras() {
		return SopaLetras;
	}

	
	public ArrayList<String> getListaPaises() {
		return listaPaises;
	}

}
