import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio1 {
    public static void main(String[] args) {
        Map<Integer, String> sonhos = new HashMap<>();

        sonhos.put(0,"Ovos");
        sonhos.put(1,"Água");
        sonhos.put(2,"Escopeta");
        sonhos.put(3,"Cavelo");
        sonhos.put(4,"Dentista");
        sonhos.put(5,"Fogo");

        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        apelidos.put("João", apelidosJoao);

        List<String> apelidosMiguel = new ArrayList<>();

        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        apelidos.put("Miguel", apelidosMiguel);

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");

        apelidos.put("Maria", apelidosMaria);

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");

        apelidos.put("Lucas", apelidosLucas);

        for (String nome: apelidos.keySet()) {
            List<String> apelido = apelidos.get(nome);
            System.out.println(nome + " - " + apelido);
        }

        for(Integer chave : sonhos.keySet()){
            String oi = sonhos.get(chave);
            System.out.println(chave+ " - " + oi);
        }
    }
}
