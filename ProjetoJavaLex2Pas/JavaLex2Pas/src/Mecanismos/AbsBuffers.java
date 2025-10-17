package Mecanismos;

import java.io.BufferedReader;
import java.util.ArrayList;

public abstract class AbsBuffers {
    protected String caminhoDoArquivo;

    protected BufferedReader leitor;
    
    protected ArrayList<String> bufferPrimario;

    protected ArrayList<String> bufferSecundario;

    public ArrayList<String> getBufferPrimario() {
        return bufferPrimario;
    }

    public void setBufferPrimario(ArrayList<String> bufferPrimario) {
        this.bufferPrimario = bufferPrimario;
    }

    public ArrayList<String> getBufferSecundario() {
        return bufferSecundario;
    }

    public void setBufferSecundario(ArrayList<String> bufferSecundario) {
        this.bufferSecundario = bufferSecundario;
    }

    protected final String captureComment = "\\/\\/.*|\\(\\*(?:.|\\s)*\\*\\)";
    protected final String captureNumbers = "(?<!\\w)(?:-?\\d+(?:\\.\\d+)?)(?!\\w)";
    protected final String captureLiteral = "'(?:[^']|'')*'";
    protected final String captureWords   = "\\w+";
    protected final String captureCharacters = "(?::=|>=|<=|<>|>|<|=|\\+|\\-|\\*|\\/|[:;,.()\\[\\]{}])";
    protected final String captureIdentifier = "^[A-Za-z][A-Za-z0-9_]*$";
    protected String capture;

    public AbsBuffers(){}
}
