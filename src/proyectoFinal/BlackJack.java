/*
 * Programa: Juego BlackJack.
 * Autores: Nicolás Alberto Rodríguez, Julián Mateo Caicedol, Miguel Ángel Sabogal
 * Fecha: 8 de Octubre de 2021
 */

package proyectoFinal;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;<<<<<<<HEAD=======
import java.util.InputMismatchException;>>>>>>>952f cd47c2546cc66bb272801974d4631bb3a06e

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Window.Type;<<<<<<<HEAD=======
import javax.swing.JButton;

public class BlackJack extends JFrame {

	private JPanel contentPane;

	// Nombre del jugador
	String player = JOptionPane.showInputDialog("Ingrese su nombre: ");

	/**
	 * Launch the application.
	 */

	// Nombre del jugador
	String player = JOptionPane.showInputDialog("Ingrese su nombre: ");

	// Creamos objetos para retornar los métodos creados.
	Baraja barajaBJ = new Baraja();
	ManoJugador cartasJugador = new ManoJugador();
	ManoBanco cartasBanca = new ManoBanco();

	// Declaramos variables que vamos a utilizar
	int contadorP = 0;
	int contadorV = 0;
	int contadorB = 0;
	int sumaJugador;
	boolean banderaN;

	/**
	 * Ejecuta la aplicación.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJack frame = new BlackJack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * <<<<<<< HEAD Create the frame. ======= Creamos la ventana. >>>>>>>
	 * 952fcd47c2546cc66bb272801974d4631bb3a06e
	 */
	/**
	 * Creamos la ventana.
	 */
	public BlackJack() {
		setType(Type.POPUP);
		setTitle("BlackJack");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\JULIAN\\.eclipse\\UNIVERSIDAD DISTRITAL\\Proyecto-Final-BlackJack\\img\\Logo\\blackjackLogo.png"));
		componentes();
		this.setLocationRelativeTo(null);
	}

