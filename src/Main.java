//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println("Hello and welcome!");
    //Variáveis
    //int define o tipo da variável como inteiro
    int minhaIDade = 27;
    /* O var é uma forma de inferência
    de tipo local — ou seja,
    o compilador deduz automaticamente
    o tipo da variável com base no
     valor que ela recebe. */
    var meuNome = "Lucas";

    /*TIPOS PRIMITIVOS NO JAVA
    - Números Inteiros Ex: 0, 100, 200, 546687
    -Existem tipos diferentes para
    declaração de números inteiros
    veja a seguir quais são:
    -byte(Ocupa 8 bits na memória
    Indo apenas de -128 até 127)

    -short(Ocupa 16 bits na memória
    Indo apenas de -32.768 até 32.767)

    -int(Ocupa 32 bits na memória
    Indo apenas de -2147483648 até 2147483647)

    -long(Ocupa 64 bits na memória
    Indo apenas de -9223372036854775808
    até 9223372036854775807)
    */

    byte numMinimo = -128;
    byte numMaximo = 127;

    short numMinimoShort = -32768;
    short numMaximoShort = 32767;

    int numMinimoInt = -2147483648;
    int numMaximoInt = 2147483647;

    long numMinimoLong = (long) -9.223372036854775808;
    long numMaximoLong = (long) 9.223372036854775807;


}

