package IGU;

import javax.swing.*;

public class MarcoEmergente extends JFrame {
    private int serie;

    public MarcoEmergente(int serie){
        setTitle("Plantilla");
        setSize(400,300);
        setLocationRelativeTo(null);/**Pone la vantana en el centro relativo de la pantalla**/
        setVisible(true);
        switch (serie){
            case 1:
                LaminaSecundaria ls1 = new LaminaSecundaria(1);
                add(ls1);
                break;
            case 2:
                LaminaSecundaria ls2 = new LaminaSecundaria(2);
                add(ls2);
                break;
            case 3:
                LaminaSecundaria ls3 = new LaminaSecundaria(3);
                add(ls3);
                break;
            case 4:
                LaminaSecundaria ls4 = new LaminaSecundaria(4);
                add(ls4);
                break;
            case 5:
                LaminaSecundaria ls5 = new LaminaSecundaria(5);
                add(ls5);
                break;
            case 6:
                LaminaSecundaria ls6 = new LaminaSecundaria(6);
                add(ls6);
                break;
            case 7:
                LaminaSecundaria ls7 = new LaminaSecundaria(7);
                add(ls7);
                break;
            case 8:
                LaminaSecundaria ls8 = new LaminaSecundaria(8);
                add(ls8);
                break;
            default:break;
        }







    }
}
