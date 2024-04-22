import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisc;
    private List<Turma> turmas;
    private List<Professor> professores;

    public Disciplina(String nomeDisc) {
        this.nomeDisc = nomeDisc;
        // Inicialização das listas
        this.turmas = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public static Disciplina criarDisciplina(String nomeDisc) {
        return new Disciplina(nomeDisc);
    }

    public String getNomeDisc() {return nomeDisc;}
    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }
    public List<Turma> getTurmas() {return turmas;}
    public void setTurmas(List<Turma> turmas) {this.turmas = turmas;}
    public List<Professor> getProfessores() {return professores;}
    public void setProfessores(List<Professor> professores) {this.professores = professores;}

    public String toString() {return "Disciplina [nomeDisc=" + nomeDisc + "]";}

}
