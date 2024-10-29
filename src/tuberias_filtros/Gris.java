/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuberias_filtros;

import java.awt.Color;
import java.awt.image.BufferedImage;


public class Gris {
    BufferedImage image;
    
    public BufferedImage escalaGrises(BufferedImage imagenActual){
        this.image = imagenActual;
        //variables que almacenan los pixeles
        int MediaPixel, ColorSRGB;
        Color colorAux;
        //Recorremos la imagen Pixel a Pixel;
        for(int i = 0; i < image.getWidth(); i++){
            for(int j = 0; j < image.getHeight(); j++){
                //Almacenamos el color del pixel
                colorAux = new Color(this.image.getRGB(i, j));
                //calculamos la media de los 3 canales(rojo, verde, azul);
                MediaPixel = (int)((colorAux.getRed()+colorAux.getGreen()+colorAux.getBlue())/3);
                //Cambiamosa formato SRGB
                ColorSRGB = (MediaPixel << 16 )|(MediaPixel << 8 )|MediaPixel;
                //Asignamos el nuevo valor al BufferedImage
                image.setRGB(i, j, ColorSRGB);
            }
        }
    return image;
    }
}
