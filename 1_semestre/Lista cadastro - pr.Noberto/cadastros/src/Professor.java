public class Professor extends Pessoa{

    public Professor(String nome, String matricula, String rg, String cpf, String endereco){
        super(nome, matricula, rg, cpf, endereco);
    }

    public String toString(){
        return "Professor: " + nome + " Matrícula: " + matricula;
    }
}