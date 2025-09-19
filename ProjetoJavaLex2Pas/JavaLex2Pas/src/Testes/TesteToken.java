package Testes;

import Dominio.Token;

public class TesteToken {
    public void Executar(){
        //Imaginando que o buffe de entrada esteja com a seguinte string:
        //if(x==10)
        Token t1 = new Token("IF", "if", "KW", "palavra reservada da linguagem", 1);
        Token t2 = new Token("(", "(", "SMB", "simbolo, abre parenteses", 2);
        Token t3 = new Token("x", "x", "ID", "identificador", null);
        Token t4 = new Token("==", "==", "OP", "operador lógico", 3);
        Token t5 = new Token("10", "10", "NUM", "número", null);
        Token t6 = new Token(")", ")", "SMB", "simbolo, fecha parenteses", 4);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
    }
}
