package InterfacesFuncionales.Consumer;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class interfazFuncional {
    public class ConsumerExample{
        public static void main(String[] args) {
        List <Double> values = Arrays.asList(20.5,100d,26d,50.5d,400d);
        Consumer <List<Double>> sqrtConsumer= list -> {
            for(int i=0;i < list.size();i ++){
            list.set(i, Math.sqrt(list.get(i)));
            }
        };
        Consumer<List<Double>> printingConsumer = list -> list.stream().forEach(System.out::println);
        sqrtConsumer.andThen(printingConsumer).accept(values);
        }
    }
}
