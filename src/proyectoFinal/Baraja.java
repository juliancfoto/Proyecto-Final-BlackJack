/*
 * Programa: Juego BlackJack.
 * Autores: Nicolás Alberto Rodríguez, Julián Mateo Caicedol, Miguel Ángel Sabogal
 * Fecha: 8 de Octubre de 2021
 */

package proyectoFinal;

public class Baraja extends Carta{
	
	// Declaramos variables que se van a utilizar.
	private String baraja[];
	private int valores[];
	
	// Creamos un método que llena la baraja de imágenes para después mostrarlas en pantalla.
	public void llenarBaraja() {
		baraja = new String [52];
		for (int i = 0; i < 13; i++) {
			baraja [i] = "img/Cartas/Negras/pica"+(i+1)+".png";
		}
		for (int j = 13; j < 26; j++) {
			baraja [j] = "img/Cartas/Negras/trebol"+ (j - 12) + ".png";
		}
		for (int k = 26; k < 39; k++) {
			baraja[k] = "img/Cartas/Rojas/corazon"+ (k-25) + ".png";
		}
		for (int l = 39; l < 52; l++) {
			baraja[l] = "img/Cartas/Rojas/diamante"+ (l-38) + ".png";
		}
	}
	
	// Creamos un método que le asigna a cada posición de la baraja el valor correspondiente.
	public void asigValor() {
		valores = new int [52];
		int temp = 0;
		for (int i = 1; i < 10; i++) {
			valores[i-1] = i;
		}
		for (int j = 14; j < 23; j++ ) {
			valores[j-1] = j-13;
		}
		for (int k = 27; k < 36; k++) {
			valores [k-1] = k-26;
		}
		for (int l = 40; l < 49; l++) {
			valores [l-1] = l-39;
		}
		for (int n = 9; n < 53;) {
			temp =+ n;
			for (int n2 = 0; n2 < 4; n2++) {
				valores [temp + n2] = 10;
			}		
			n += 13;
		}
	}
	
	// Creamos un método que le asigna a cada posición de la baraja el valor correspondiente para la banca.
	public void asigValor(String b) {
		valores = new int [52];
		int temp = 0;
		for (int i = 1; i < 10; i++) {
			valores[i] = i+1;
		}
		for (int j = 14; j < 23; j++ ) {
			valores[j] = j-12;
		}
		for (int k = 27; k < 36; k++) {
			valores [k] = k-25;
		}
		for (int l = 40; l < 49; l++) {
			valores [l] = l-38;
		}
		for (int n = 9; n < 53;) {
			temp =+ n;
			for (int n2 = 0; n2 < 4; n2++) {
				valores [temp + n2] = 10;
			}		
			n += 13;
		}
		
		valores [0] = 11;
		valores [13] = 11;
		valores [26] = 11;
		valores [39] = 11;

	}
	
	// Getters y Setters.
	// Método que retorna la imágen de la carta de forma aleatoria.
	public String retornarRandom(int n) {
		return (baraja[n]);
	}
	
	// Método que retorna el valor de la imágen de la carta de forma aleatoria.
	public int getValor(int n) {
		return valores[n];
	}

	public String[] getBaraja() {
		return baraja;
	}

	public void setBaraja(String[] baraja) {
		this.baraja = baraja;
	}
	
	
}
