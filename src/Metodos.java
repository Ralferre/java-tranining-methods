import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        imprimirSeparador();
        String[] cursos = new String[] {"Java EE", "Spring Boot", "Java POO Avançado", "Stream API"}; 
        System.out.println("Escolha dentre um dos cursos abaixo: ");
        imprimirOpcoes(cursos);
        System.out.print("O curso de sua preferência é: ");
        Integer cursoEscolhido = scanner.nextInt();

        //tratando possíveis exceções inseridas pelo usuário
        validarOpcaoUsuario(cursoEscolhido, cursos);
        
        imprimirSeparador();;
        String[] formaPagamento = new String[] {"Pix", "Débito", "Crédito", "Boleto"};
        System.out.println("Escolha a forma de pagamento desejada: ");
        imprimirOpcoes(formaPagamento);
        System.out.print("Forma de pagamento selecionada é: ");
        Integer formaDePagamento = scanner.nextInt();
        
        //tratando possíveis exceções inseridas pelo usuário
        validarOpcaoUsuario(formaDePagamento, formaPagamento);

        imprimirSeparador();
        System.out.println("O curso escolhido foi: " + cursos[cursoEscolhido]);
        System.out.println("A forma de pagamento escolhida foi: " + formaPagamento[formaDePagamento]);

    }//aqui fecha as chaves do método void main

    static void imprimirSeparador() {
        System.out.println("-------------------------------------------------------");
    }

    static void imprimirOpcoes(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println("[" + i + "] " + options[i]);
        }
    }

    static void validarOpcaoUsuario(Integer option, String[] options) {
        Boolean validOption = option >= 0 && option < options.length;
        if (!validOption) {
            System.err.println("Opção inválida!");
            System.exit(1);
        }
    }

   
}
