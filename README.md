# Métodos em Java

## Entendendo Métodos em Java

É um assunto muito importante e estes métodos servem principalmente para organizarmos nosso código. Os métodos também nos permitem reaproveitar comportamentos que são semelhantes.

Agora vamos estudar como criar métodos e fazer com que os mesmos retornem valores. Então, ao declararmos o método devemos declarar qual o tipo de dado que o mesmo retornará. Por exemplo:

    static Integer numeroAleatorio() {
        return 1;
    }
Assim, declaramos que o método numeroAleatorio retornará um número do tipo Integer. Devemos inserir a palavra reservada return que indica qual dado retornaremos.

Outro ponto a destacar é: sempre que desejamos declarar um vetor com valores, estamos utilizando uma sobrecarga do método, por isso, devemos proceder da seguinte forma.

    Double[] premissaInicial = new Double[] { 50.0, 100.0 };

## Recursividade

Este conceito significa que o método chama o próprio método. Esta técnica é muito utilizada. Analisando o exemplo mostrado de recursividade, percebemos que ela pode substituir um laço for, ou um while, alguma estrutura de repetição. Porque o método principal chama/invoca o método, e ao executar o método invocado, o main torna a chamá-lo, e assim se repete até infinitamente. Para evitar esse erro de recursividade e execução infinita, necessitamos criar na lógica do método uma condição de parada.
Ou seja, invocamos um método e também podemos passar parâmetros pra ele. Dentro desse método invocado, ele chama ele mesmo e executa as linhas de código até que uma condição seja satisfeita.