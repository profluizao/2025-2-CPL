package Testes;

import Mecanismos.ProcessamentoBufferPrimario;
import Mecanismos.ProcessamentoBufferSecundario;
import Mecanismos.ProcessarTabelaSimbolos;

public class TesteProcessamentoTabelaSimbolos {
    private ProcessamentoBufferPrimario procBufferPrimario;
    private ProcessamentoBufferSecundario procBufferSecundario;
    private ProcessarTabelaSimbolos procTabelaSimbolos;

    public TesteProcessamentoTabelaSimbolos(){
        this.procBufferPrimario = new ProcessamentoBufferPrimario();
        this.procBufferSecundario = new ProcessamentoBufferSecundario();
        this.procTabelaSimbolos = new ProcessarTabelaSimbolos();
    }

    public void executar(){
        this.procBufferPrimario.carregarArquivoParaLeitor();
        this.executarTeste();
    }

    public void executar(String caminho){
        this.procBufferPrimario.carregarArquivoParaLeitor(caminho);
        this.executarTeste();
    }

    private void executarTeste(){
        this.procBufferPrimario.importarDadosParaBufferPrimario();
        this.procBufferPrimario.processarDadosDoBufferPrimario();
        this.procBufferPrimario.imprimirDadosDoBufferPrimario();

        //Processamento do Buffer Secundário, utilizando o Buffer Primário pré-carregado.
        this.procBufferSecundario.setBufferPrimario(this.procBufferPrimario.getBufferPrimario());
        this.procBufferSecundario.ProcessarBufferSecundario();
        this.procBufferSecundario.ImprimirBufferSecundario();

        //Analisar e Montar a Tabela de Símbolos.
        this.procTabelaSimbolos.setBufferSecundario(this.procBufferSecundario.getBufferSecundario());
        this.procTabelaSimbolos.analisarMontarTabelaSimbolos();
        this.procTabelaSimbolos.imprimirTabelaSimbolosPrograma();
    }      
}
