package Miguel_java;

public class PaiMain {

	 Scanner sc = new Scanner (System.in);
     
     System.out.println("== CADASTRO DE CACHORRO ==");
     System.out.println("Nome: ");
     String nome = sc.nextLine();
     
     System.out.println("idade: ");
     int idade = sc.nextInt();
     
     System.out.println("Raça: ");
     String raca = sc.nextLine();
     
     Cachorro c = new Cachorro (nome, idade, raca);
     
     c.exibirDados();
     
 }

}