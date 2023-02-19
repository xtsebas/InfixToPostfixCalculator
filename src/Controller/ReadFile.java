package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    /**
     *Lee la ruta del archivo donde se encuentra el Postfix
     * @param fpath
     * @return data
     */
    public static String text(String fpath){
        String data = "xd";
        try {
            File myObj = new File(fpath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }
}
//CODIGO TOMADO DE LA HOJA DE TRABAJO 2
//EQUIPO NUMERO 4
//INTEGRANTES SEBASTIAN HUERTAS, XAVIER LOPEZ, GERSON RAMIREZ