package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println(6 / 2 * (3 + 3));
    }


    public static convertImg(String inputImgPath,
                                     String outputImgPath,
                                     String formatType)

            throws IOException
    {

        // Creating an object  of FileInputStream to read
        FileInputStream inputStream
                = new FileInputStream(inputImgPath);

        // Creating an object  of FileOutputStream to write
        FileOutputStream outputStream
                = new FileOutputStream(outputImgPath);

        // Reading the  input image from file
        BufferedImage inputImage
                = ImageIO.read(inputStream);

        // Writing to the output image in specified format
        boolean result = ImageIO.write(
                inputImage, formatType, outputStream);

        // Closing the streams in order to avoid read write
        // operations
        outputStream.close();
        inputStream.close();

        return result;
    }
    private static boolean isPNG(File file) {
        return file.isFile() && file.getName().toLowerCase().endsWith(".png");
    }
}