	public void componentes() {

		setUndecorated(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 547);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// TITULO
		JLabel lblNewLabel = new JLabel("BlackJack");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(323, 11, 125, 52);
		contentPane.add(lblNewLabel);

		// PANELES DE JUEGO
		// PANEL DE LA BANCA
		Panel panelBanca = new Panel();
		panelBanca.setBackground(new Color(51, 102, 255));
		panelBanca.setBounds(10, 95, 736, 154);
		contentPane.add(panelBanca);
		panelBanca.setLayout(null);

		// TITULO BANCA
		JLabel banca = new JLabel("Banca");
		banca.setForeground(Color.WHITE);
		banca.setHorizontalAlignment(SwingConstants.CENTER);
		banca.setFont(new Font("Tahoma", Font.BOLD, 17));
		banca.setBounds(10, 69, 93, 22);
		contentPane.add(banca);

		// PANEL DEL JUGADOR
		Panel panelJugador = new Panel();
		panelJugador.setBackground(new Color(51, 102, 255));
		panelJugador.setBounds(10, 297, 736, 154);
		contentPane.add(panelJugador);
		panelJugador.setLayout(null);

		// Creamos labels con las imagenes de las cartas que se le van a asignar al
		// jugador.
		JLabel lblCartaJ1 = new JLabel("");
		lblCartaJ1.setIcon(new ImageIcon(
				"C:\\Users\\Migue\\eclipse-workspace\\Proyecto-Final-BlackJack\\img\\Cartas\\Respaldo.png"));
		lblCartaJ1.setBounds(33, 30, 73, 97);
		lblCartaJ1.setVisible(true);
		panelJugador.add(lblCartaJ1);

		JLabel lblCartaJ2 = new JLabel(new ImageIcon(
				"C:\\Users\\Migue\\eclipse-workspace\\Proyecto-Final-BlackJack\\img\\Cartas\\Respaldo.png"));
		lblCartaJ2.setBounds(178, 30, 73, 97);
		lblCartaJ2.setVisible(true);
		panelJugador.add(lblCartaJ2);

		JLabel lblCartaJ3 = new JLabel(new ImageIcon(
				"C:\\Users\\Migue\\eclipse-workspace\\Proyecto-Final-BlackJack\\img\\Cartas\\Respaldo.png"));
		lblCartaJ3.setBounds(330, 30, 73, 97);
		lblCartaJ3.setVisible(false);
		panelJugador.add(lblCartaJ3);

		JLabel lblCartaJ4 = new JLabel(new ImageIcon(
				"C:\\Users\\Migue\\eclipse-workspace\\Proyecto-Final-BlackJack\\img\\Cartas\\Respaldo.png"));
		lblCartaJ4.setBounds(488, 30, 73, 97);
		lblCartaJ4.setVisible(false);
		panelJugador.add(lblCartaJ4);

		JLabel lblCartaJ5 = new JLabel(new ImageIcon(
				"C:\\Users\\Migue\\eclipse-workspace\\Proyecto-Final-BlackJack\\img\\Cartas\\Respaldo.png"));
		lblCartaJ5.setBounds(631, 30, 73, 97);
		lblCartaJ5.setVisible(false);
		panelJugador.add(lblCartaJ5);

		// NOMBRE JUGADOR
		JLabel nombreJugador = new JLabel(player);
		nombreJugador.setForeground(Color.WHITE);
		nombreJugador.setHorizontalAlignment(SwingConstants.LEFT);
		nombreJugador.setFont(new Font("Tahoma", Font.BOLD, 17));
		nombreJugador.setBounds(31, 269, 317, 22);
		contentPane.add(nombreJugador);

		// Panel de las cartas de la banca.
		JLabel lblCarta1 = new JLabel("");
		lblCarta1.setIcon(new ImageIcon(
				"C:\\Users\\Migue\\eclipse-workspace\\Proyecto-Final-BlackJack\\img\\Cartas\\Respaldo.png"));
		lblCarta1.setBounds(33, 22, 71, 97);
		lblCarta1.setVisible(true);
		panelBanca.add(lblCarta1);

		JLabel lblCarta2 = new JLabel("");
		lblCarta2.setIcon(new ImageIcon(
				"C:\\Users\\Migue\\eclipse-workspace\\Proyecto-Final-BlackJack\\img\\Cartas\\Respaldo.png"));
		lblCarta2.setBounds(179, 22, 71, 97);
		lblCarta2.setVisible(true);
		panelBanca.add(lblCarta2);

		JLabel lblCarta3 = new JLabel(new ImageIcon(
				"C:\\Users\\Migue\\eclipse-workspace\\Proyecto-Final-BlackJack\\img\\Cartas\\Respaldo.png"));
		lblCarta3.setBounds(331, 22, 71, 97);
		lblCarta3.setVisible(false);
		panelBanca.add(lblCarta3);

		JLabel lblCarta4 = new JLabel(new ImageIcon(
				"C:\\Users\\Migue\\eclipse-workspace\\Proyecto-Final-BlackJack\\img\\Cartas\\Respaldo.png"));
		lblCarta4.setBounds(488, 22, 71, 97);
		lblCarta4.setVisible(false);
		panelBanca.add(lblCarta4);

		JLabel lblCarta5 = new JLabel(new ImageIcon(
				"C:\\Users\\Migue\\eclipse-workspace\\Proyecto-Final-BlackJack\\img\\Cartas\\Respaldo.png"));
		lblCarta5.setBounds(632, 22, 71, 97);
		lblCarta5.setVisible(false);
		panelBanca.add(lblCarta5);

		// BOTONES

		// Este botón es utilizado por el usuario, y pide las cartas hasta donde el
		// quiera.
		Button btnPedir = new Button("Pedir");
		btnPedir.setEnabled(false);
		btnPedir.addActionListener(new ActionListener() {
			// Acción de pulsar el botón.
			public void actionPerformed(ActionEvent e) {

				if (contadorP == 0) {
					lblCartaJ3.setVisible(true);
				} else if (contadorP == 1) {
					lblCartaJ4.setVisible(true);
				} else if (contadorP == 2)
					lblCartaJ5.setVisible(true);
				contadorP++;
			}
		});

		btnPedir.setBounds(588, 465, 70, 22);
		contentPane.add(btnPedir);

		Button btnMostrar = new Button("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			// Este botón es utilizado por el usuario, y muestra las cartas pedidas por el
			// jugador.
			public void actionPerformed(ActionEvent e) {

				// Declaramos varibles que vamos a utilizar.
				int valorC = 0;
				int valorAS;

				// Accesamos a los métodos creados.
				barajaBJ.llenarBaraja();
				barajaBJ.asigValor();

				// Creamos un número aleatorio para poder mostrar una carta aleatoria.
				int nRandom = (int) Math.floor(Math.random() * 51 + 1);

				// Asignamos las imágenes de las cartas.
				String icon = barajaBJ.retornarRandom(nRandom);
				String icon2 = barajaBJ.retornarRandom(nRandom);
				String icon3 = barajaBJ.retornarRandom(nRandom);
				String icon4 = barajaBJ.retornarRandom(nRandom);

				// Asignamos los valores y las imágenes a las cartas.
				valorC = barajaBJ.getValor(nRandom);
				if (contadorV == 0) {
					lblCartaJ1.setIcon(new ImageIcon(icon));
				} else if (contadorV == 1) {
					lblCartaJ2.setIcon(new ImageIcon(icon2));
					btnPedir.setEnabled(true);
				} else if (contadorV == 2) {
					lblCartaJ3.setIcon(new ImageIcon(icon3));
				} else if (contadorV == 3) {
					lblCartaJ4.setIcon(new ImageIcon(icon4));
				}

				// Sumamos los valores de cada carta.
				valorC = barajaBJ.getValor(nRandom);
				barajaBJ.setValor(valorC);
				sumaJugador = cartasJugador.getValorTotal();

				// Ponemos la opción de si el jugador saca un BlackJack y gana.
				if (cartasJugador.getValorTotal() == 21) {
					JOptionPane.showMessageDialog(null, "BlackJack para " + player);
				}

				// Creamos un condicional para que el usuario decida que número desea si saca un
				// AS.
				if (nRandom == 0 || nRandom == 13 || nRandom == 26 || nRandom == 39) {
					try {
						valorAS = Integer.parseInt(
								(JOptionPane.showInputDialog("Sacaste un AS\n ¿Qué valor deseas asignarle?(1 ó 11)")));
						if (valorAS != 1 && valorAS != 11) {
							JOptionPane.showInternalMessageDialog(null, "Introduzca el número 1 o el número 11");
							valorAS = Integer.parseInt((JOptionPane
									.showInputDialog("Sacaste un AS\n ¿Qué valor deseas asignarle?(1 ó 11)")));
						}
					} catch (NumberFormatException e1) {
						JOptionPane.showInternalMessageDialog(null,
								"Introduzca el número 1 o el número 11" + e1.toString());
						valorAS = Integer.parseInt(
								(JOptionPane.showInputDialog("Sacaste un AS\n ¿Qué valor deseas asignarle?(1 ó 11)")));
					}
				}

				// Creamos las opciones si es victoria del jugador o de la Banca.
				if (cartasJugador.getValorTotal() > 21) {
					int nRandom1 = (int) Math.floor(Math.random() * 51 + 1);
					icon = barajaBJ.retornarRandom(nRandom);
					nRandom1 = (int) Math.floor(Math.random() * 51 + 1);
					icon2 = barajaBJ.retornarRandom(nRandom1);

					lblCarta1.setIcon(new ImageIcon(icon));
					lblCarta1.setVisible(true);
					lblCarta2.setIcon(new ImageIcon(icon2));
					lblCarta2.setVisible(true);
					JOptionPane.showMessageDialog(null, "Ganó la Banca");

				}
				contadorV++;
			}
		});
		btnMostrar.setBounds(499, 465, 70, 22);
		contentPane.add(btnMostrar);

