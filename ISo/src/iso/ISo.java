/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iso;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.AnalizadorArchivo;
import logica.XMIGenerator;
 
/**
 *
 * @author dreicon
 */
public class ISo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnalizadorArchivo a = new AnalizadorArchivo();
        JFileChooser f = new JFileChooser();     
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XML & XMI", "xml", "xmi");
        f.setFileFilter(filter); 
        int op = f.showOpenDialog(f);
        XMIGenerator xmi = new XMIGenerator();
      //  xmi.generate("",null ,null);
        if(op == JFileChooser.APPROVE_OPTION){
            File fichero = f.getSelectedFile();
            //a.getArchivo().generarDocumento(fichero);
           // a.mostrarInformacion(a.getNodos("staff"));

        }else{
            JOptionPane.showMessageDialog(null,"Ejemplo","Verifique el contenido del archivo, por que este se encuentra en blanco o simple mente no es archivo valido.",JOptionPane.INFORMATION_MESSAGE);
        }
          
    }
    
}
