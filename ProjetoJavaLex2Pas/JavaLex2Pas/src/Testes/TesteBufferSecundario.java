package Testes;

import Mecanismos.ProcessamentoBufferPrimario;
import Mecanismos.ProcessamentoBufferSecundario;

public class TesteBufferSecundario {
    private ProcessamentoBufferPrimario procBufferPrimario;
    private ProcessamentoBufferSecundario procBufferSecundario;

    public TesteBufferSecundario(){
        this.procBufferPrimario = new ProcessamentoBufferPrimario();
        this.procBufferSecundario = new ProcessamentoBufferSecundario();
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
    }  
}
