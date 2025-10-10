package Dominio;

public class Token {

    private String token;
    //O próprio token, como identificado na tabela de simbolos da linguagem.

    private String lexema;
    //O conjunto de caracteres que compõe o lexema.

    private String tipo;
    //Identificação do tipo do token, como feito na tabela de simbolos da linguagem.

    private String descricao;
    //Breve descrição que retrata o token.

    private Integer endereco;
    //Posição do token na tabela de simbolos da linguagem.

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getEndereco() {
        return endereco;
    }

    public void setEndereco(Integer endereco) {
        this.endereco = endereco;
    }

    public Token(){}

    public Token(String token, String lexema, String tipo, String descricao, Integer endereco) {
        this.token = token;
        this.lexema = lexema;
        this.tipo = tipo;
        this.descricao = descricao;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Token [token=" + token + ", lexema=" + lexema + ", tipo=" + tipo + ", descricao=" + descricao
                + ", endereco=" + endereco + "]";
    }

}