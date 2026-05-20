import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("===== CADASTRAR ALUNOS =====");
        System.out.println("----- ALUNO 1 -----");
        Aluno aluno1 = new Aluno();
        System.out.println("----- ALUNO 2 -----");
        Aluno aluno2 = new Aluno();
        System.out.println("----- ALUNO 3 -----");
        Aluno aluno3 = new Aluno();

        System.out.println("===== MENU =====");
        System.out.println("1 - Exibir dados");
        System.out.println("2 - Atualizar dados");
        System.out.print("Insira sua escolha: ");
        int opcao = scan.nextInt();

        System.out.print("Insira o aluno escolhido para realizar a ação [1 | 2 | 3]: ");
        int opc_aluno = scan.nextInt();

        switch(opc_aluno){
            case 1:
                if (opcao == 1){
                    aluno1.exibir_dados();
                }
                else if (opcao == 2){
                    aluno1.atualizar_dados();
                }
                else{
                    System.out.println("Opção inválida. Tente novamente.");
                }
                break;

            case 2: 
                if (opcao == 1){
                    aluno2.exibir_dados();
                }
                else if (opcao == 2){
                    aluno2.atualizar_dados();
                }
                else{
                    System.out.println("Opção inválida. Tente novamente.");
                }
                break;

            case 3:
                if (opcao == 1){
                    aluno3.exibir_dados();
                }
                else if (opcao == 2){
                    aluno3.atualizar_dados();
                }
                else{
                    System.out.println("Opção inválida. Tente novamente.");
                }
                break;

            default:
                System.out.println("Opção inválida. Tente novamente");
                break;
        }

    }
}
