package com.mycompany.appjava;
import com.mycompany.appjava.iu.Main;
public class AppJava {

    public static void main(String[] args) {
        // Accedo a la clase Main importando el archivo, y hago que la clase
        // sea visible para acceder a ella.
        Main app = new Main();
        app.setVisible(true);
        
    }
}
