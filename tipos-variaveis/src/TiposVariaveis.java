public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        byte idade = 123;
        // Armazena entre -128 a 127 e ocupa 1 byte de memória.
        
        
        short ano =2024; 
        // Armazena entre 32.768 a 32.767 e ocupa 2 bytes de memória.
        
        
        int cep = 04410110; 
        //  Armazena entre 2.147.483.648 a 2.147.483.647 e ocupa 4 bytes de memória.
        
        long cpf = 9876543210L; 
        // Precisa inserir o L ao final, caso contrário o Java não reconhece como long.
        // Armazena entre 9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 e ocupa 8 bytes.  
        
        float pi = 3.1415F;
        // Precisa colocar o F no final, caso contrário o Java também não reconhece como float.
        
        double salario = 2500.33;
        // Números após o ponto são considerados como virgula.

        final double VALOR_DE_PI = 3.1415;
        // O final não me permite alterar o valor da constante VALOR_DE_PI. 
        // Por ser constante, a declaração dela precisa ser em caixa alta.

        
    }
}
