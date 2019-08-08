package LicaoDeCasa;

public class Exercicio2 {
    public static boolean textoEhDiferente(String textoA, String textoB) {
        return !textoA.equals(textoB);
    }

    public static void main(String[] args) {
        String textoA = "mimimi";
        String textoB = "oioioi";
        System.out.println(textoEhDiferente(textoA, textoB));
    }
}