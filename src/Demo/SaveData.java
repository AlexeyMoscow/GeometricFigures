package Demo;

import Demo.Application;

import java.io.*;
import java.util.ArrayList;


public class SaveData {

    public static void loadFile() {
        try {
            FileInputStream fis = new FileInputStream("figuresList");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Application.figures = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();

        }
    }

    public static void saveFile() {

        try {
            FileOutputStream fos = new FileOutputStream("figuresList");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Application.figures);
            oos.close();
            fos.close();
        } catch (
                IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

