/*
 * Programa: Juego BlackJack.
 * Autores: Nicol�s Alberto Rodr�guez, Juli�n Mateo Caicedol, Miguel �ngel Sabogal
 * Fecha: 8 de Octubre de 2021
 */

package proyectoFinal;

public class ManoBanco extends Carta {
	// Declaramos variables que se van a utilizar.
	private int valorTotalBanca;
	
	// M�todo que va sumando los valores de las cartas que van saliendo en la mano de la banca.
	public int sumaValB(int valor) {
		return valorTotalBanca += valor;
	}
	
	// Getters y Setters.
	public int getValorTotal() {
		return valorTotalBanca;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotalBanca = valorTotal;
	}
}
