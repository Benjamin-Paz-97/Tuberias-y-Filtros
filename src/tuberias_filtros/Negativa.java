/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuberias_filtros;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author USER
 */
public class Negativa {
    public BufferedImage image;
    public int r,g,b;
    public Color color;
    public Negativa(){}
    
    //invierte lo bytes de una imagen
    public BufferedImage SetInvertir(BufferedImage imagen){
        this.image = imagen;
        for(int i = 0; i < image.getWidth(); i++){
            for(int j = 0; j<image.getHeight(); j++){
                //seobtiene el color del pixel
                color = new Color(image.getRGB(i, j));
                //se extraen los valores RGB
                r = color.getRed();
                g = color.getGreen();
                b = color.getBlue();
                //se le coloca a la nueva imagen con los colores invertidos
                image.setRGB(i, j, new Color(255-r,255-g,255-b).getRGB());
            }
        }
        return image;
    }
    
    public BufferedImage getImage(){
        return this.image;
    }
}
