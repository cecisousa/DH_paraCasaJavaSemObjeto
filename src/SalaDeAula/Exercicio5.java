package SalaDeAula;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {
    public static void main(String[] args) {
        List<Integer> listadeNumeros = new ArrayList<>();
        listadeNumeros.add(13);
        listadeNumeros.add(17);
        listadeNumeros.add(20);
        listadeNumeros.add(168);
        listadeNumeros.add(12);
        Integer soma = 0;
        for (int i = 0; i < listadeNumeros.size(); i++) {
            if(listadeNumeros.get(i)%2 == 0){
                soma = soma + listadeNumeros.get(i);
            }
        }
        System.out.println(soma);
    }
}
