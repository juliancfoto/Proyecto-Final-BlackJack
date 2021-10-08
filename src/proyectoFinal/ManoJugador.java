/*
 * Programa: Juego BlackJack.
 * Autores: Nicolás Alberto Rodríguez, Julián Mateo Caicedol, Miguel Ángel Sabogal
 * Fecha: 8 de Octubre de 2021
 */

package proyectoFinal;

public class ManoJugador extends Carta{
	
	// Declaramos variables que se van a utilizar.
	private int valorTotal;
	
	// Método que va sumando los valores de las cartas que van saliendo en la mano del jugador.
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
