//Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
//Atribua valores a essas variáveis e concatene-as em uma mensagem.

public class Ex03Concatenar {
    public static void main(String[] args) {
        char letra = 'a';
        String palavra = "qualquercois";
        String mensagem = palavra + letra;
        System.out.println(mensagem);
    }
}