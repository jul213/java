
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){

        List<String> alimentos = new ArrayList<String>();

        alimentos.add("papas");
        alimentos.add("aguacate");
        alimentos.add("pera");
        alimentos.add("pechuga");
        alimentos.add("lechuga");

        for (String alimento: alimentos){
            System.out.println(alimento);
        }


        List<String> escolares = Arrays.asList("borrador", "lapiz", "corrector");
    }
}