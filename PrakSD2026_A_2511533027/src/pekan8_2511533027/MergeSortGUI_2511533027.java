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

import java.util.LinkedList;
import java.util.Queue;

public class MergeSortGUI_2511533027 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_3027;
	private JLabel[] labelArray_3027;
	private JButton stepButton_3027, resetButton_3027, setButton_3027;
	private JTextField inputField_3027;
	private JPanel panelArray_3027;
	private JTextArea stepArea_3027;

	private Queue<int[]> mergeQueue_3027 = new LinkedList<>();
	private int stepCount_3027 = 1;
	private boolean isMerging_3027 = false;
	private boolean copying_3027 = false;

	private int[] temp_3027;
	private int left_3027, mid_3027, right_3027;
	private int i_3027, j_3027, k_3027;

	public MergeSortGUI_2511533027() {
		setTitle("Merge Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// panel input
		JPanel inputPanel_3027 = new JPanel(new FlowLayout());
		inputField_3027 = new JTextField(30);
		setButton_3027 = new JButton("Set Array");
		inputPanel_3027.add(new JLabel("Masukan angka (pisahkan dengan koma)"));
		inputPanel_3027.add(inputField_3027);
		inputPanel_3027.add(setButton_3027);

		// panel array visual
		panelArray_3027 = new JPanel();
		panelArray_3027.setLayout(new FlowLayout());

		// panel kontrol
		JPanel controlPanel_3027 = new JPanel();
		stepButton_3027 = new JButton("Langkah selanjutnya");
		resetButton_3027 = new JButton("Reset");
		controlPanel_3027.add(stepButton_3027);
		controlPanel_3027.add(resetButton_3027);

		// area text untuk log langkah langkah
		stepArea_3027 = new JTextArea(8, 60);
		stepArea_3027.setEditable(false);
		stepArea_3027.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_3027 = new JScrollPane(stepArea_3027);

		// tambahkan panel ke frame
		add(inputPanel_3027, BorderLayout.NORTH);
		add(panelArray_3027, BorderLayout.CENTER);
		add(controlPanel_3027, BorderLayout.SOUTH);
		add(scrollPane_3027, BorderLayout.EAST);

		// event set array
		setButton_3027.addActionListener(e -> setArrayFromInput_3027());

		// event selanjutnya
		stepButton_3027.addActionListener(e -> performStep_3027());

		// event reset
		resetButton_3027.addActionListener(e -> reset_3027());
	}

	private void setArrayFromInput_3027() {
		String text_3027 = inputField_3027.getText().trim();
		if (text_3027.isEmpty()) return;
		String[] parts_3027 = text_3027.split(",");
		array_3027 = new int[parts_3027.length];
		try {
			for (int k = 0; k < parts_3027.length; k++) {
				array_3027[k] = Integer.parseInt(parts_3027[k].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka dengan koma!",
					"Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		labelArray_3027 = new JLabel[array_3027.length];
		panelArray_3027.removeAll();
		for (int k = 0; k < array_3027.length; k++) {
			labelArray_3027[k] = new JLabel(String.valueOf(array_3027[k]));
			labelArray_3027[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_3027[k].setOpaque(true);
			labelArray_3027[k].setBackground(Color.WHITE);
			labelArray_3027[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_3027[k].setPreferredSize(new Dimension(50, 50));
			labelArray_3027[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_3027.add(labelArray_3027[k]);
		}

		mergeQueue_3027.clear();
		generateMergeSteps_3027(0, array_3027.length - 1);
		stepButton_3027.setEnabled(true);
		stepArea_3027.setText("");
		stepCount_3027 = 1;
		isMerging_3027 = false;

		panelArray_3027.revalidate();
		panelArray_3027.repaint();
	}

	private void generateMergeSteps_3027(int left, int right) {
		if (left >= right) return;
		int mid = (left + right) / 2;
		generateMergeSteps_3027(left, mid);
		generateMergeSteps_3027(mid + 1, right);
		mergeQueue_3027.add(new int[]{left, mid, right});
	}

	private void performStep_3027() {
		resetHighlights_3027();

		if (!isMerging_3027 && !mergeQueue_3027.isEmpty()) {
			int[] range_3027 = mergeQueue_3027.poll();
			left_3027 = range_3027[0];
			mid_3027 = range_3027[1];
			right_3027 = range_3027[2];
			temp_3027 = new int[right_3027 - left_3027 + 1];
			i_3027 = left_3027;
			j_3027 = mid_3027 + 1;
			k_3027 = 0;
			copying_3027 = false;
			isMerging_3027 = true;
			stepArea_3027.append("Langkah " + stepCount_3027++ +
					": Mulai merge dari " + left_3027 + " ke " + right_3027 + "\n");
			return;
		}

		if (isMerging_3027 && !copying_3027) {
			if (i_3027 <= mid_3027 && j_3027 <= right_3027) {
				labelArray_3027[i_3027].setBackground(Color.CYAN);
				labelArray_3027[j_3027].setBackground(Color.CYAN);
				if (array_3027[i_3027] <= array_3027[j_3027]) {
					temp_3027[k_3027++] = array_3027[i_3027++];
				} else {
					temp_3027[k_3027++] = array_3027[j_3027++];
				}
				stepArea_3027.append("Langkah " + stepCount_3027++ + ": Bandingkan dan salin elemen\n");
				return;
			} else if (i_3027 <= mid_3027) {
				temp_3027[k_3027++] = array_3027[i_3027++];
				stepArea_3027.append("Langkah " + stepCount_3027++ + ": Salin sisa kiri\n");
				return;
			} else if (j_3027 <= right_3027) {
				temp_3027[k_3027++] = array_3027[j_3027++];
				stepArea_3027.append("Langkah " + stepCount_3027++ + ": Salin sisa kanan\n");
				return;
			} else {
				copying_3027 = true;
				k_3027 = 0;
				return;
			}
		}

		if (copying_3027 && k_3027 < temp_3027.length) {
			array_3027[left_3027 + k_3027] = temp_3027[k_3027];
			labelArray_3027[left_3027 + k_3027].setText(String.valueOf(temp_3027[k_3027]));
			labelArray_3027[left_3027 + k_3027].setBackground(Color.GREEN);
			k_3027++;
			stepArea_3027.append("Langkah " + stepCount_3027++ + ": Tempelkan ke array utama\n");
			return;
		}

		if (copying_3027 && k_3027 == temp_3027.length) {
			isMerging_3027 = false;
			copying_3027 = false;
		}

		if (mergeQueue_3027.isEmpty() && !isMerging_3027) {
			stepArea_3027.append("Selesai.\n");
			stepButton_3027.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
		}
	}

	private void resetHighlights_3027() {
		if (labelArray_3027 == null) return;
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
		mergeQueue_3027.clear();
		isMerging_3027 = false;
		stepCount_3027 = 1;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MergeSortGUI_2511533027 gui = new MergeSortGUI_2511533027();
			gui.setVisible(true);
		});
	}
}