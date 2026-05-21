package pekan7_2511533027;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SortingMahasiswaGUI_2511533027 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nama_3027, nim_3027, prodi_3027;
	private JTextArea log_3027;
	private JButton reset_3027;
	private JComboBox<String> comboSort_3027;
	private ArrayList<Mahasiswa_2511533027> data_3027 = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public SortingMahasiswaGUI_2511533027() {
		setTitle("Sorting Nama Mahasiswa");
		setSize(750, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel inputPanel_3027 = new JPanel(new GridLayout(5, 2));
		nama_3027 = new JTextField();
		nim_3027 = new JTextField();
		prodi_3027 = new JTextField();
		
		inputPanel_3027.add(new JLabel("Nama"));
		inputPanel_3027.add(nama_3027);
		inputPanel_3027.add(new JLabel("NIM"));
		inputPanel_3027.add(nim_3027);
		inputPanel_3027.add(new JLabel("Prodi"));
		inputPanel_3027.add(prodi_3027);
		
		JButton tambah_3027 = new JButton("Tambah Data");
		JButton sort_3027 = new JButton("Mulai Sorting");
		reset_3027 = new JButton("Reset");
		
		inputPanel_3027.add(tambah_3027);
		inputPanel_3027.add(sort_3027);
		inputPanel_3027.add(reset_3027);
		
		comboSort_3027 = new JComboBox<>(new String[] {"Insertion Sort", "Selection Sort", "Bubble Sort"});
		
		log_3027 = new JTextArea();
		log_3027.setEditable(false);
		
		add(inputPanel_3027, BorderLayout.NORTH);
		add(comboSort_3027, BorderLayout.WEST);
		add(new JScrollPane(log_3027), BorderLayout.CENTER);
		
		tambah_3027.addActionListener(e -> { 
			data_3027.add(new Mahasiswa_2511533027(
					nama_3027.getText(), 
					nim_3027.getText(), 
					prodi_3027.getText()
					));
			log_3027.append("Data Ditambahkan: " + nama_3027.getText() + "\n");
			nama_3027.setText("");
			nim_3027.setText("");
			prodi_3027.setText("");
		});
		
		sort_3027.addActionListener(e -> {
			log_3027.append("\n=== PROSES SORTING===\n");
			String pilihan_3027 = comboSort_3027.getSelectedItem().toString();
			
			if (pilihan_3027.equals("Insertion Sort")) {
				SortingMahasiswa_2511533027.insertionSort_3027(data_3027, log_3027);
			} else if (pilihan_3027.equals("Selection Sort")) {
				SortingMahasiswa_2511533027.selectionSort_3027(data_3027, log_3027);
			} else {
				SortingMahasiswa_2511533027.bubbleSort_3027(data_3027, log_3027);
			}
			
			log_3027.append("\nHasil Akhir: " + data_3027 + "\n");
		});
		
		reset_3027.addActionListener(e -> {
			nama_3027.setText("");
			nim_3027.setText("");
			prodi_3027.setText("");
			data_3027.clear();
			log_3027.setText("");
			log_3027.append("Semua Data Berhasil di Reset.\n");
		});
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new SortingMahasiswaGUI_2511533027().setVisible(true);
		});
	}
}
