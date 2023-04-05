
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;


public class MainFrame extends JFrame implements ActionListener{

    private JTable table;
    private DefaultTableModel dft;

    MainFrame() {
        initComponents();
    }
    
    private void initComponents(){

        this.setSize(400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // this.setLayout(new GridLayout(1, 1));
        this.setLayout(null);

        JButton button = new JButton("Go");
        button.setBounds(310, 130, 80, 25);
        this.add(button);

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
   
        dft = new DefaultTableModel(data, columNames);    
        table = new JTable();
        table.setModel(dft);
        
   
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 0, 400, 100);

        this.add(jsp);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event){

                getProperties();
                getSelectedData();
                setData();
                addRows();
                

            }
        });
    }

    private void getProperties(){
        int row = table.getRowCount();
        System.out.println(row);
        int col = table.getColumnCount();
        System.out.println(col);
    }

    private void getSelectedData(){
        int row = table.getSelectedRow();
        int col = table.getSelectedColumn();

        String data = dft.getValueAt(row, col).toString();
        System.out.println(data);
    }

    private void setData(){
        table.setValueAt("Módosítva", 0, 0);
    }

    private void addRows(){
        Vector<String> newRow = new Vector<>();
        newRow.add("New01");
        newRow.add("New02");
        newRow.add("New03");

        for(int i = 0; i < 5; i++){
            dft.addRow(newRow);
        }
        
    }
}
