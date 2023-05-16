package InterfacesFuncionales.Consumer.BiFunction;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MyFunctionTest {
    public static void main(String[] args) {
        Function<String,Integer> myFunction = MyFunctionTest::multiplyWord;
        BiFunction <String, String, Integer> myBiFunction = MyFunctionTest::multiplyBiWord;

        Map<String, Function<String, Integer>> myFunctionMap = new HashMap<>();
        myFunctionMap.put("*",myFunction);
        myFunctionMap.put("+",MyFunctionTest::addWord);
        myFunctionMap.put("-",MyFunctionTest::substractWord);
        myFunctionMap.put("integer", Integer::new);

        System.out.println(myFunctionMap.get("*").apply("Mexico"));
        System.out.println(myFunctionMap.get("+").apply("Mexico"));
        System.out.println(myFunctionMap.get("-").apply("Mexico"));
        System.out.println(myFunctionMap.get("integer").apply("120"));
    }

    public static int multiplyBiWord(String word,String wordSecond){
        return 10 * word.length() * wordSecond.length();
    }
    public static int multiplyWord(String word){
        return 10 * word.length();
    }
    public static int addWord(String word){
        return 10 + word.length() ;
    }
    public static int substractWord(String word){
        return 10 - word.length();
    }
}
