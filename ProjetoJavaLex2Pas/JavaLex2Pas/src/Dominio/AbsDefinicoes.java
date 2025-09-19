package Dominio;

public abstract class AbsDefinicoes {
    public String getIdentifier(){
        return "Identifier";
    }
    public String getKeyWord(){
        return "Keyword";
    }
    public String getSymbol(){
        return "Symbol";
    }
    public String getOperator(){
        return "Operator";
    }
    public String getLiteral(){
        return "Literal";
    }
    public String getNumber(){
        return "Number";
    }
    public String getUndefined(){
        return "Unknown";
    }
}
