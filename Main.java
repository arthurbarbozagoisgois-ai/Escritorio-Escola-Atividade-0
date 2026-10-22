import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

		//Jogador 1
        System.out.println("Cadastro do Jogador 1:");
        System.out.print("Nome: ");
        jogador1.setNome(scanner.nextLine());
        
        System.out.print("Nick: ");
        jogador1.setNick(scanner.nextLine());
        
        System.out.print("Idade: ");
        jogador1.setIdade(scanner.nextInt());
        scanner.nextLine(); 
        
        System.out.print("Jogo favorito: ");
        jogador1.setJogoFavorito(scanner.nextLine());
        
        System.out.print("Nível (1 a 100): ");
        jogador1.setNivel(scanner.nextInt());
        scanner.nextLine(); 

		//Jogador2
        System.out.println("Cadastro do Jogador 2:");
        System.out.print("Nome: ");
        jogador2.setNome(scanner.nextLine());
        
        System.out.print("Nick: ");
        jogador2.setNick(scanner.nextLine());
        
        System.out.print("Idade: ");
        jogador2.setIdade(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Jogo favorito: ");
        jogador2.setJogoFavorito(scanner.nextLine());
        
        System.out.print("Nível (1 a 100): ");
        jogador2.setNivel(scanner.nextInt());


        System.out.println("Ficha dos Jogadores:");
        jogador1.mostrarFicha();
        jogador2.mostrarFicha();

        scanner.close();
    }
}
