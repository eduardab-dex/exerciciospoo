import java.util.Scanner;
public class Aluno {
    Scanner scan = new Scanner(System.in);

    /* 
    1. Criar uma classe chamada Aluno. Os atributos são: nome, matricula, CPF e turma.
    Criar os seguintes métodos:
        a) void exibir(); // exibe os dados dos alunos
        b) void atualizar(); //possibilita a mudança de nome e turma
    Criar dois construtores:
        a) um que nao receba nada como par âmetro e pede para que o usuário informe,
        pelo teclado, os valores dos atributos;
        b) um que receba, por parametros, nome, matr ÿ ícula e CPF, inicializando os atributos
        da classe.

    2. Criar uma classe Principal, que faça a criação de três objetos, faça a chamada, de um
    construtor diferente para cada, apresente um menu para chamar os outros métodos
    criados de aluno, solicitando ao usuário o nome do aluno desejado.

    3. Criar a classe Endereco. Os atributos são: rua, cep, bairro, cidade.
    Os metodos sao:
        a) void exibir();
        b) void atualizar();
    Criar dois construtores, um que nao receba nada como parametro e faz a leitura das
    informações pelo teclado e outro que recebe as informações como parâmetros.

    4. Atualizar a classe Aluno, adicionando um atributo do tipo Endereco. Criar mais um
    construtor na classe Aluno, que recebe nome, CPF e um objeto do tipo Endereco.

    5. Atualizar a classe principal, criando mais um objeto do tipo Aluno e chamando este
    último construtor.
    */

    // ATRIBUTOS
    String nome, matricula, cpf, turma;

    // CONSTRUTORES
    Aluno() { 
        System.out.println("Insira os dados do aluno.");
        System.out.print("\nNome: ");
        nome = scan.nextLine();
        System.out.print("\nMatrícula: ");
        matricula = scan.nextLine();
        System.out.print("\nCPF: ");
        cpf = scan.nextLine();
        System.out.print("\nTurma: ");
        turma = scan.nextLine();
    }

    Aluno(String nome, String matricula, String cpf, String turma){
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.turma = turma;
    }

    // MÉTODOS
    void exibir_dados(){
        System.out.println("===== EXIBIR DADOS =====");
        System.out.print("\nNome: "+ nome);
        System.out.print("\nMatrícula: "+ matricula);
        System.out.print("\nCPF: "+ cpf);
        System.out.print("\nTurma: "+ turma);
    }

    void atualizar_dados(){
        System.out.println("===== ATUALIZAR DADOS =====");
        System.out.println("Insira os novos dados do aluno escolhido.");
        System.out.print("Nome: ");
        nome = scan.nextLine();
        System.out.print("Turma: ");
        turma = scan.nextLine();
    }
    
}
