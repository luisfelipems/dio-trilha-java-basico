public class Operadores {
    
    public static void main(String[] args) {
        
        String nomeCompleto = "LINGUAGEM" + "JAVA"; // Concatenação de palavras string
        System.out.println(nomeCompleto);

        int a = 5, b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";
        /* 
           Neste caso utilizamos operadores ternários como se fosse um IF
           o sinal ? representa a primeira condição e o sinal : representa
           o else caso a primeira condição não seja atendida
        */

        System.out.println(resultado);

    }
}
