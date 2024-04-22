import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nomeAluno;
    private String idade;
    private String matricula;
    private List<Disciplina> disciplinas;

public Aluno(String nomeAluno,String idade,String matricula){
    this.nomeAluno = nomeAluno;
    this.idade = idade;
    this.matricula = matricula;
    this.disciplinas = new ArrayList<>();
}

public static Aluno criarAluno(String nomeAluno,String idade,String matricula){
    return new Aluno(nomeAluno,idade,matricula);
}

public String getNomeAluno() {return nomeAluno;}

public void setNomeAluno(String nomeAluno) {
    this.nomeAluno = nomeAluno;
}

public String getIdade() {
    return idade;
}

public void setIdade(String idade) {
    this.idade = idade;
}

public String getMatricula() {
    return matricula;
}

public void setMatricula(String matricula) {
    this.matricula = matricula;
}

public List<Disciplina> getDisciplinas(){return disciplinas;}

public void setDisciplinas(List<Disciplina> disciplinas){this.disciplinas = disciplinas;}

@Override
public String toString() {
    return "Aluno [nomeAluno=" + nomeAluno + ", idade=" + idade + ", matricula=" + matricula + "]";
}

}








