package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double TotalValueInStock() {
		return price * quantity;
	}

	public void AddProducts(int intAddStockValue) {
		quantity += intAddStockValue;
	}

	public void RemoveProducts(int intRemoveStockValue) {
		quantity -= intRemoveStockValue;
	}
	public String toString() {
		return "\n"+name
				+ ", $"
				+ String.format("%5.2f", price)
				+ ", "
				+ quantity
				+ "units, Total: $ "
				+String.format("%5.2f",TotalValueInStock());
	}
}
