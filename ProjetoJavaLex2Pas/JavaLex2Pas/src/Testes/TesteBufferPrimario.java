package Testes;

import Mecanismos.ProcessamentoBufferPrimario;

public class TesteBufferPrimario {
    private ProcessamentoBufferPrimario procBuffer;

    public TesteBufferPrimario(){
        this.procBuffer = new ProcessamentoBufferPrimario();
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
