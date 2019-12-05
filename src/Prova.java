import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;
        for (Integer valor: conjuntoDeInteiros) {
            System.out.println("item " + valor);
            soma = soma + valor;

        }

        System.out.println("total" +soma);
    }
}
