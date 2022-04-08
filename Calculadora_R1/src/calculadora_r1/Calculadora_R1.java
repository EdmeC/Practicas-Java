/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_r1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

/**
 *
 * @author edme
 */
public class Calculadora_R1 extends JFrame implements ActionListener {
/*Espacio para texto*/
JTextField txtField = new JTextField();

/*Panel de Botones*/
JButton boton0 = new JButton("0"); 
JButton boton1 = new JButton("1");
JButton boton2 = new JButton("2");
JButton boton3 = new JButton("3");
JButton boton4 = new JButton("4");
JButton boton5 = new JButton("5");
JButton boton6 = new JButton("6");
JButton boton7 = new JButton("7");
JButton boton8 = new JButton("8");
JButton boton9 = new JButton("9");

/*Panel de operaciones*/
JButton suma = new JButton("+");
JButton resta = new JButton("-");
JButton multiplicacion = new JButton("*");
JButton division = new JButton("/");
JButton igual = new JButton("=");
JButton clear = new JButton("C");

/*Boton para espacio*/
JButton espacio = new JButton("");

/*Operaciones*/
public float operador1; 
public float operador2; 
String operador; 


    Calculadora_R1(){
        setTitle("Calculadora"); 
        /*setSize (ancho, largo)*/
        setSize(360,440); 
        setLayout(null); 
       
        /*setBounds parameters (x,y, largo, ancho*/
        txtField.setBounds(20,20,320,50);       
         
        boton1.setBounds(20,70,80,80); 
        boton1.setText("1"); 
        boton1.addActionListener(this);
        
        boton2.setBounds(100,70,80,80); 
        boton2.setText("2"); 
        boton2.addActionListener(this);        
        
        boton3.setBounds(180,70,80,80); 
        boton3.setText("3"); 
        boton3.addActionListener(this);        
        
        suma.setBounds(260,70,80,80); 
        suma.setText("+"); 
        suma.addActionListener(this);
        
        boton4.setBounds(20,150,80,80); 
        boton4.setText("4"); 
        boton4.addActionListener(this);

        boton5.setBounds(100,150,80,80); 
        boton5.setText("5"); 
        boton5.addActionListener(this);

        boton6.setBounds(180,150,80,80); 
        boton6.setText("6"); 
        boton6.addActionListener(this);
        
        resta.setBounds(260,150,80,80); 
        resta.setText("-"); 
        resta.addActionListener(this);
       
        boton7.setBounds(20,230,80,80); 
        boton7.setText("7"); 
        boton7.addActionListener(this);        

        boton8.setBounds(100,230,80,80); 
        boton8.setText("8"); 
        boton8.addActionListener(this);

        boton9.setBounds(180,230,80,80); 
        boton9.setText("9"); 
        boton9.addActionListener(this);
        
        multiplicacion.setBounds(260,230,80,80); 
        multiplicacion.setText("*"); 
        multiplicacion.addActionListener(this);
        
        clear.setBounds(20,310,80,80); 
        clear.setText("C"); 
        clear.addActionListener(this);    
        
        boton0.setBounds(100,310,80,80); 
        boton0.setText("0"); 
        boton0.addActionListener(this);
        
        igual.setBounds(180,310,80,80); 
        igual.setText("="); 
        igual.addActionListener(this);
        
        division.setBounds(260,310,80,80); 
        division.setText("/"); 
        division.addActionListener(this);
        
        espacio.setBounds(0,390,80,80);  
        espacio.addActionListener(this);

        getContentPane().add(boton0);
        getContentPane().add(boton1); 
        getContentPane().add(boton2);
        getContentPane().add(boton3);
        getContentPane().add(boton4);
        getContentPane().add(boton5);
        getContentPane().add(boton6);
        getContentPane().add(boton7);
        getContentPane().add(boton8);
        getContentPane().add(boton9);
        getContentPane().add(suma);
        getContentPane().add(resta);
        getContentPane().add(multiplicacion);
        getContentPane().add(division);
        getContentPane().add(clear);
        getContentPane().add(igual);
        getContentPane().add(txtField); 
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true); 
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora_R1 e = new Calculadora_R1(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton0){
        txtField.setText(this.txtField.getText() + "0");
        }
        
        if(e.getSource() == boton1){
        txtField.setText(this.txtField.getText() + "1");
        }
        
        if(e.getSource() == boton2){
        txtField.setText(this.txtField.getText() + "2");
        }
        
        if(e.getSource() == boton3){
        txtField.setText(this.txtField.getText() + "3");
        }
        
        if(e.getSource() == boton4){
        txtField.setText(this.txtField.getText() + "4");
        }
        
        if(e.getSource() == boton5){
        txtField.setText(this.txtField.getText() + "5");
        }
        
        if(e.getSource() == boton6){
        txtField.setText(this.txtField.getText() + "6");
        }
        
        if(e.getSource() == boton7){
        txtField.setText(this.txtField.getText() + "7");
        }
        
        if(e.getSource() == boton8){
        txtField.setText(this.txtField.getText() + "8");
        }
        
        if(e.getSource() == boton9){
        txtField.setText(this.txtField.getText() + "9");
        }
        
        if(e.getSource() == suma){
        this.operador1=Float.parseFloat(this.txtField.getText()); 
        this.operador="+";
        this.txtField.setText(" ");
 
        }

        if(e.getSource() == resta){
        this.operador1=Float.parseFloat(this.txtField.getText()); 
        this.operador="-";
        this.txtField.setText(" ");
        }

        if(e.getSource() == multiplicacion){
        this.operador1=Float.parseFloat(this.txtField.getText()); 
        this.operador="*";
        this.txtField.setText(" ");
        }        
        

        if(e.getSource() == division){
        this.operador1=Float.parseFloat(this.txtField.getText()); 
        this.operador="/";
        this.txtField.setText(" ");
        }        
        
        
        if(e.getSource() == igual){
        this.operador2=Float.parseFloat(this.txtField.getText()); 
        
        switch(this.operador){
            case "+": this.txtField.setText(Float.toString(this.operador1+this.operador2));break;
            case "-": this.txtField.setText(Float.toString(this.operador1-this.operador2));break;
            case "*": this.txtField.setText(Float.toString(this.operador1*this.operador2));break;
            case "/": this.txtField.setText(Float.toString(this.operador1/this.operador2));break; 
        }
        }
        
        if(e.getSource() == clear){
        txtField.setText("");
        operador1 = 0; 
        operador2 = 0; 
        }
         
    }
    
}
