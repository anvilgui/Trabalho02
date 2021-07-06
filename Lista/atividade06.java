package Lista;

import src.Fila;
public class atividade06 {
    public static void main(String[] args) {

        System.out.println("6)");

        Fila<Object> fila = new Fila<Object>(7);
        
        fila.enfileirar(7);
        fila.enfileirar(12);
        fila.enfileirar(13);
        fila.enfileirar(18);
        fila.enfileirar(21);
        fila.enfileirar(37);

        System.out.println("Fila sequencial: " + fila.toString());
        fila.inverterFila();
        System.out.println("Fila invertida: " + fila.toString());
    }
}