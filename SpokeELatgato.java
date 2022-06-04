import java.util.Random;
	import java.util.Scanner;
public class SpokeELatgato {

		static  Random random = new Random();
		static Scanner scanner= new Scanner(System.in);
		static final byte[][]PedraPapelTesoura=
		{
				{0,-1,1,1,-1},
				{1,0,-1,-1,1},
				{-1,1,0,1,-1},
				{-1,1,1,0,1},
				{1,-1,1,-1,0},				
		};
		
		static final String[] opcaoes = {"Pedra","Papel","Tesoura","largato","Spock"};
		
		static final byte ganhou=1;
		static final byte empatou=0;
		static final byte perdeu=-1;
		
		static int obterOpcaoComputador()
		{
			return random.nextInt(PedraPapelTesoura.length);
		}//fim obterOpcaoComputador()
		
		
		static int lerJoagdor()
		{
			System.out.println("[0] Pedra");
			System.out.println("[1] Papel");
			System.out.println("[2] Tesoura");
			System.out.println("[3] Largato");
			System.out.println("[4] Spoke");
			System.out.print("Opção: ");
			return scanner.nextInt();
		}//fim lerJogador()
		
		
		static void jogar()
		{
			int jogador =lerJoagdor();
			int computador= obterOpcaoComputador();
			
			System.out.printf("\nJogador 1: %s", opcaoes[jogador]);
			System.out.printf("\nComputador: %s", opcaoes[computador]);
			System.out.println("\n");
			
			if(PedraPapelTesoura[jogador][computador]==ganhou)
			{
				System.out.println("Parabens Voce ganhou");
				
			}
				else if(PedraPapelTesoura[jogador][computador]==empatou)
				{
					System.out.println("Empate");
				}
					else if(PedraPapelTesoura[jogador][computador]==perdeu)
					{
						System.out.println("O computador ganhou");
					}
		}//fim jogar()
		
		
		static void menu()
		{
			System.out.println("Menu");
			System.out.println("[1] Jogar");
			System.out.println("[2] SAIR");
			
			System.out.print("Opção: ");
			int opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				jogar();
				menu();
				break;
			case 2:
				System.exit(0);
				break;
				default:
						menu();
						break;		
				
			
			}
		}
		public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			menu();
			
			input.close();
		}// fim main


}
