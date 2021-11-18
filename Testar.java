public class Testar {
    
    public static void  main(String[] args) {

        //Criar objetos
        Aluno a=new Aluno();
        a.setNome("Rosa Márcia");
        a.setMatricula(1234);
        a.setCurso("Big Data.");
        a.setNotaMat(9);
        a.setNotaPort(10);
        a.setNotaJava(10);

        System.out.println("Aluno(a): "+a.getNome()+", do curso: "+a.getCurso());
        a.verificarAprovacao();
        
  
        }
        
    }
