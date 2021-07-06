package Lista;

import java.util.Stack;
import javax.swing.plaf.synth.SynthStyleFactory;

import src.seqFibonacci;

public class atividade08 {
    public static void main(String[] args) {

        System.out.println("8)");

        Stack<Integer> pilha = new Stack<>();
        seqFibonacci fibo = new seqFibonacci();

        for (int i = 0; i < 10; i++) {
            pilha.push(fibo.fibonacci(i));
        }

        System.out.println(pilha.toString());
    }
}