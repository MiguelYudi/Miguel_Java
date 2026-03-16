package Miguel_java;

import java.util.*;

public class Produtomain {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        
        
        int opcao;
        
        Projetos_Array prod = new Projetos_Array();
        
        
         do {

             System.out.println("\n=== CADASTRO DE PRODUTOS ===");
             System.out.println("1. Adicionar produto");
             System.out.println("2. Listar produtos");
             System.out.println("3. Contar produtos");
             System.out.println("0. Sair");
             System.out.print("Escolha: ");

             opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao){
            
            case 1:
                System.out.println("== ADICIONAR PRODUTO ==");
                System.out.print("\nNome: ");
                String nome = sc.nextLine();

                System.out.print("\nPreço: ");
                double preco = sc.nextDouble();

                System.out.print("\nQuantidade: ");
                int qtd = sc.nextInt();
                sc.nextLine(); // Limpa o buffer
                
             //   prod.adicionar(nome, preco, qtd);
                break;
                
            case 2:
                
               // prod.listar();
                break;
                
            case 3:
               // System.out.println("Produto: "+prod.contar());
                
            }
            
         }while (opcao != 0);
         sc.close();
    }
}

