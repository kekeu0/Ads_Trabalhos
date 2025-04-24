public class Aluno extends Pessoa {
    int turmaId;

    public Aluno(String nome, String matricula, String rg, String cpf, String endereco, int turmaId) {
        super(nome, matricula, rg, cpf, endereco);
        this.turmaId = turmaId;
    }

    public int getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(int turmaId) {
        this.turmaId = turmaId;
    }

    public String toString() {
        return "Aluno: " + nome + " | Turma: " + turmaId;
    }
}
