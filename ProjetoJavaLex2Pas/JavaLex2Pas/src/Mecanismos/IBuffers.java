package Mecanismos;

public interface IBuffers {

    void carregarArquivoParaLeitor();

    void carregarArquivoParaLeitor(String caminho);

    void importarDadosParaBufferPrimario();

    void processarDadosDoBufferPrimario();

    void imprimirDadosDoBufferPrimario();    
}