		Button btnQuedar = new Button("Quedar");

		// Este botón es utilizado por el usuario, y deja que el usuario deje su mano
		// como lo decidió.
		btnQuedar.addActionListener(new ActionListener() {

			// Al pulsar el botón deja que la banca haga su jugada.
			public void actionPerformed(ActionEvent e) {
				btnQuedar.setEnabled(false);
				btnMostrar.setEnabled(false);
				btnPedir.setEnabled(false);

				// Creamos variables y accedemos a los métodos.
				String b = "Banca";
				int valorC = 0;
				barajaBJ.llenarBaraja();
				barajaBJ.asigValor(b);

				// Creamos números aleatorios para sacar una carta aleatoria de la baraja a la
				// banca.
				int nRandom = (int) Math.floor(Math.random() * 51 + 1);
				String icon = barajaBJ.retornarRandom(nRandom);
				int nRandom1 = (int) Math.floor(Math.random() * 51 + 1);
				String icon2 = barajaBJ.retornarRandom(nRandom1);

				// Asignamos los valores y las imágenes a las cartas.
				lblCarta1.setIcon(new ImageIcon(icon));
				lblCarta1.setVisible(true);
				lblCarta2.setIcon(new ImageIcon(icon2));
				lblCarta2.setVisible(true);
				valorC = barajaBJ.getValor(nRandom);
				valorC += barajaBJ.getValor(nRandom1);
				barajaBJ.setValor(valorC);

				// Declaramos un condicional para que la banca intente ganarle al jugador.
				if (cartasBanca.getValorTotal() < cartasJugador.getValorTotal()) {
					nRandom = (int) Math.floor(Math.random() * 51 + 1);
					String icon3 = barajaBJ.retornarRandom(nRandom);
					lblCarta3.setIcon(new ImageIcon(icon3));
					lblCarta3.setVisible(true);
					valorC = barajaBJ.getValor(nRandom);
					barajaBJ.setValor(valorC);
					System.out.println(
							"El valor es: " + barajaBJ.getValor() + " Y la suma es: " + cartasBanca.sumaValB(valorC));

					if (cartasBanca.getValorTotal() < cartasJugador.getValorTotal()) {
						nRandom = (int) Math.floor(Math.random() * 51 + 1);
						String icon4 = barajaBJ.retornarRandom(nRandom);
						lblCarta4.setIcon(new ImageIcon(icon4));
						lblCarta4.setVisible(true);
						valorC = barajaBJ.getValor(nRandom);
						barajaBJ.setValor(valorC);

						System.out.println("El valor es: " + barajaBJ.getValor() + " Y la suma es: "
								+ cartasBanca.sumaValB(valorC));
					}
				}

				// Creamos la opción de si la banca saca un AS.
				if ((nRandom == 0 || nRandom == 13 || nRandom == 26 || nRandom == 39)
						|| (nRandom1 == 0 || nRandom1 == 13 || nRandom1 == 26 || nRandom1 == 39)) {
					if (cartasBanca.getValorTotal() > 21) {
						barajaBJ.setValor(valorC - 10);
					}
				}

				// Creamos las opciones si es victoria del jugador o de la Banca.
				if (cartasBanca.getValorTotal() == 21) {
					JOptionPane.showMessageDialog(null, "BlackJack para la Banca");
				}

				if (cartasBanca.getValorTotal() > 21 || cartasBanca.getValorTotal() < cartasJugador.getValorTotal()) {
					JOptionPane.showMessageDialog(null, "Ganó " + player);
				} else if (cartasBanca.getValorTotal() == 21
						|| (cartasBanca.getValorTotal() > cartasJugador.getValorTotal()
								&& cartasBanca.getValorTotal() < 21)) {
					JOptionPane.showMessageDialog(null, "Ganó la Banca");
				} else if (cartasBanca.getValorTotal() == cartasJugador.getValorTotal()) {
					JOptionPane.showMessageDialog(null, "Tenemos un empate");
				}

			}
		});
		btnQuedar.setBounds(676, 465, 70, 22);
		contentPane.add(btnQuedar);

		// SALIR DEL PROGRAMA
		Button btnSalir = new Button("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnSalir.setBounds(676, 11, 70, 22);
		contentPane.add(btnSalir);

		JButton btnVolverAJugar = new JButton("Volver a Jugar");
		btnVolverAJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BlackJack frame = new BlackJack();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		btnVolverAJugar.setBounds(39, 10, 116, 23);
		contentPane.add(btnVolverAJugar);

	}
}