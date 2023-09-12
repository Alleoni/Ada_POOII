public class Generics {

    public static void main(String[] args) {
        String a = "l";
        String b = "a";
        System.out.println("Maior entre a e b: " + maior(a, b));
    }

    private static String maior(String primeira, String segunda) {
        int compararString = primeira.compareTo(segunda);
        if(compararString > 0){
            return primeira;
        } else if(compararString < 0){
            return segunda;
        } else {
            return "As Strings são iguais";
        }
    }
}