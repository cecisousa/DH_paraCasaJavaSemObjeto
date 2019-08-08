package LicaoDeCasa;

public class Exercicio5 {
    public static boolean compararNumeros(int a, int b, int c, int d){
        return Math.max(a, b) > Math.max(c, d);
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 5;
        int d = 1;
        System.out.println(compararNumeros(a, b, c, d));
    }
}


