package entities;

public class Product {

	public String Name;
	public double Price;
	public int Quantity;

	public double TotalValueInStock() {
		return Price * Quantity;
	}

	public void AddProducts(int intAddStockValue) {
		Quantity += intAddStockValue;
	}

	public void RemoveProducts(int intRemoveStockValue) {
		Quantity -= intRemoveStockValue;
	};

}
