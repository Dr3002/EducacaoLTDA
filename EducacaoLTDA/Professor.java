import java.util.ArrayList;
import java.util.List;

public class Professor {
    String nomeProf;
    String matriculaProf;
    List<Turma> turmas;
    List<Professor> professores;


public Professor(String nomeProf,String matriculaProf){
    this.nomeProf = nomeProf;
    this.matriculaProf = matriculaProf;
    this.turmas = new ArrayList<>();
    this.professores = new ArrayList<>();
}

public String getNomeProf() {
    return nomeProf;
}

public void setNomeProf(String nomeProf) {
    nomeProf = nomeProf;
}

public String getMatriculaProf() {
    return matriculaProf;
}

public void setMatriculaProf(String matriculaProf) {
    matriculaProf = matriculaProf;
}

@Override
public String toString() {
    return "Professor [NomeProf=" + nomeProf + ", MatriculaProf=" + matriculaProf + "]";
}

}







