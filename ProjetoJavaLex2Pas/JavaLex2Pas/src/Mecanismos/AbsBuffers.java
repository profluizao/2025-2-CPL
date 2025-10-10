package Mecanismos;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;

import Dominio.Token;

public abstract class AbsBuffers {
    protected String caminhoDoArquivo;
    protected BufferedReader leitor;
    protected ArrayList<String> bufferPrimario;
    protected HashMap<Integer, Token> bufferSecundario;

    public abstract void carregarArquivoParaLeitor();

    public abstract void carregarArquivoParaLeitor(String caminho);

    public abstract void importarDadosParaBufferPrimario();

    public abstract void processarDadosDoBufferPrimario();

    public abstract void imprimirDadosDoBufferPrimario();

    public AbsBuffers(){}
}
