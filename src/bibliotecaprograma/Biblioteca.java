
package bibliotecaprograma;

import java.util.Scanner;

public class Biblioteca extends BibliotecaPrograma{
    
    //Atributos:
    private String livro;
    private int totalLivro;
    private int pagina;
    private Leitores nomes;
    
    //Metodo CONSTRUTOR:
    public void Biblioteca(String livro, int pagina, int totalLivro, Leitores nomes){
        this.livro = livro;
        this.pagina = pagina;
        this.totalLivro = totalLivro;
        this.nomes = nomes;
        
    }
 
    public void quantosLeu(){
                if(this.getPagina() >= 1 && this.getPagina() <= 100){
            System.out.println("Parabêns pelo começo da leitura, rumo ao conhecimento!");
        }else if(this.getPagina() > 100 && this.getPagina() <= 500){
            System.out.println("Continua assim, um futuro prospero te espera!");
        }else if(this.getPagina() > 500 && this.getPagina() <= 1000){
            System.out.println("O conhecimento liberta!");
        }else if(this.getPagina() > 1000){
            System.out.println("Sem duvidas, um exemplo a ser seguido!");
        }        
    }
    
    //Metodo toString:
    @Override
    public String toString(){
        return "{Livro escolhido: " + livro + ", nome do leitor: " + nomes
                + ", quantidade de pagina que leu: " + pagina 
                + ",\n quantos livros que leu: " + totalLivro + '}';
    }
    
    //Metodos Getters e Setters:
    public String getLivro(){
        return livro;
    }
    public void setLivro(String livro){
        this.livro = livro;
    }
    public int getTotallivro(){
        return totalLivro;
    }
    public void setTotallivro(int totalLivro){
        this.totalLivro = totalLivro;
    }
    public int getPagina(){
        return pagina;
    }
    public void setPagina(int pagina){
        this.pagina = pagina;
    }
    public Leitores getNomes(){
        return nomes;
    }
    public void setNomes(Leitores nomes){
        this.nomes = nomes;
    }
    
}
