package Mecanismos;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcessamentoBufferSecundario extends AbsBuffers{
    public void ProcessarBufferSecundario()
    {        
        this.capture = captureComment.concat("|")
            .concat(captureNumbers).concat("|")
            .concat(captureLiteral).concat("|")
            .concat(captureWords).concat("|")
            .concat(captureCharacters);

        this.bufferSecundario = new ArrayList<>();

        Pattern pattern = Pattern.compile(this.capture);

        for (String texto : bufferPrimario) {
            Matcher matcher = pattern.matcher(texto);
            while(matcher.find()){
                String lexema = matcher.group();
                if (this.bufferSecundario.contains(lexema) == false){
                    this.bufferSecundario.add(lexema);
                }
            }
        }
        bufferSecundario.removeIf(value -> value.startsWith("//") || value.startsWith("(*"));
    } 

    public void ImprimirBufferSecundario(){
        System.out.println("----------------------------------------");
        System.out.println("##### Conteúdo do Buffer secundário: #####");
        for (String texto : this.bufferSecundario) {
            System.out.println(texto);
        }
        System.out.println("----------------------------------------");
    }    
}
