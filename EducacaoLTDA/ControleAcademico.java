import java.util.Scanner;

public class ControleAcademico {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;;
        int escolha;
        //Criando Professor
        Professor professor1 = new Professor("Claudio","11000");
        Professor professor2 = new Professor("Roberto","11001");
        //Criando Aluno
        Aluno aluno1 = new Aluno("Daniel","21","10000");
        Aluno aluno2 = new Aluno("Yossef","22","10001");
        //Criando Disciplina
        Disciplina disciplina1 = Disciplina.criarDisciplina("Matemática");
        Disciplina disciplina2 = Disciplina.criarDisciplina("Biologia");
        Disciplina disciplina3 = Disciplina.criarDisciplina("Física");
        Disciplina disciplina4 = Disciplina.criarDisciplina("História");

        //INTERFACE GRÁFICA (Screen-INCOMPLETA)
        //new Screen()

        //MENU PRINCIPAL
        while(continuar){
            System.out.println("Bem-vindo ao Sistema de Controle Acadêmico Visão Educação LTDA!");
            System.out.println("1 - Acesso do Aluno");
            System.out.println("2 - Acesso do Professor");
            System.out.println("3 - Sair");
            escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    AcessoAluno();
                    break;
                case 2:
                    AcessoProfessor();
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Digite Novamente.");
                    break;
            }
        }
    }

    //MENU DO ALUNO
    public static void AcessoAluno(){
        boolean continuar = true;
        int opcao;
        while(continuar){
            System.out.println("MENU DO ALUNO:");
            System.out.println("1- Disciplinas");
            System.out.println("2- Notas");
            System.out.println("3-");
            System.out.println("4-");
            System.out.println("5-");
            System.out.println("6- Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            //Aluno aluno = new Aluno(null, 0,0 );

            switch (opcao){
                case 1:
                    System.out.println("Ainda não implementado.");
                    break;
                case 2:
                    System.out.println("Ainda não implementado.");
                    break;
                case 3:
                    System.out.println("Ainda não implementado.");
                    break;
                case 4:
                    System.out.println("Ainda não implementado.");
                    break;
                case 5:
                    System.out.println("Ainda não implementado.");
                    break;
                case 6:
                    System.out.println("Obrigado por acessar o Visão Educação Avançada!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente de novo.");
                    break;
            }
        }
    }

    //MENU DO PROFESSOR
    public static void AcessoProfessor(){
        boolean continuar = true;
        int opcao;
        while(continuar){
            System.out.println("MENU DO PROFESSOR:");
            System.out.println("1- Disciplina");
            System.out.println("2- Turmas");
            System.out.println("3- Alunos");
            System.out.println("4- Notas");
            System.out.println("5-");
            System.out.println("6- Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            //Professor professor = new Professor(null, null);

            switch (opcao){
                case 1:
                    System.out.println("Ainda não implementado.");
                    break;
                case 2:
                    System.out.println("Ainda não implementado.");
                    break;
                case 3:
                    System.out.println("Ainda não implementado.");
                    break;
                case 4:
                    System.out.println("Ainda não implementado.");
                    break;
                case 5:
                    System.out.println("Ainda não implementado.");
                    break;
                case 6:
                    System.out.println("Obrigado por acessar o Visão Educação Avançada!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente de novo.");
                    break;
            }
        }
    }
}
