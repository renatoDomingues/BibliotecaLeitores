
package bibliotecaprograma;


public class BibliotecaPrograma {


    public static void main(String[] args) {
        
        Biblioteca b1 = new Biblioteca();
        Leitores l1 = new Leitores();
        
        b1.setLivro("Aprendendo Java");
        b1.setPagina(1500);
        b1.setTotallivro(33);
        b1.setNomes(l1);
        
        
        l1.setNome("Matheus Reis");
        l1.setMatricula(1850);
        
        
        System.out.println(b1.toString());
        b1.quantosLeu();





    }
    
}
