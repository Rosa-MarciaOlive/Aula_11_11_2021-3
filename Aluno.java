public class Aluno{

    public String nome;
    public int matricula;
    public String curso;
    public float notaMat;
    public float notaPort;
    public float notaJava;

    public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNotaMat() {
        return notaMat;
    }public void setNotaMat(float notaMat) {
        this.notaMat = notaMat;
    }

    public float getNotaPort() {
        return notaPort;
    }public void setNotaPort(float notaPort) {
        this.notaPort = notaPort;
    }

    public float getNotaJava() {
        return notaJava;
    }public void setNotaJava(float notaJava) {
        this.notaJava = notaJava;
    }

    public void verificarAprovacao(){
        if(notaMat>=7 && notaPort>=7 && notaJava>=7){
            System.out.println("Status de aprovação: Aprovado!");
        }else{
            System.out.println("Status de aprovação: Reprovado.");
        }
    }
        
    

}
    
