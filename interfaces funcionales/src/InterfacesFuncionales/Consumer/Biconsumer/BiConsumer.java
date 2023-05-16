package InterfacesFuncionales.Consumer.Biconsumer;
import java.util.*;
public class BiConsumer {
        public static void main(String[] args)
        {

            Properties properties = new Properties();
            properties.put("Pen", 10);
            properties.put("Book", 500);
            properties.put("Clothes", 400);
            properties.put("Mobile", 5000);

            System.out.println("Properties 1: " + properties.toString());

            properties.forEach((k, v) -> {

                v = (int)v + 100;
                properties.replace(k, v);
            });

            properties.forEach(
                    (k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        }
    }


