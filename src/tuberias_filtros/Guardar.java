/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuberias_filtros;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author USER
 */
public class Guardar {
    BufferedImage image;
    
    
    public BufferedImage guardar(BufferedImage imagen) throws IOException{
        this.image = imagen;
        File file = new File("NewPicture.png");
        ImageIO.write(image,"png",file);
        return image;
    }
}
