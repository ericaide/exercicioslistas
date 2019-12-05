import sun.awt.geom.AreaOp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {

        List<Integer> listaNova = new ArrayList<>();
        listaNova.add(1);
        listaNova.add(5);
        listaNova.add(5);
        listaNova.add(6);
        listaNova.add(7);
        listaNova.add(8);
        listaNova.add(8);
        listaNova.add(8);
        listaNova.add(8);

        for (Integer valor: listaNova){
            System.out.println("Lista normal: " + valor);
        }

        Set<Integer> listaSet = new HashSet<>();
        listaSet.add(1);
        listaSet.add(5);
        listaSet.add(5);
        listaSet.add(6);
        listaSet.add(7);
        listaSet.add(8);
        listaSet.add(8);
        listaSet.add(8);
        listaSet.add(8);

        for (Integer valor: listaSet){
            System.out.println("Lista com set "+ valor);
        }


    }
}
