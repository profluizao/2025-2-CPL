package Mecanismos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessamentoBufferPrimario extends AbsBuffers implements IBuffers{
    @Override
    public void carregarArquivoParaLeitor() {
        System.out.println("--------------------------------------");
        System.out.println("##### Carregar Arquivo de Testes #####");
        Scanner sc = new Scanner(System.in);
        System.out.print("Diretório do arquivo: ");
        String diretorio = sc.next();
        System.out.print("Nome do arquivo: ");
        String nomeArquivo = sc.next();
        this.caminhoDoArquivo = diretorio + "\\" + nomeArquivo;
        sc.close();        
    }

    @Override
    public void carregarArquivoParaLeitor(String caminho) {
        this.caminhoDoArquivo = caminho;        
    }

    @Override
    public void importarDadosParaBufferPrimario() {
        this.leitor = null;
        try {
            FileReader fr = new FileReader(this.caminhoDoArquivo);
            this.leitor = new BufferedReader(fr);
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    @Override
    public void processarDadosDoBufferPrimario() {
        this.bufferPrimario = new ArrayList<>();
        try {
            String linha = "";
            while((linha = this.leitor.readLine()) != null){
                this.bufferPrimario.add(linha);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            if (this.leitor != null){
                try {
                    this.leitor.close();
                } catch (Exception e) {
                    System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
                }
            }
        }
    }
    
    @Override
    public void imprimirDadosDoBufferPrimario() {
        System.out.println("----------------------------------------");
        System.out.println("##### Conteúdo do Buffer Primário: #####");
        for (String texto : this.bufferPrimario) {
            System.out.println(texto);
        }
    }    
}
