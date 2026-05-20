import java.util.Scanner;
public class Endereco {
    Scanner scan = new Scanner(System.in);

    // ATRIBUTOS
    String rua, cep, bairro, cidade;

    // CONSTRUTORES
    Endereco() {
        System.out.println("Insira os dados do endereço.");
        System.out.print("Rua: ");
        rua = scan.nextLine();
        System.out.print("\nCEP: ");
        cep = scan.nextLine();
        System.out.print("\nBairro: ");
        bairro = scan.nextLine();
        System.out.print("\nCidade: ");
        cidade = scan.nextLine();
    }
    
    // MÉTODOS
    void exibir_dados(){
        System.out.println("===== EXIBIR DADOS =====");
        System.out.print("Rua: "+ rua);
        System.out.print("\nCEP: "+ cep);
        System.out.print("\nBairro: "+ bairro);
        System.out.print("\nCidade: "+ cidade);
    }

    void atualizar_dados(){
        System.out.println("===== ATUALIZAR DADOS =====");
        System.out.print("Rua: ");
        rua = scan.nextLine();
        System.out.print("\nCEP: ");
        cep = scan.nextLine();
        System.out.print("\nBairro: ");
        bairro = scan.nextLine();
        System.out.print("\nCidade: ");
        cidade = scan.nextLine();
    }

}
