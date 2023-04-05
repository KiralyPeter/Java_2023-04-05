import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame{

    MainFrame() {
        initComponents();
    }
    
    private void initComponents(){

        this.setSize(400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, 1));

        // kimkommentezve, hogy másik (tömbös) konstruktort próbálhassunk ki
        // JTable table = new JTable(5, 4);

        // adatokat tartalmazó 2D tömb:
        String[][] data = {{"1-1", "1-2", "1-3"},
                           {"2-1", "2-2", "2-3"}, 
                           {"3-1", "3-2", "3-3"}};

        String[] columnNames = {"Elso", "Masodik", "Harmadik"};
        
        // másik konstruktor ami a fenti tömböket használja paraméterként
        JTable table = new JTable(data, columnNames);

        // ScrollPane-t létrehozunk és hozzáadjuk a JTable példányt
        JScrollPane jsp = new JScrollPane(table);

        // a JFrame-hez hozzáadjuk a ScrollPane-t
        this.add(jsp);
    }
}
