package Testes;

import Dominio.AbsDefinicoes;
import Dominio.Token;

public class TesteTokenComDefs extends AbsDefinicoes{
    public void Executar(){
        //Imaginando que o buffe de entrada esteja com a seguinte string:
        //if(x==10)
        Token t1 = new Token("IF", "if", this.getKeyWord(), "palavra reservada da linguagem", 1);
        Token t2 = new Token("(", "(", this.getSymbol(), "simbolo, abre parenteses", 2);
        Token t3 = new Token("x", "x", this.getIdentifier(), "identificador", null);
        Token t4 = new Token("==", "==", this.getOperator(), "operador lógico", 3);
        Token t5 = new Token("10", "10", this.getNumber(), "número", null);
        Token t6 = new Token(")", ")", this.getSymbol(), "simbolo, fecha parenteses", 4);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);

    }
}
