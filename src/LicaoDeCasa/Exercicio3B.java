package LicaoDeCasa;

public class Exercicio3B {
    public static boolean EhPar(Integer numeroInteiro) {
        return numeroInteiro%2 == 0;
    }

    public static void main(String[] args) {
        Integer jaca = 65;
        System.out.println(EhPar(jaca));
    }
}
