
package bibliotecaprograma;

public class Leitores extends Biblioteca {
    
    //Atributos:
    private String nome;
    private int matricula;
    
    //Metodo CONSTRUTOR:
    public void leitores(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        
    }
    //Metodo toString:
    @Override
    public String toString(){
        return "" + nome + ",\n numero da matricula: " + matricula + ' ';
}
    
    //Metodos Getters e Setters:
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
}
