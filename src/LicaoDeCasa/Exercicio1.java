package LicaoDeCasa;

public class Exercicio1 {
    public static void main(String[] args) {


        Integer numeroA = 3;
        Integer numeroB = 13;
        Integer numeroC = 7;
        if(numeroA >= numeroB && numeroA >= numeroC){
            System.out.println(numeroA+" é o maior número");
        }
        else if(numeroB >= numeroA && numeroB >= numeroC){
            System.out.println(numeroB+" é o maior número");
        }
        else
            System.out.println(numeroC+" é o maior número");
    }
}

