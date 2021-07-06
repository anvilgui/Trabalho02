package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import src.Produto;

public class atividade01 {

    public static void main(String[] args) {

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

        System.out.println("1) O menor valor é: " + menorPreco(produtos));
    }

    public static Float menorPreco(List<Produto> list) {        
        Float valor;
        Float menorValor;
        List<Float> valorMenor = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            valor = list.get(i).getPreco();
            valorMenor.add(valor);
        }
        menorValor = Collections.min(valorMenor);
        return menorValor;
    }

}