
import java.util.List;

public class Main{

public static void main(String[] args){

List<String> alimentos = new List<String>();

alimentos.add("papas");
alimentos.add("aguacate");
alimentos.add("pera");
alimentos.add("pechuga");
alimentos.add("lechuga");

for (String alimento: alimentos){
    System.out.println(alimento);
}
}
}