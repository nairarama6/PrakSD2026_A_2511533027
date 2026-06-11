package pekan9_2511533027;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class TransmartPadang_2511533027 extends JFrame {
	
	private JComboBox<String> startCombo_3027;
    private JComboBox<String> goalCombo_3027;
    private JButton bfsButton_3027;
    private JButton dfsButton_3027;
    private JButton resetButton_3027;
    private JTextArea resultArea_3027;
    private GraphPanel_3027 graphPanel_3027;
    private Graph_3027 graph_3027;

    public TransmartPadang_2511533027() {
    	graph_3027 = new Graph_3027();
    	
        setTitle("BFS & DFS - Transmart Padang (2511533027)");
        setSize(1100, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initializeGUI_3027();

        setVisible(true);
    }
    
    private void initializeGUI_3027() {
    	JPanel topPanel_3027 = new JPanel();

        startCombo_3027 = new JComboBox<>(graph_3027.getVertices_3027().toArray(new String[0]));

        goalCombo_3027 = new JComboBox<>(graph_3027.getVertices_3027().toArray(new String[0]));
        
        bfsButton_3027 = new JButton("BFS");
        dfsButton_3027 = new JButton("DFS");
        resetButton_3027 = new JButton("RESET");

        topPanel_3027.add(new JLabel("Start"));
        topPanel_3027.add(startCombo_3027);

        topPanel_3027.add(new JLabel("Goal"));
        topPanel_3027.add(goalCombo_3027);
        
        topPanel_3027.add(bfsButton_3027);
        topPanel_3027.add(dfsButton_3027);
        topPanel_3027.add(resetButton_3027);

        add(topPanel_3027, BorderLayout.NORTH);
        
        graphPanel_3027 = new GraphPanel_3027();

        add(graphPanel_3027, BorderLayout.CENTER);

        resultArea_3027 = new JTextArea(4, 20);
        
        resultArea_3027.setEditable(false);

        JScrollPane scrollPane_3027 = new JScrollPane(resultArea_3027);

        add(scrollPane_3027, BorderLayout.SOUTH);

        bfsButton_3027.addActionListener(
                e -> runBFS_3027());

        dfsButton_3027.addActionListener(
                e -> runDFS_3027());

        resetButton_3027.addActionListener(
                e -> resetGraph_3027());
    }
    
    private void runBFS_3027() {

        String start_3027 = (String) startCombo_3027.getSelectedItem();

        String goal_3027 = (String) goalCombo_3027.getSelectedItem();

        SearchResult_3027 result_3027 = graph_3027.bfs_3027(start_3027, goal_3027);

        animateTraversal_3027("BFS", result_3027);
    }
    
    private void runDFS_3027() {

        String start_3027 = (String) startCombo_3027.getSelectedItem();

        String goal_3027 = (String) goalCombo_3027.getSelectedItem();

        SearchResult_3027 result_3027 = graph_3027.dfs_3027(start_3027, goal_3027);

        animateTraversal_3027("DFS", result_3027);
    }
    
    private void resetGraph_3027() {

        graphPanel_3027.resetGraph_3027();

        resultArea_3027.setText("");
    }
    
    private void animateTraversal_3027(String algorithm_3027, SearchResult_3027 result_3027) {
    	graphPanel_3027.resetGraph_3027();

        List<String> visited_3027 = result_3027.getVisited_3027();

        Timer timer_3027 = new Timer(700, null);

        final int[] index_3027 = {0};
        
        timer_3027.addActionListener(
                e -> {
                    if (index_3027[0] < visited_3027.size()) {
                        graphPanel_3027.visitNode_3027(visited_3027.get(index_3027[0]));
                        index_3027[0]++;
                    } else {
                        timer_3027.stop();
                        graphPanel_3027.setFinalPath_3027(result_3027.getPath_3027());
                        displayResult_3027(
                                algorithm_3027,
                                result_3027);
                    }
                });

        timer_3027.start();
    }
    
    private void displayResult_3027(String algorithm_3027, SearchResult_3027 result_3027) {
    	 String output_3027 = "Algoritma : " + algorithm_3027 + "\n\n" + "Urutan Kunjungan :\n"  + result_3027.getVisited_3027().stream().collect(Collectors.joining(" -> "))
                         + "\n\nPath :\n" + result_3027.getPath_3027().stream().collect(Collectors.joining(" -> "))
                         + "\n\nJumlah Node Dieksplorasi : " + result_3027.getExploredNodes_3027();
         resultArea_3027.setText(output_3027);
    }
    
    class SearchResult_3027 {
    	 private List<String> path_3027;
         private List<String> visited_3027;
         private int exploredNodes_3027;
         public SearchResult_3027(List<String> path_3027, List<String> visited_3027, int exploredNodes_3027) {
             this.path_3027 = path_3027;
             this.visited_3027 = visited_3027;
             this.exploredNodes_3027 = exploredNodes_3027;
    }
         
    public List<String> getPath_3027() {
             return path_3027;
    }
    
    public List<String> getVisited_3027() {
        return visited_3027;
    }
    
    public int getExploredNodes_3027() {
        return exploredNodes_3027;
    }
}
    
    class Graph_3027 {
        private Map<String, List<String>> graph_3027;
        public Graph_3027() {
            graph_3027 = new LinkedHashMap<>();
            buildGraph_3027();
        }
        
        private void addEdge_3027(String source_3027, String destination_3027) {
            graph_3027.putIfAbsent(source_3027, new ArrayList<>());

            graph_3027.putIfAbsent(destination_3027, new ArrayList<>());

            graph_3027.get(source_3027).add(destination_3027);

            graph_3027.get(destination_3027).add(source_3027);
        }
        
        private void buildGraph_3027() {

            addEdge_3027("Pintu Utama", "Customer Service");

            addEdge_3027("Pintu Utama", "ATM Center");

            addEdge_3027("Pintu Utama", "Area Parkir");

            addEdge_3027("Customer Service", "Hypermarket");

            addEdge_3027("Customer Service", "Food Court");

            addEdge_3027("Hypermarket", "Food Court");

            addEdge_3027("Hypermarket", "Mushalla");

            addEdge_3027("Hypermarket", "Eskalator");

            addEdge_3027("Food Court", "Bioskop XXI");

            addEdge_3027("Food Court", "Timezone");

            addEdge_3027("ATM Center", "Mushalla");

            addEdge_3027("ATM Center", "Area Parkir");

            addEdge_3027("Eskalator", "Bioskop XXI");

            addEdge_3027("Eskalator", "Timezone");

            addEdge_3027("Bioskop XXI", "Timezone");
        }
        
        public Set<String> getVertices_3027() {

            return graph_3027.keySet();
        }

        public Map<String, List<String>> getGraph_3027() {

            return graph_3027;
        }
        
        public SearchResult_3027 bfs_3027(String start_3027, String goal_3027) {

            Queue<String> queue_3027 = new LinkedList<>();

            Set<String> visited_3027 = new LinkedHashSet<>();

            Map<String, String> parent_3027 = new HashMap<>();

            queue_3027.add(start_3027);

            visited_3027.add(start_3027);

            while (!queue_3027.isEmpty()) {
                String current_3027 =
                        queue_3027.poll();
                if (current_3027.equals(
                        goal_3027)) {
                    break;
                }
                for (String neighbor_3027 : graph_3027.get(current_3027)) {
                    if (!visited_3027.contains(neighbor_3027)) {
                        visited_3027.add(neighbor_3027);

                        parent_3027.put(neighbor_3027, current_3027);

                        queue_3027.add(neighbor_3027);
                    }
                }
            }
            return buildResult_3027(goal_3027, parent_3027, visited_3027);
        }
        
        public SearchResult_3027 dfs_3027(String start_3027, String goal_3027) {
            Stack<String> stack_3027 = new Stack<>();

            Set<String> visited_3027 = new LinkedHashSet<>();

            Map<String, String> parent_3027 = new HashMap<>();

            stack_3027.push(start_3027);

            while (!stack_3027.isEmpty()) {
                String current_3027 = stack_3027.pop();
                if (!visited_3027.contains(current_3027)) {
                    visited_3027.add(current_3027);
                    if (current_3027.equals(goal_3027)) {
                        break;
                    }
                    List<String> neighbors_3027 = graph_3027.get(current_3027);
                    for (int i_3027 = neighbors_3027.size() - 1;
                         i_3027 >= 0;
                         i_3027--) {
                        String next_3027 = neighbors_3027.get(i_3027);
                        if (!visited_3027.contains(next_3027)) {
                            parent_3027.put(next_3027, current_3027);
                            stack_3027.push(next_3027);
                        }
                    }
                }
            }
            return buildResult_3027(
                    goal_3027,
                    parent_3027,
                    visited_3027);
        }
        
        private SearchResult_3027 buildResult_3027(String goal_3027, Map<String, String> parent_3027, Set<String> visited_3027) {
            List<String> path_3027 = new ArrayList<>();

            String current_3027 = goal_3027;
            while (current_3027 != null) {
                path_3027.add(current_3027);
                current_3027 = parent_3027.get(current_3027);
            }
            Collections.reverse(path_3027);
            return new SearchResult_3027(path_3027, new ArrayList<>(visited_3027), visited_3027.size());
        }
    }
    
    class GraphPanel_3027 extends JPanel {
        private Map<String, Point> positions_3027;
        private Set<String> visitedNodes_3027;
        private String currentNode_3027;
        private List<String> finalPath_3027;
        public GraphPanel_3027() {
            visitedNodes_3027 = new LinkedHashSet<>();

            finalPath_3027 = new ArrayList<>();
            initializePositions_3027();
            setBackground(Color.WHITE);
        }
        private void initializePositions_3027() {
            positions_3027 = new HashMap<>();
            positions_3027.put("Bioskop XXI", new Point(450, 80));
            positions_3027.put("Timezone", new Point(650, 80));
            positions_3027.put("Eskalator", new Point(550, 180));
            positions_3027.put("Food Court", new Point(550, 300));
            positions_3027.put("Hypermarket", new Point(350, 300));
            positions_3027.put("Customer Service", new Point(750, 300));
            positions_3027.put("Mushalla", new Point(350, 450));
            positions_3027.put("ATM Center", new Point(750, 450));
            positions_3027.put("Pintu Utama", new Point(450, 600));
            positions_3027.put("Area Parkir", new Point(650, 600));
        }

        public void visitNode_3027(String node_3027) {
            currentNode_3027 = node_3027;
            visitedNodes_3027.add(node_3027);
            repaint();
        }
        
        public void setFinalPath_3027(List<String> path_3027) {
            finalPath_3027 = path_3027;
            currentNode_3027 = null;
            repaint();
        }
        
        public void resetGraph_3027() {
            visitedNodes_3027.clear();
            finalPath_3027.clear();
            currentNode_3027 = null;
            repaint();
        }
        
        @Override
        protected void paintComponent(Graphics g_3027) {
            super.paintComponent(g_3027);
            Graphics2D g2_3027 = (Graphics2D) g_3027;
            drawEdges_3027(g2_3027);
            drawNodes_3027(g2_3027);
        }
        
        private void drawEdges_3027(Graphics2D g2_3027) {
            for (String node_3027 : graph_3027.getGraph_3027().keySet()) {
                Point p1_3027 = positions_3027.get(node_3027);
                for (String neighbor_3027 : graph_3027.getGraph_3027().get(node_3027)) {
                    Point p2_3027 = positions_3027.get(neighbor_3027);
                    boolean isPath_3027 = isEdgeInPath_3027(node_3027, neighbor_3027);
                    if (isPath_3027) {
                        g2_3027.setColor(Color.RED);
                        g2_3027.setStroke(new BasicStroke(4));
                    } else {
                        g2_3027.setColor(Color.GRAY);
                        g2_3027.setStroke(new BasicStroke(2));
                    }
                    g2_3027.drawLine(p1_3027.x, p1_3027.y, p2_3027.x, p2_3027.y);
                }
            }
        }
        
        private boolean isEdgeInPath_3027(String source_3027, String destination_3027) {
            for (int i_3027 = 0; i_3027 < finalPath_3027.size() - 1; i_3027++) {
                String a_3027 = finalPath_3027.get(i_3027);
                String b_3027 = finalPath_3027.get(i_3027 + 1);
                if ((a_3027.equals(source_3027) && b_3027.equals(destination_3027)) ||
                        (a_3027.equals(destination_3027) && b_3027.equals(source_3027))) {
                    return true;
                }
            }
            return false;
        }
        
        private void drawNodes_3027(Graphics2D g2_3027) {
            for (String node_3027 : positions_3027.keySet()) {
                Point p_3027 = positions_3027.get(node_3027);
                if (node_3027.equals(currentNode_3027)) {
                    g2_3027.setColor(Color.YELLOW);
                }
                else if (finalPath_3027.contains(node_3027)) {
                    g2_3027.setColor(Color.RED);
                }
                else if (visitedNodes_3027.contains(node_3027)) {
                    g2_3027.setColor(Color.GREEN);
                } else {
                    g2_3027.setColor(Color.CYAN);
                }
                g2_3027.fillOval(p_3027.x - 25, p_3027.y - 25, 50, 50);
                g2_3027.setColor(Color.BLACK);
                g2_3027.drawOval(p_3027.x - 25, p_3027.y - 25, 50, 50);
                g2_3027.drawString(node_3027, p_3027.x - 40, p_3027.y - 35);
            }
        }
    }
    
    public static void main(
            String[] args) {

        SwingUtilities.invokeLater(
                () -> new TransmartPadang_2511533027());
    }
       
}

