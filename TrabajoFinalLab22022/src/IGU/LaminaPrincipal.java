package IGU;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class LaminaPrincipal extends JPanel {
    private Image imagen;
    private Image imagen1;
    private Image imagen2;
    private Image imagen3;
    private Image imagen4;
    private Image imagen5;
    private Image imagen6;
    private Image imagen7;
    private Image imagen8;
    private Image imagen9;

    JButton botonLakers = new JButton("Lakers");
    JButton botonKnicks = new JButton("Knicks");
    JButton botonCeltics= new JButton("Celtics");
    JButton botonClipers= new JButton("Clipers");
    JButton botonBulls = new JButton("Bulls");
    JButton botonWarriors = new JButton("Warriors");
    JButton botonNets = new JButton("Nets");
    JButton botonPhila = new JButton("76Sixers");

    public LaminaPrincipal(){
        setLayout(null);
        add(botonKnicks);
        add(botonCeltics);
        add(botonClipers);
        add(botonBulls);
        add(botonWarriors);
        add(botonNets);
        add(botonPhila);
        add(botonLakers);
        botonLakers.setBounds(50,100,100,30);
        botonClipers.setBounds(50,150,100,30);
        botonKnicks.setBounds(250,100,100,30);
        botonCeltics.setBounds(250,150,100,30);
        botonWarriors.setBounds(50,200,100,30);
        botonNets.setBounds(250,200,100,30);
        botonPhila.setBounds(50,250,100,30);
        botonBulls.setBounds(250,250,100,30);
        OyenteNuevo mioyente = new OyenteNuevo();
        botonLakers.addActionListener(mioyente);
        botonBulls.addActionListener(mioyente);
        botonNets.addActionListener(mioyente);
        botonCeltics.addActionListener(mioyente);
        botonClipers.addActionListener(mioyente);
        botonKnicks.addActionListener(mioyente);
        botonPhila.addActionListener(mioyente);
        botonWarriors.addActionListener(mioyente);



    }
    private class OyenteNuevo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object botonPulsado=e.getSource();

            if (botonPulsado==botonLakers){
                MarcoEmergente marco = new MarcoEmergente(1);
            }
            if (botonPulsado==botonClipers){
                MarcoEmergente marco = new MarcoEmergente(2);
            }
            if (botonPulsado==botonKnicks){
                MarcoEmergente marco = new MarcoEmergente(3);
            }
            if (botonPulsado==botonCeltics){
                MarcoEmergente marco = new MarcoEmergente(4);
            }
            if (botonPulsado==botonWarriors){
                MarcoEmergente marco = new MarcoEmergente(5);
            }
            if (botonPulsado==botonNets){
                MarcoEmergente marco = new MarcoEmergente(6);
            }
            if (botonPulsado==botonBulls){
                MarcoEmergente marco = new MarcoEmergente(7);
            }
            if (botonPulsado==botonPhila){
                MarcoEmergente marco = new MarcoEmergente(8);
            }

        }

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        setBackground(Color.black);
        Font mifuente=new Font("Arial",Font.BOLD,20);
        Font mifuente2=new Font("Arial",Font.BOLD,14);
        g2.setFont(mifuente);
        g2.setColor(Color.WHITE);
        g2.drawString("NBA APP",165,50);
        g2.setFont(mifuente2);
        g2.drawString("¿Que plantilla deseas ver?",100,80);

        try {
            imagen= ImageIO.read(new File("pelota.png"));
            imagen1=ImageIO.read(new File("nba.png"));
            imagen2=ImageIO.read(new File("lakerlogo.png"));
            imagen3=ImageIO.read(new File("knicks.png"));
            imagen4=ImageIO.read(new File("clipers.png"));
            imagen5=ImageIO.read(new File("celticslogo.png"));
            imagen6=ImageIO.read(new File("warriorslogo.png"));
            imagen7=ImageIO.read(new File("nets.png"));
            imagen8=ImageIO.read(new File("phila.png"));
            imagen9=ImageIO.read(new File("bulls.png"));

        }catch (IOException e){
            System.out.println("Imagen no encontrada");
        }
        g.drawImage(imagen,130,28,null);
        g.drawImage(imagen1,140,280,null);
        g.drawImage(imagen2,0,100,null);
        g.drawImage(imagen3,196,91,null);
        g.drawImage(imagen4,5,148,null);
        g.drawImage(imagen5,201,145,null);
        g.drawImage(imagen6,8,200,null);
        g.drawImage(imagen7,201,195,null);
        g.drawImage(imagen8,8,250,null);
        g.drawImage(imagen9,201,245,null);






    }
}
