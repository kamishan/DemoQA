package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MetodosEspeciales {

    public static Properties properties;

    public static void configurarPropiedades(){
        properties = new Properties();
        try {
            properties.load(new FileReader("configuracion.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
