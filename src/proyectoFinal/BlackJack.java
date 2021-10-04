package proyectoFinal;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class BlackJack extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
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
	 * Create the frame.
	 */
	public BlackJack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 504);
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
		panelBanca.setBounds(10, 68, 736, 154);
		contentPane.add(panelBanca);
		panelBanca.setLayout(null);

		// PANEL DEL JUGADOR
		Panel panelJugador = new Panel();
		panelJugador.setBackground(new Color(51, 102, 255));
		panelJugador.setBounds(10, 246, 736, 154);
		contentPane.add(panelJugador);
		panelJugador.setLayout(null);

		// PANEL DE LAS CARTAS
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\JULIAN\\.eclipse\\UNIVERSIDAD DISTRITAL\\Proyecto Final\\img\\Cartas\\Rojas\\corazon10.png"));
		lblNewLabel_1.setBounds(10, 22, 71, 97);
		panelBanca.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\JULIAN\\.eclipse\\UNIVERSIDAD DISTRITAL\\Proyecto Final\\img\\Cartas\\Negras\\pica7.png"));
		lblNewLabel_2.setBounds(133, 22, 71, 97);
		panelBanca.add(lblNewLabel_2);

		// BOTONES
		Button btnMostrar = new Button("Mostrar");
		btnMostrar.setBounds(499, 406, 70, 22);
		contentPane.add(btnMostrar);

		Button btnPedir = new Button("Pedir");
		btnPedir.setBounds(588, 406, 70, 22);
		contentPane.add(btnPedir);

		Button btnQuedar = new Button("Quedar");
		btnQuedar.setBounds(676, 406, 70, 22);
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
	}

}
