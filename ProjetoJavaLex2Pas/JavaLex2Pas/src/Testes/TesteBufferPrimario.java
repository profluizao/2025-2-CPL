package Testes;

import Mecanismos.ProcessamentoBuffers;

public class TesteBufferPrimario {
    private ProcessamentoBuffers procBuffer;

    public TesteBufferPrimario(){
        this.procBuffer = new ProcessamentoBuffers();
    }

    public void executar(){
        this.procBuffer.carregarArquivoParaLeitor();
        this.executarTeste();
    }

    public void executar(String caminho){
        this.procBuffer.carregarArquivoParaLeitor(caminho);
        this.executarTeste();
    }

    private void executarTeste(){
        this.procBuffer.importarDadosParaBufferPrimario();
        this.procBuffer.processarDadosDoBufferPrimario();
        this.procBuffer.imprimirDadosDoBufferPrimario();
    }
}
