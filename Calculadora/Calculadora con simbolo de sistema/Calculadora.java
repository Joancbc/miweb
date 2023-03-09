import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculadora extends JFrame implements ActionListener{
 private JButton boton1, boton2, boton3, 
                 boton4, boton5, boton6, 
                 boton7, boton8, boton9,
                 boton0, botonSalir, botonPunto,
                 botonSuma, botonResta, botonMultiplicacion,
                 botonDivision, botonIgual, botonc;
 private JTextField textfield1;
 public float num1, num2;
 public String simbolo;
 
 public Calculadora(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Calculadora");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  

  boton1 = new JButton("1");
  boton1.setBounds(10,100,45,30);
  add(boton1);
  boton1.addActionListener(this);
  
  boton2 = new JButton("2");
  boton2.setBounds(62,100,45,30);
  add(boton2);
  boton2.addActionListener(this);
  
  boton3 = new JButton("3");
  boton3.setBounds(114,100,45,30);
  add(boton3);
  boton3.addActionListener(this);

  boton4 = new JButton("4");
  boton4.setBounds(10,140,45,30);
  add(boton4);
  boton4.addActionListener(this);
 
  boton5 = new JButton("5");
  boton5.setBounds(62,140,45,30);
  add(boton5);
  boton5.addActionListener(this);

  boton6 = new JButton("6");
  boton6.setBounds(114,140,45,30);
  add(boton6);
  boton6.addActionListener(this);
  
  boton7 = new JButton("7");
  boton7.setBounds(10,180,45,30);
  add(boton7);
  boton7.addActionListener(this);
  
  boton8 = new JButton("8");
  boton8.setBounds(62,180,45,30);
  add(boton8);
  boton8.addActionListener(this);
   
  boton9 = new JButton("9");
  boton9.setBounds(114,180,45,30);
  add(boton9);
  boton9.addActionListener(this);
  
  boton0 = new JButton("0");
  boton0.setBounds(62,220,45,30);
  add(boton0);
  boton0.addActionListener(this);
 
  botonPunto = new JButton(".");
  botonPunto.setBounds(10,220,45,30);
  add(botonPunto);
  botonPunto.addActionListener(this);

  botonSalir = new JButton("Salir");
  botonSalir.setBounds(114,260,96,30);
  add(botonSalir);
  botonSalir.addActionListener(this);
 
  botonSuma = new JButton("+");
  botonSuma.setBounds(165,100,45,30);
  add(botonSuma);
  botonSuma.addActionListener(this);
 
  botonResta = new JButton("-");
  botonResta.setBounds(165,140,45,30);
  add(botonResta);
  botonResta.addActionListener(this);
  
  botonMultiplicacion = new JButton("*");
  botonMultiplicacion.setBounds(165,180,45,30);
  add(botonMultiplicacion);
  botonMultiplicacion.addActionListener(this);
  
  botonDivision = new JButton("/");
  botonDivision.setBounds(165,220,45,30);
  add(botonDivision);
  botonDivision.addActionListener(this);
  
  botonIgual = new JButton("=");
  botonIgual.setBounds(114,220,45,30);
  add(botonIgual);
  botonIgual.addActionListener(this);
 
  botonc = new JButton("c");
  botonc.setBounds(10,260,45,30);
  add(botonc); 
  botonc.addActionListener(this);  

  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,80);
  add(textfield1);
  
  
  
 }

 public void actionPerformed(ActionEvent no){

  if(no.getSource() == boton1){
    textfield1.setText(textfield1.getText()+"1");
      
  }
  if(no.getSource() == boton2){
    textfield1.setText(textfield1.getText()+"2");

  }
  if(no.getSource() == boton3){
    textfield1.setText(textfield1.getText()+"3");

  }
  if(no.getSource() == boton4){
    textfield1.setText(textfield1.getText()+"4");

  }
  if(no.getSource() == boton5){
    textfield1.setText(textfield1.getText()+"5");

  }
  if(no.getSource() == boton6){
    textfield1.setText(textfield1.getText()+"6");

  }
  if(no.getSource() == boton7){
    textfield1.setText(textfield1.getText()+"7");

  }
  if(no.getSource() == boton8){
    textfield1.setText(textfield1.getText()+"8");

  }
  if(no.getSource() == boton9){
    textfield1.setText(textfield1.getText()+"9");

  }
  if(no.getSource() == boton0){
    textfield1.setText(textfield1.getText()+"0");

  }
  if(no.getSource() == botonPunto){
    textfield1.setText(textfield1.getText()+".");

  }
  if(no.getSource() == botonSuma){
     num1 = Float.parseFloat(textfield1.getText());
     simbolo = "+";
     textfield1.setText("");
  }
  if(no.getSource() == botonResta){
     num1 = Float.parseFloat(textfield1.getText());
     simbolo = "-";
     textfield1.setText("");
     
  }
  if(no.getSource() == botonMultiplicacion){
     num1 = Float.parseFloat(textfield1.getText());
     simbolo = "*";
     textfield1.setText("");
        
  }
  if(no.getSource() == botonDivision){
     num1 = Float.parseFloat(textfield1.getText());
     simbolo = "/";
     textfield1.setText("");
      
  }
 
  if(no.getSource() == botonSalir){
   System.exit(0);
  }
  if(no.getSource() == botonc){
   textfield1.setText("");
  
  }

  if(no.getSource() == botonIgual){
   num2 = Float.parseFloat(textfield1.getText());
  
   switch(simbolo){
   case"+": textfield1.setText(cero(num1 + num2));
   break;
   case"-": textfield1.setText(cero(num1 - num2));
   break;
   case"*": textfield1.setText(cero(num1 * num2));
   break;
   case"/": if(num2 == 0){textfield1.setText("Error");}
   else{
   textfield1.setText(cero(num1 / num2));
    
   }break;


   }


  }
 
  if(no.getSource() == botonPunto){
   if(!(textfield1.getText().contains("."))){
      textfield1.setText(textfield1.getText() + ".");
   
   }

  }

 }
 public String cero(float resultado){
  String retorno = "";
  
   retorno = Float.toString(resultado);
   if(resultado%1 == 0){
     retorno = retorno.substring(0,retorno.length()-2);
   }
   return retorno;
}

 public static void main(String args[]){
  Calculadora calculadora1 = new Calculadora();
  calculadora1.setBounds(0,0,235,340);
  calculadora1.setVisible(true);
  calculadora1.setResizable(false);
  calculadora1.setLocationRelativeTo(null);
 }
}



















