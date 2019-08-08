package SalaDeAula;

import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {
    public static void main(String[] args) {
        List<Integer> listadeNumeros = new ArrayList<>();
        listadeNumeros.add(401);
        listadeNumeros.add(600);
        listadeNumeros.add(205);
        listadeNumeros.add(100);
        listadeNumeros.add(50);
        List<Integer> listaPares = new ArrayList<>();
        for (int i = 0; i < listadeNumeros.size(); i++) {
            if(listadeNumeros.get(i)%2 ==0){
                listaPares.add(listadeNumeros.get(i));
            }
        }
        System.out.println(listaPares);
    }
}
