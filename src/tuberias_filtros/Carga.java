/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuberias_filtros;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author USER
 */
public class Carga {
    public BufferedImage imageActual;
    
    
    public BufferedImage abrirImagen(){
        //creamos un nuevo cuadro de dialogo para seleccionar la imagen
        JFileChooser selector = new JFileChooser();
        //Le damosun Titulo
        selector.setDialogTitle("Seleccione una imagen");
        //Filtramos los tipos de archivos
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG & GIF & BMP & PNG","jpg","gif","bmp","png");
        selector.setFileFilter(filtroImagen);
        //abrimos el cuadro de dialogo
        int flag = selector.showOpenDialog(null);
        // comprobamos que dio aceptar
        if(flag==JFileChooser.APPROVE_OPTION){
            try{
                //devuelve el fichero seleccionado
                File imagenseleccionada = selector.getSelectedFile();
                imageActual = ImageIO.read(imagenseleccionada);
            }catch(IOException e){
            
            }
        }
        return imageActual;
    }
}
