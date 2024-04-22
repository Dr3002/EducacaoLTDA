import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String horario;
    private String sala;
    private String id;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma(String horario, String sala, String id, Disciplina disciplina, Professor professor, List<Aluno> alunos){
        this.horario = horario;
        this.sala = sala;
        this.id = id;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
