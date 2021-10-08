/*
 * Programa: Juego BlackJack.
 * Autores: Nicol�s Alberto Rodr�guez, Juli�n Mateo Caicedol, Miguel �ngel Sabogal
 * Fecha: 8 de Octubre de 2021
 */

package proyectoFinal;

public class ManoJugador extends Carta{
	
	// Declaramos variables que se van a utilizar.
	private int valorTotal;
	
	// M�todo que va sumando los valores de las cartas que van saliendo en la mano del jugador.
	public int sumaVal(int valor) {
		return valorTotal += valor;
	}
	
	// Getters y Setters.
	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
}
