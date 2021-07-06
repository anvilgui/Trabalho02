package Lista;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
import java.util.List;

import src.Produto;

public class atividade05 {
    public static void main(String[] args) {
        
        Queue<Produto> filaComPrioridade = new PriorityQueue<Produto>(new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return Float.valueOf(p2.getPreco()).compareTo(p1.getPreco());
            }

        });

        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto(1, "Garrafa Térmica", 250, 3);
        Produto produto2 = new Produto(2, "Conjunto de Copos", 45, 6);
        Produto produto3 = new Produto(3, "Panela de Pressão", 300, 15);
        Produto produto4 = new Produto(4, "Talheres", 80, 21);
        Produto produto5 = new Produto(5, "Pano de Prato", 32, 100);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        for (int i = 0; i < produtos.size() ; i++) {            
            filaComPrioridade.offer(produtos.get(i));
        }

        System.out.println("Fila s/ prioridade: ");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }

        System.out.println("Fila c/ prioridade no valor: ");
        while (!filaComPrioridade.isEmpty()) {
            System.out.println(filaComPrioridade.poll());
        }
    }
    
}