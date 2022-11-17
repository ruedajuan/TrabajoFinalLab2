package IGU;

import javax.swing.*;
import java.awt.*;

public class LaminaSecundaria extends JPanel {

    private int codigo;
    public LaminaSecundaria(int codigo){
        this.codigo=codigo;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        setBackground(Color.black);
        Font mifuente = new Font("Arial",Font.BOLD,20);
        g2.setFont(mifuente);
        switch (codigo){
            case 1:
                g2.setColor(Color.ORANGE);
                g2.drawString("Lakers",160,30);
                g2.setFont(new Font("courier",Font.BOLD,18));
                g2.setColor(Color.RED);
                g2.drawString("Dorsal",10,60);
                g2.drawString("Nombre",100,60);
                g2.drawString("Posición",210,60);
                g2.drawString("Estatura",300,60);
                g2.setFont(new Font("Time new roman",Font.BOLD,16));
                g2.setColor(Color.WHITE);
                g2.drawString(" #6           Lebron James           SF              2.06m",20,90);
                g2.drawString(" #0           Russel Westbrook   BA             1.91m",20,120);
                g2.drawString(" #3           Anthony Davis          AP              2.08m",20,150);
                g2.drawString("#21          Patrick Beverley       BA             1.85m",20,180);
                g2.drawString(" #4           Lonnie Walker IV       G               1.93m",20,210);
                break;
            case 2:
                g2.setColor(Color.ORANGE);
                g2.drawString("Clippers",160,30);
                g2.setFont(new Font("courier",Font.BOLD,18));
                g2.setColor(Color.RED);
                g2.drawString("Dorsal",10,60);
                g2.drawString("Nombre",100,60);
                g2.drawString("Posición",210,60);
                g2.drawString("Estatura",300,60);
                g2.setFont(new Font("Time new roman",Font.BOLD,16));
                g2.setColor(Color.WHITE);
                g2.drawString("#13           Paul George            E                2.03m",20,90);
                g2.drawString(" #8            Marcus Morris        SF              2.03m",20,120);
                g2.drawString("#40           Ivica Zubac              C                2.13m",20,150);
                g2.drawString(" #1            Reggie Jackson     BA             1.88m",20,180);
                g2.drawString(" #2            Kawhi Leonard       SF              2.01m",20,210);
                break;
            case 3:
                g2.setColor(Color.ORANGE);
                g2.drawString("Knicks",160,30);
                g2.setFont(new Font("courier",Font.BOLD,18));
                g2.setColor(Color.RED);
                g2.drawString("Dorsal",10,60);
                g2.drawString("Nombre",100,60);
                g2.drawString("Posición",210,60);
                g2.drawString("Estatura",300,60);
                g2.setFont(new Font("Time new roman",Font.BOLD,16));
                g2.setColor(Color.WHITE);
                g2.drawString("#11         Jalen Brunson         BA             1.85m",20,90);
                g2.drawString("#30         Julius Randle           AP              2.03m",20,120);
                g2.drawString(" #9          RJ Barrett                   E               1.98m",20,150);
                g2.drawString("#13         Evan Fournier           E               1.98m",20,180);
                g2.drawString("#23         Mitchell Robinson    C               2.13m",20,210);
                break;
            case 4:
                g2.setColor(Color.ORANGE);
                g2.drawString("Celtics",160,30);
                g2.setFont(new Font("courier",Font.BOLD,18));
                g2.setColor(Color.RED);
                g2.drawString("Dorsal",10,60);
                g2.drawString("Nombre",100,60);
                g2.drawString("Posición",210,60);
                g2.drawString("Estatura",300,60);
                g2.setFont(new Font("Time new roman",Font.BOLD,16));
                g2.setColor(Color.WHITE);
                g2.drawString("#36           Marcus  Smart         BA             1.93m",20,90);
                g2.drawString(" #0            Jayson Tatum         SF              2.03m",20,120);
                g2.drawString(" #7            Jaylen Brown          E                1.98m",20,150);
                g2.drawString("#42           Al Horford                C                 2.06m",20,180);
                g2.drawString("#12           Grant Williams        AP              1.98m",20,210);
                break;
            case 5:
                g2.setColor(Color.ORANGE);
                g2.drawString("Warriors",160,30);
                g2.setFont(new Font("courier",Font.BOLD,18));
                g2.setColor(Color.RED);
                g2.drawString("Dorsal",10,60);
                g2.drawString("Nombre",100,60);
                g2.drawString("Posición",210,60);
                g2.drawString("Estatura",300,60);
                g2.setFont(new Font("Time new roman",Font.BOLD,16));
                g2.setColor(Color.WHITE);
                g2.drawString("#30           Stephen Curry         BA             1.88m",20,90);
                g2.drawString("#23           Draymond Green     AP             1.98m",20,120);
                g2.drawString("#11           Klay Thompson        E              1.98m",20,150);
                g2.drawString(" #5            Kevon Looney          C               2.06m",20,180);
                g2.drawString("#22           Andrew Wiggins      SF             2.01m",20,210);
                break;
            case 6:
                g2.setColor(Color.ORANGE);
                g2.drawString("Nets",170,30);
                g2.setFont(new Font("courier",Font.BOLD,18));
                g2.setColor(Color.RED);
                g2.drawString("Dorsal",10,60);
                g2.drawString("Nombre",100,60);
                g2.drawString("Posición",200,60);
                g2.drawString("Estatura",290,60);
                g2.setFont(new Font("Time new roman",Font.BOLD,16));
                g2.setColor(Color.WHITE);
                g2.drawString(" #7            Kevin Durant         AP             2.08m",20,90);
                g2.drawString("#33           Nic Claxton            AP             2.11m",20,120);
                g2.drawString("#11           Kyrie Irving            BA             1.88m",20,150);
                g2.drawString("#12           Joe Harris               SF             1.98m",20,180);
                g2.drawString("#00           Royce O'Neale      AP             1.96m",20,210);
                break;
            case 7:
                g2.setColor(Color.ORANGE);
                g2.drawString("Bulls",170,30);
                g2.setFont(new Font("courier",Font.BOLD,18));
                g2.setColor(Color.RED);
                g2.drawString("Dorsal",10,60);
                g2.drawString("Nombre",100,60);
                g2.drawString("Posición",200,60);
                g2.drawString("Estatura",290,60);
                g2.setFont(new Font("Time new roman",Font.BOLD,16));
                g2.setColor(Color.WHITE);
                g2.drawString("#11        DeMar DeRozan       SF           1.98m",20,90);
                g2.drawString(" #8           Zach LaVine             E             1.96m",20,120);
                g2.drawString(" #9           Nikola Vucevic        C             2.08m",20,150);
                g2.drawString("#12          Ayo Dosunmu         E             1.93m",20,180);
                g2.drawString(" #6           Alex Caruso             E             1.96m",20,210);
                break;
            case 8:
                g2.setColor(Color.ORANGE);
                g2.drawString("Sixers",170,30);
                g2.setFont(new Font("courier",Font.BOLD,18));
                g2.setColor(Color.RED);
                g2.drawString("Dorsal",20,60);
                g2.drawString("Nombre",100,60);
                g2.drawString("Posición",200,60);
                g2.drawString("Estatura",290,60);
                g2.setFont(new Font("Time new roman",Font.BOLD,16));
                g2.setColor(Color.WHITE);
                g2.drawString("#21           Joel Embiid              C             2.03m",20,90);
                g2.drawString(" #1           James Harden          E             1.96m",20,120);
                g2.drawString(" #0           Tyrese Maxey           BA           1.88m",20,150);
                g2.drawString("#17           P.J Tucker                AP           1.96m",20,180);
                g2.drawString("#12           Tobias Harris           AP          2.01m",20,210);
                break;
            default:break;

        }

    }
}
