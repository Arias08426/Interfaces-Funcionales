package Prog.Funcional2.Map;
import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap02 {
    public static void main(String[] args) {

        HashMap<Integer, String> nombre = new HashMap<>();

        nombre.put(924, "Amalia Núñez");
        nombre.put(921, "Cindy Nero");
        nombre.put(700, "César Vázquez");
        nombre.put(219, "Víctor Tilla");
        nombre.put(537, "Alan Brito");
        nombre.put(605, "Esteban Quito ");

        System.out.println("Todas las entradas del diccionario extraídas con entrySet:");
        System.out.println(nombre.entrySet());

        System.out.println("\nEntradas del diccionario extraídas una a una:");
        for (Map.Entry pareja: nombre.entrySet()) {
            System.out.println(pareja);
        }
    }
}

