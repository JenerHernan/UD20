import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class main {

	private JFrame frame;
	private int opcion1;
	private int opcion2;
	private int sliderop;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema operativo usado:");
		lblNewLabel.setBounds(162, 11, 122, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				opcion1 = 1;
			}
		});
		rdbtnNewRadioButton.setBounds(43, 39, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("MacOS");
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				opcion1 = 2;
			}
		});
		rdbtnNewRadioButton_1.setBounds(175, 39, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Linux");
		rdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				opcion1 = 3;
			}
		});
		rdbtnNewRadioButton_2.setBounds(300, 39, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		bgroup.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setBounds(169, 86, 93, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Programacion");
		rdbtnNewRadioButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				opcion2 = 1;
			}
		});
		rdbtnNewRadioButton_3.setBounds(43, 128, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Dise\u00F1o grafico");
		rdbtnNewRadioButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				opcion2 = 2;
			}
		});
		rdbtnNewRadioButton_4.setBounds(175, 128, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Administracion");
		rdbtnNewRadioButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				opcion2 = 3;
			}
		});
		rdbtnNewRadioButton_5.setBounds(300, 128, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		ButtonGroup bgroup2 = new ButtonGroup();
		bgroup2.add(rdbtnNewRadioButton_3);
		bgroup2.add(rdbtnNewRadioButton_4);
		bgroup2.add(rdbtnNewRadioButton_5);
		
		
		final JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				sliderop = slider.getValue();
			}
		});
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setValue(5);
		slider.setMinorTickSpacing(1);
		slider.setMaximum(10);
		slider.setBounds(116, 220, 200, 26);
		frame.getContentPane().add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas al ordenador");
		lblNewLabel_2.setBounds(139, 178, 160, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String aux1 = "";
				String aux2 = "";
				switch(opcion1) {
					case 1:
						aux1 = "Windows";
						break;
					case 2:
						aux1 = "MacOS";
						break;
					case 3:
						aux1 = "Linux";
						break;
				}
				

				switch(opcion2) {
					case 1:
						aux2 = "Programador";
						break;
					case 2:
						aux2 = "Diseñador grafico";
						break;
					case 3:
						aux2 = "Administracion";
						break;
				}
				
				
				
				JOptionPane.showMessageDialog(null, "Los resultados son:\nSistema Operativo: " + aux1 +"\nCargo: " + aux2 + "\nHoras: " + sliderop);
			}
		});
		btnNewButton.setBounds(173, 282, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
