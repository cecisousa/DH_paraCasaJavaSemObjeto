package LicaoDeCasa;

public class Exercicio3 {
    public static boolean EhPar(Integer numeroInteiro) {
        if(numeroInteiro%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Integer numeroInteiro = 6;
        System.out.println(EhPar(numeroInteiro));
    }
}
