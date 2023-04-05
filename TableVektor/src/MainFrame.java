import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class MainFrame extends JFrame{

    MainFrame() {
        initComponents();
    }
    
    private void initComponents(){

        this.setSize(400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, 1));

        Vector<String> columNames = new Vector<>();
        columNames.add("Első");
        columNames.add("Második");
        columNames.add("Harmadik");

        // külső Vector-belső Vector...
        Vector<Vector<String>> data = new Vector<>(); 

        Vector<String> row = new Vector<>();
        row.add("1-1");
        row.add("1-2");
        row.add("1-3");
        data.add(row);

        // kinullázzuk
        row = null;
    
        // újratöltjük
        row = new Vector<>();
        row.add("2-1");
        row.add("2-2");
        row.add("2-3");
        data.add(row);

        // kinullázzuk
        row = null;
    
        // újratöltjük
        row = new Vector<>();
        row.add("3-1");
        row.add("3-2");
        row.add("3-3");
        data.add(row);
   
        DefaultTableModel dft = new DefaultTableModel(data, columNames);    
        JTable table = new JTable();
        table.setModel(dft);
   
        JScrollPane jsp = new JScrollPane(table);

        
        this.add(jsp);
    }
}
