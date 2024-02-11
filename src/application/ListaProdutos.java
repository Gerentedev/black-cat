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
		prd.Name = sc.next();
		sc.nextLine();
		
		System.out.println("Price:");
		prd.Price = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Quantity in Stock");
		prd.Quantity = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("Product data:%s, %5.2f, %d units, Total: %5.2f",prd.Name,prd.Price,prd.Quantity,prd.TotalValueInStock());
	
		System.out.println("\nDigite a quantidade a ser adicionada:");
		int stockAddition = sc.nextInt();
		prd.AddProducts(stockAddition);
		sc.nextLine();
		
		System.out.printf("\nProduct data:%s, %5.2f, %d units, Total: %5.2f",prd.Name,prd.Price,prd.Quantity,prd.TotalValueInStock());

		System.out.println("Digite a quantidade a ser removida:");
		int stockRemoval = sc.nextInt();
		prd.RemoveProducts(stockRemoval);
		
		System.out.printf("\nProduct data:%s, %5.2f, %d units, Total: %5.2f",prd.Name,prd.Price,prd.Quantity,prd.TotalValueInStock());

		System.out.println("Parabéns, ficou ó ... uma merda");
	}

}
