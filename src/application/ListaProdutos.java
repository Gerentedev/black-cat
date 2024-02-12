package application;

import java.util.Scanner;

import entities.Product;

public class ListaProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product prd = new Product();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.println("Name:");
		prd.name = sc.next();
		sc.nextLine();
		
		System.out.println("Price:");
		prd.price = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Quantity in Stock");
		prd.quantity	 = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("Product data:%s, %5.2f, %d units, Total: %5.2f\n",prd.name,prd.price,prd.quantity,prd.TotalValueInStock());
		
		
		
		System.out.println("Digite a quantidade a ser adicionada:");
		int stockAddition = sc.nextInt();
		prd.AddProducts(stockAddition);
		System.out.printf("Product data:%s, %5.2f, %d units, Total: %5.2f\n",prd.name,prd.price,prd.quantity,prd.TotalValueInStock());
		sc.nextLine();
		
		System.out.println("Digite a quantidade a ser removida:");
		int stockRemoval = sc.nextInt();
		prd.RemoveProducts(stockRemoval);
		System.out.printf("\nProduct data:%s, %5.2f, %d Units, Total: %5.2f",prd.name,prd.price,prd.quantity,prd.TotalValueInStock());
		sc.nextLine();
		
		System.out.println("\toString");
		System.out.println("\n"+prd.toString());
		
	}

}
