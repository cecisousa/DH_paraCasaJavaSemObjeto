package SalaDeAula;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(44);
        listaDeNumeros.add(16);
        listaDeNumeros.add(75);
        listaDeNumeros.add(25);
        listaDeNumeros.add(50);
        Integer soma = 0;
        for (int i = 0; i < listaDeNumeros.size(); i++) {
            soma = soma + listaDeNumeros.get(i);
        }
        System.out.println(soma);
    }
}
