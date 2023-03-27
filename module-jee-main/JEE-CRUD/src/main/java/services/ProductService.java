package services;

import java.util.ArrayList;

import dao.Database;
import entity.Product;

public class ProductService {
	
	public void createProduct(Product p) {
		ArrayList<Product> list = Database.stock;
		list.add(p);
		
		// Database.stock.add(p)
	}
	
	public Product getProductById(int id) {
		for (Product p : Database.stock) {
			if (p.getId() == id) {
				return p;
			}
		}
		
		return null;
	}
	
	public ArrayList<Product> getAllProduct() {
		return Database.stock;
	}
	

	
	public void updateProduct(Product p) {
		for (Product product : Database.stock ) {
			
			if (p.getId() == product.getId()) {
				product.setBrand(p.getBrand());
				product.setDescription(p.getDescription());
				product.setName(p.getName());
				product.setPrice(p.getPrice());
			}
		}
	}
	
	public void deleteProduct(int id) {
		Product found = null;
		for (Product product : Database.stock ) {
			if (product.getId() == id) {
				found = product;
			}
		}
		Database.stock.remove(found);

	}
	
	public static void main(String[] args) {
		
		// Récupérer le service
		ProductService service = new ProductService();
		
		// Get all product
		System.out.println("Tout mes produits :" + service.getAllProduct());
		
		// Crée un nouveau product
		Product p = new Product(5, "Telephone", "lalala", 225, "Samsung");
		// Ajout du produit à la DB
		service.createProduct(p);
		
		System.out.println("New product :" + p);
		
		// Get all product
		System.out.println("Add product to db :" + service.getAllProduct());
		
		// Supprime le produit d'ID 1 dans la base de donnée
		service.deleteProduct(1);
		
		// On affiche tout les produits restant
		System.out.println("Remove product from db :" + service.getAllProduct());
	}
	
}
