import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        List<String> listaStrings = new ArrayList<>(List.of("z", "a","f"));
        listaStrings.add("c");
        System.out.println(listaStrings);
        Collections.sort(listaStrings);
        System.out.println(listaStrings);


    }
}