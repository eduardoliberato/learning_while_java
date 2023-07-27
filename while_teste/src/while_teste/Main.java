package while_teste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				Scanner sc = new Scanner(System.in);
				
				int x = sc.nextInt();
				int soma = 0;
				
				System.out.println("Digite um valor: ");
				x = sc.nextInt();
				
				while (x != 0) {
					soma = soma + x;
					x = sc.nextInt();
					
				}
				
				sc.close();
				
				System.out.printf("A soma dos valores digitados é %d", soma);
				
				

			}

}




