package Prog.Funcional2.Filter;
import java.util.Arrays;
import  java.util.List;
import java.util.stream.Collectors;
public class ExampleFilter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Santiago", "Yuli", "Juan Carlos", "David", "Sofia");

        List<String> filteredNames = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}

