package Lista;

import java.util.Stack;

public class atividade09 {
    public static void main(String[] args) {

        System.out.println("9)");

        Stack<Integer> pilha = new Stack<>();

        pilha.add(1);
        pilha.add(2);
        pilha.add(5);
        pilha.add(8);
        pilha.add(13);

        System.out.println("Pilha sequencial: " + pilha.toString());
        inverterPilha(pilha);
        System.out.println("Pilha invertida: " + pilha.toString());
        
    }

    public static Stack<Integer> inverterPilha(Stack<Integer> pilha){
        
        Stack<Integer> pilhaInvertida = new Stack<>();

        for (int i = pilha.size() - 1; i >= 0; i--) {
            pilhaInvertida.add(pilha.get(i));
        }
        pilha.clear();
        for (int i = 0; i < pilhaInvertida.size(); i++) {
            pilha.add(pilhaInvertida.get(i));
        }
        return pilha;
    }

}