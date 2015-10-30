
package exemploswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class ExemploSwitch {

  
    public static void main(String[] args) {
        String res=JOptionPane.showInputDialog("Dia en numero");
        int dia=Integer.parseInt(res);
        switch (dia){
            case 1:JOptionPane.showMessageDialog(null, "Luns");
                break;
            case 2:JOptionPane.showMessageDialog(null, "Martes");
                break;
            case 3:JOptionPane.showMessageDialog(null, "Miercoles");
                break;
            case 4:JOptionPane.showMessageDialog(null, "Jueves");    
                break;
            case 5:JOptionPane.showMessageDialog(null, "Viernes"); 
                break;
            case 6:JOptionPane.showMessageDialog(null, "Sabado");    
                break;
            case 7:JOptionPane.showMessageDialog(null, "Domingo");  
                break;
            default :JOptionPane.showMessageDialog(null, "Teclea un numero entre uno y 7");   
            
            
            
        }
    }
    
}
