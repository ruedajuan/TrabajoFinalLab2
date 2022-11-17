package IGU;

import javax.swing.*;

public class MarcoPrincipal extends JFrame {
    public MarcoPrincipal(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Nba");
        LaminaPrincipal l1 = new LaminaPrincipal();
        add(l1);

    }
}
