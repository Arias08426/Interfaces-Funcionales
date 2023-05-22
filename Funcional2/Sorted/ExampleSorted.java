package Prog.Funcional2.Sorted;
import java.util.Arrays;
import java.util.List;

public class ExampleSorted {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,4,15,21,20,18,9,11);

        List<Integer> SortedNumeros = numeros.stream().filter(n -> n>10).sorted().toList();

        System.out.println(SortedNumeros);
    }
}
