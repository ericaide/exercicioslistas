import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {

    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);

        Prova prova = new Prova();
        prova.somaTotal(conjunto);

    }
}
