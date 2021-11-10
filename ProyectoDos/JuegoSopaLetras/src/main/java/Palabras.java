import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class Palabras extends JButton{
	
	private String letras; 
	private boolean selected; 
	private int horizontales;
	private int verticales; 
        private int diagonales;
	private boolean buscar; 
	
	
	
	public Palabras(String letras, int hor, int vert,int diag){
		super(letras);
		this.letras = letras;
		horizontales = hor;
		verticales = vert;
                diagonales=diag;
		setPreferredSize(new Dimension(30, 30));
		setMargin(new Insets(0, 0, 0, 0));
		setSelected(false);
		
	}

    Palabras(String string, int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
	public void toggle(){
		setSelected(!selected);
	}
	
	public void getPalabra(String l){
		letras = l.substring(0,1);
		setText(letras);
	}
	
	
	public String getLetra(){
		return letras;
	}
	
	
	public void setSelected(boolean s){
		this.selected = s;
		if(s)
			setBackground(new Color(0xe6, 0xe6, 0xe6));
		else if(buscar)
			setBackground(Color.CYAN);
		else
			setBackground(Color.WHITE);
	}
	
	
	public boolean getSelected(){
		return selected;
	}
	
	
	public int getPosicionHorizontal(){
		return horizontales;
	}
        public int getDiagonales(){
            return diagonales;
        }
	
	
	public void setHorizontales(int x){
		horizontales = x;
	}
        public void setDiagonales(int diag){
            diagonales=diag;
        }
	
	
	public int getPosicionVertical(){
		return verticales;
	}
	
	
	public void setVerticales(int y){
		verticales = y;
	}

	
	public boolean palabraEncontrada() {
		return buscar;
	}

	
	public void setPalabrabuscada(boolean palabraEncontrada) {
		this.buscar = palabraEncontrada;
		if(palabraEncontrada)
			setBackground(Color.GREEN);
	}

}
