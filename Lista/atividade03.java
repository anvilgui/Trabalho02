package Lista;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class atividade03 {
    public static void main(String[] args) {

        System.out.println("3)");

        ArrayList<Integer> listaInt = new ArrayList<>();

        listaInt.add(3);
        listaInt.add(12);
        listaInt.add(8);
        listaInt.add(6);
        listaInt.add(17);
                
        System.out.println("Elementos inteiros: " + listaInt.toString());
        System.out.println("Elementos não repetidos: " + removerElementosRepetidos(listaInt));
    }

    public static Set<Integer> removerElementosRepetidos(ArrayList<Integer> listaInt){
        Set<Integer> listaNaoRepetida = new LinkedHashSet<>(listaInt);
        return listaNaoRepetida;
    }
}