package Mecanismos;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Dominio.TabelaSimbolosLinguagem;
import Dominio.Token;

public class ProcessarTabelaSimbolos extends AbsBuffers{
    
    private HashMap<String, Token> tabelaSimbolosPrograma;

    private boolean IsNumber(String valor)
    {
        Pattern pattern = Pattern.compile(this.captureNumbers);
        Matcher matcher = pattern.matcher(valor);
        if (matcher.find() == true){
            return true;
        }
        return false;
    }

    private boolean IsLiteral(String valor)
    {
        Pattern pattern = Pattern.compile(this.captureLiteral);
        Matcher matcher = pattern.matcher(valor);
        if (matcher.find() == true){
            return true;
        }
        return false;
    }

    private boolean IsCharacter(String valor)
    {
        Pattern pattern = Pattern.compile(this.captureCharacters);
        Matcher matcher = pattern.matcher(valor);
        if (matcher.find() == true){
            return true;
        }
        return false;
    }

    private boolean IsIdentifier(String valor)
    {
        Pattern pattern = Pattern.compile(this.captureIdentifier);
        Matcher matcher = pattern.matcher(valor);
        if (matcher.find() == true){
            return true;
        }
        return false;
    }

    public void analisarMontarTabelaSimbolos(){
        this.tabelaSimbolosPrograma = new HashMap<>();
        TabelaSimbolosLinguagem tblSimbolosLinguagem = new TabelaSimbolosLinguagem();
        for (String texto : this.bufferSecundario) {
            String chave = texto.toUpperCase();
            Token valor = null;
            if (tblSimbolosLinguagem.getTabela().containsKey(texto.toLowerCase())){
                
                valor = tblSimbolosLinguagem.getTabela().get(texto.toLowerCase());
                valor.setToken(texto);
                
            }
            else{
                if (this.IsNumber(texto)){
                    valor = new Token(texto, texto, tblSimbolosLinguagem.getNumber(), "Valor Numérico", 0);
                }
                else if (this.IsLiteral(texto)){
                    valor = new Token(texto, texto, tblSimbolosLinguagem.getLiteral(), "Literal", 0);
                }
                else if (this.IsCharacter(texto)){
                    valor = new Token(texto, texto, tblSimbolosLinguagem.getSymbol(), "Caracter Especial", 0);
                }
                else if (this.IsIdentifier(texto)){
                    valor = new Token(texto, texto, tblSimbolosLinguagem.getIdentifier(), "Identificador", 0);
                }
                else{
                    valor = new Token(texto, texto, tblSimbolosLinguagem.getUndefined(), "Não pertence a linguagem", 0);
                }
            }
            this.tabelaSimbolosPrograma.put(chave, valor);
        }
    }

    public void imprimirTabelaSimbolosPrograma(){
        System.out.println("----------------------------------------");
        System.out.println("##### Tabela de Símbolos do Programa: #####");
        Integer contador = 1;
        for (Map.Entry<String,Token> pair : this.tabelaSimbolosPrograma.entrySet()) {
            System.out.printf("%3s", contador.toString());
            System.out.printf(" | %20s", pair.getKey());
            System.out.printf(" | %30s \n", pair.getValue().toString());
            contador++;
        }
        System.out.println("----------------------------------------");  
    }
}
