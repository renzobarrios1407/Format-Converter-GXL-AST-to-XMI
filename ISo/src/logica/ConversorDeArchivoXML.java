/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.File;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;

/**
 *Esta clase se encarga de tener la instancia del document generado apartir del archivo
 */
public class ConversorDeArchivoXML implements Parser{
    private Document informacion_Documento;

    /**
     * se inicializan el documen con null ya q no se garantiza el envio de al instanciar la clase
     */
    public ConversorDeArchivoXML() {
        this.informacion_Documento = null;
    }
    /**
     * se crea por la posibilidad de inicializar a el moento de instanciar la clase
     * @param informacion_Documento 
     */
    public ConversorDeArchivoXML(Document informacion_Documento) {
        this.informacion_Documento = informacion_Documento;
    }
    

    public Document getInformacionDocumento() {
        return informacion_Documento;
    }

    public void setInformacionDocumento(Document informacion_Documento) {
        this.informacion_Documento = informacion_Documento;
    }
    /**
     * este metodo se encarga de realizar la convercion del archivo, a un documen con el fin de ser accesible desde el api
     * de jDon, por efectos de eficacia y no recargar la memoria se realiza la conversion del archivo sin de no recargar 
     * la memoria al momento de realizar el cargado de un nuevo archivo
     * @param archivoxml 
     */
    @Override
     public void generarDocumento(File archivoxml){
        try{
            DocumentBuilderFactory docfactori = DocumentBuilderFactory.newInstance();
            try {
                SAXBuilder builder = new SAXBuilder();
                DocumentBuilder docbuid = docfactori.newDocumentBuilder();
                //this.setInformacionDocumento(docbuid.parse(archivoxml));  
                this.setInformacionDocumento((Document)builder.build(archivoxml));
                // se invoca al modificador de el atributo documen, para almacenar la tranformacion del doc xmi
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
                out.println("\n\tPROBLEMAS EN EL PARSE...");
            }
        }catch(Exception e){
            out.println("\n\tPROBLEMAS EN EL METODO PARSE, DE LA CLASE PARSE..");
        }//nota: al momento de llamar a el metodo por efectos de integridad utilizar un NullPointException.
     }
    
}
