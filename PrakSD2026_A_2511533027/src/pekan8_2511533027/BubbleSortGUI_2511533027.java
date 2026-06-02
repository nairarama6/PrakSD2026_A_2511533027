package pekan8_2511533027;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class BubbleSortGUI_2511533027 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array_3027;
	private JLabel[] labelArray_3027;
	private JButton stepButton_3027, resetButton_3027, setButton_3027;
	private JTextField inputField_3027;
	private JPanel panelArray_3027;
	private JTextArea stepArea_3027;
	
	private int i_3027 = 1, j_3027;
	private boolean sorting_3027 = false;
	private int stepCount_3027 = 1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	/**
	 * Create the frame.
	 */
	public BubbleSortGUI_2511533027() {
		setTitle("Bubble Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// Panel input
		JPanel inputPanel_3027 = new JPanel(new FlowLayout());
		inputField_3027 = new JTextField(30);
		setButton_3027 = new JButton("Set Array");
		inputPanel_3027.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
		inputPanel_3027.add(inputField_3027);
		inputPanel_3027.add(setButton_3027);
		
		// Panel Array visual
		panelArray_3027 = new JPanel();
		panelArray_3027.setLayout(new FlowLayout());
		
		// Panel kontrol
		JPanel controlPanel_3027 = new JPanel();
		stepButton_3027 = new JButton("Langkah Selanjutnya");
		resetButton_3027 = new JButton("Reset");
		stepButton_3027.setEnabled(false);
		controlPanel_3027.add(stepButton_3027);
		controlPanel_3027.add(resetButton_3027);
		
		// Area text untuk log langkah-langkah
		stepArea_3027 = new JTextArea(8, 60);
		stepArea_3027.setEditable(false);
		stepArea_3027.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_3027 = new JScrollPane(stepArea_3027);
		
		// Tambahkan panel ke frame
		add(inputPanel_3027, BorderLayout.NORTH);
		add(panelArray_3027, BorderLayout.CENTER);
		add(controlPanel_3027, BorderLayout.SOUTH);
		add(scrollPane_3027, BorderLayout.EAST);
		
		// Event Set Array
		setButton_3027.addActionListener(e -> setArrayFromInput_3027());
		
		// Event Langkah Selanjutnya
		stepButton_3027.addActionListener(e -> performStep_3027());
		
		// Event Reset
		resetButton_3027.addActionListener(e -> reset_3027());
	}
	
	private void setArrayFromInput_3027() {
		String text_3027 = inputField_3027.getText().trim();
		if (text_3027.isEmpty()) return;
		String[] parts_3027 = text_3027.split(",");
		array_3027 = new int[parts_3027.length];
		try {
			for (int k_3027 = 0; k_3027 < parts_3027.length; k_3027++) {
				array_3027[k_3027] = Integer.parseInt(parts_3027[k_3027].trim());    } 
		} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this,  "Masukkan hanya angka " 
						+ "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;			}
			i_3027 = 0;
			j_3027 = 0;
			stepCount_3027 = 1;
			sorting_3027 = true;
			stepButton_3027.setEnabled(true);
			stepArea_3027.setText("");
			panelArray_3027.removeAll();
			labelArray_3027 = new JLabel[array_3027.length];
			for (int k_3027 = 0; k_3027 < array_3027.length; k_3027++) {
				labelArray_3027[k_3027] = new JLabel(String.valueOf(array_3027[k_3027]));
				labelArray_3027[k_3027].setFont(new Font("Arial", Font.BOLD, 24));
				labelArray_3027[k_3027].setOpaque(true);
				labelArray_3027[k_3027].setBackground(Color.WHITE);
				labelArray_3027[k_3027].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				labelArray_3027[k_3027].setPreferredSize(new Dimension(50, 50));
				labelArray_3027[k_3027].setHorizontalAlignment(SwingConstants.CENTER);
				panelArray_3027.add(labelArray_3027[k_3027]);    }
				
			panelArray_3027.revalidate();
			panelArray_3027.repaint();
		}
	
	private void performStep_3027() {
	    if (!sorting_3027 || i_3027 >= array_3027.length - 1) {
	        sorting_3027 = false;
	        stepButton_3027.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        return;
	    }
	    resetHighlights_3027();
	    StringBuilder stepLog_3027 = new StringBuilder();
	    labelArray_3027[j_3027].setBackground(Color.CYAN);
	    labelArray_3027[j_3027 + 1].setBackground(Color.CYAN);
	    if (array_3027[j_3027] > array_3027[j_3027 + 1]) {
	        // Swap
	        int temp_3027 = array_3027[j_3027];
	        array_3027[j_3027] = array_3027[j_3027 + 1];
	        array_3027[j_3027 + 1] = temp_3027;
	        labelArray_3027[j_3027].setBackground(Color.RED);
	        labelArray_3027[j_3027 + 1].setBackground(Color.RED);
	        stepLog_3027.append("Langkah ").append(stepCount_3027).append(": Menukar elemen ke-")
	               		.append(j_3027).append(" (").append(array_3027[j_3027 + 1]).append(") dengan ke-")
	               		.append(j_3027 + 1).append(" (").append(array_3027[j_3027]).append(")\n");
	    } else {
	        stepLog_3027.append("Langkah ").append(stepCount_3027).append(": Tidak ada pertukaran antara ke-")
	               		.append(j_3027).append(" dan ke-").append(j_3027 + 1).append("\n");    }
	    stepLog_3027.append("Hasil: ").append(arrayToString_3027(array_3027)).append("\n\n");
	    stepArea_3027.append(stepLog_3027.toString());
	    updateLabels_3027();
	    j_3027++;
	    if (j_3027 >= array_3027.length - i_3027 - 1) {
	        j_3027 = 0;
	        i_3027++;	}
	    stepCount_3027++;
	    if (i_3027 >= array_3027.length - 1) {
	        sorting_3027 = false;
	        stepButton_3027.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	    }
	}
	    private void updateLabels_3027() {
	        for (int k_3027 = 0; k_3027 < array_3027.length; k_3027++) {
	            labelArray_3027[k_3027].setText(String.valueOf(array_3027[k_3027]));
	        }
	    }
	    
	    private void resetHighlights_3027() {
	        for (JLabel label : labelArray_3027) {
	            label.setBackground(Color.WHITE);
	        }
	    }
	    
	    private void reset_3027() {
	        inputField_3027.setText("");
	        panelArray_3027.removeAll();
	        panelArray_3027.revalidate();
	        panelArray_3027.repaint();
	        stepArea_3027.setText("");
	        stepButton_3027.setEnabled(false);
	        sorting_3027 = false;
	        i_3027 = 0;
	        j_3027 = 0;
	        stepCount_3027 = 1;
	    }
	    
	    private String arrayToString_3027(int[] arr) {
	        StringBuilder sb = new StringBuilder();
	        for (int k = 0; k < arr.length; k++) {
	            sb.append(arr[k]);
	            if (k < arr.length - 1) sb.append(", ");
	        }
	        return sb.toString();
	    }


		public static void main(String[] args) {
		    SwingUtilities.invokeLater(() -> {
		        BubbleSortGUI_2511533027 gui_3027 = new BubbleSortGUI_2511533027();
		        gui_3027.setVisible(true);
		    });
		}
	}
	    
	

