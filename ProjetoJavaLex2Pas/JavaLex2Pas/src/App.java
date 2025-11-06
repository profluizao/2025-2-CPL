//import Testes.TesteBufferPrimario;
//import Testes.TesteBufferSecundario;

import Testes.TesteProcessamentoTabelaSimbolos;

public class App {
    public static void main(String[] args) throws Exception {
        //TesteBufferPrimario teste = new TesteBufferPrimario();
        //teste.executar();
        //teste.executar("src/Arquivos/testdiv.pas");

        //TesteBufferSecundario teste = new TesteBufferSecundario();
        //teste.executar();
        //teste.executar("src/Arquivos/testdiv.pas");
        
        TesteProcessamentoTabelaSimbolos teste = new TesteProcessamentoTabelaSimbolos();
        //teste.executar();
        teste.executar("src/Arquivos/testdiv.pas");
    }
}