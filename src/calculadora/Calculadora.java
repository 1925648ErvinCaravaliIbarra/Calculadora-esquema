
package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import programa.Operaciones;
import programa.Validaciones;


public class Calculadora extends JFrame  {
   
   JPanel pflow,pflow2,pflow3;
   JLabel titulo1,titulo2,resultados;
   JTextField   numero1,  numero2, resolucion;
   JButton sumar,restar,multiplicar,dividir;
   
    
    private void initGUI(){
    
    titulo1= new JLabel("Numero1");
    titulo2= new JLabel("Numero2");
    numero1= new JTextField(8);
    numero2= new JTextField(8);
    pflow = new JPanel();
    pflow.setBorder(BorderFactory.createTitledBorder(null, "Ingreso de datos",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION,new Font("Calibri",Font.PLAIN,20),Color.BLACK));
    pflow.add(titulo1);pflow.add(numero1);pflow.add(titulo2);pflow.add(numero2);
    add(pflow);
    this.add(pflow,BorderLayout.NORTH);
    
    sumar= new JButton ("Sumar");
    restar= new JButton ("Restar");
    multiplicar= new JButton ("Multiplicar");
    dividir= new JButton ("Dividir");
    pflow2 = new JPanel(); 
    pflow2.add(sumar);
    pflow2.add(restar);
    pflow2.add(multiplicar);
    pflow2.add(dividir);
    this.add(pflow2,BorderLayout.CENTER);
      
    
    resultados= new JLabel("Resultado");
    resolucion= new JTextField(8);
    pflow3 = new JPanel(); 
    pflow3.add(resultados);
    pflow3.add(resolucion);
    this.add(pflow3,BorderLayout.SOUTH);
    
    
     ManejadoraEventos mEvento = new ManejadoraEventos();
     sumar.addActionListener(mEvento);
     restar.addActionListener(mEvento);
     multiplicar.addActionListener(mEvento);
     dividir.addActionListener(mEvento);
        
    
    
    }
  
    class ManejadoraEventos implements ActionListener {
         Operaciones op;
       public ManejadoraEventos()
        {
            op = new Operaciones();
        }

         double v1, v2;
         
        
           
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
         v1 = Validaciones.esDouble(numero1.getText());
         v2 = Validaciones.esDouble(numero2.getText());
         
             if(ae.getSource() == sumar){
              resolucion.setText(""+op.suma(v1, v2));
             }
             else if (ae.getSource() == restar){
              resolucion.setText(""+op.resta(v1, v2));
             }
             
             else if(ae.getSource() == multiplicar){
              resolucion.setText(""+op.multiplicación(v1, v2));
             }
             
             else if (ae.getSource() == dividir){
              resolucion.setText(""+op.divicion(v1, v2));
             }
        }

        
    }
    public  Calculadora(){
    initGUI();
   
/*configuracion basica de la ventana*/this.setTitle("Calculadora");//titulo de la ventana.
/*configuracion basica de la ventana*/this.setSize(400,160);// tamaño de la ventana ancho y alto respectivamente. 
                                      
/*configuracion basica de la ventana*/this.setLocationRelativeTo(null);//sin modificar en que zona de la pantalla quiero la presentacion.
/*configuracion basica de la ventana*/this.setVisible(true);// con esto hago visible la ventana.
/*configuracion basica de la ventana*/this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se cierra/abre la ventana. 
    };
    
    public static void main(String[] args) {
     Calculadora calculadroa = new Calculadora(); 
     
    };
    
}
