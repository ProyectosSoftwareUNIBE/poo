package ejemplo;

import java.util.ArrayList;

import ejemplo.herencia.Cuadrado;
import ejemplo.herencia.Figura;
import ejemplo.herencia.FiguraInterface;
import ejemplo.herencia.Triangulo;
import ejemplo.store.Item;
import ejemplo.store.Piramide;
import ejemplo.store.Product;
import ejemplo.store.ShoppingCart;
import ejemplo.store.User;

public class Main {

	public static void main(String[] args) {

		Product product = new Product("1231234", "adsfa13", "celular", 250.14);
		Product product2 = new Product("123125334", "sfa13", "Table", 450.14);
		Item item = new Item(2, product);
		Item item2 = new Item(3, product2);
		User user = new User("1", "Rafael", "Falconí");
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(item);
		items.add(item2);
		ShoppingCart shoppingCart = new ShoppingCart("12", user, items);
		System.out.println(shoppingCart);
		System.out.println("---------------------");
		for (Item itemFor : items) {
			System.out.println(itemFor);
		}
	
		System.out.println("---------------------");
		for (int i = 0; i < items.size(); i++) {
			Item itemFor=items.get(i);
			System.out.println(itemFor);
		}
		System.out.println("---------------------");
		FiguraInterface triangulo= new Triangulo(1, 5);
		Figura cuadrado=new Cuadrado(1);
		System.out.println(triangulo.getClass());
		System.out.println(triangulo.area());
		System.out.println(cuadrado.getClass());
		System.out.println(cuadrado.area());
		System.out.println("---------------------");
		Piramide piramide=new Piramide();
		System.out.println(piramide.getVolumen(3, 12));
		System.out.println(piramide.getVolumen(3, 12,7));
		System.out.println("----------------------------------------------------------------------------");
		ejemplo.ejemploExamen.User userEjemplo= new ejemplo.ejemploExamen.User("rafael" , "falconi");
		ArrayList<ejemplo.ejemploExamen.Item> itemsEjemplo=new ArrayList<ejemplo.ejemploExamen.Item>();
		ejemplo.ejemploExamen.ShoppingCart shoppingCart2=new ejemplo.ejemploExamen.ShoppingCart(userEjemplo, 0, itemsEjemplo);
		System.out.println(shoppingCart2);
		ejemplo.ejemploExamen.Item itemEjemplo=new ejemplo.ejemploExamen.Item(50.0, "papas");
		shoppingCart2.addItem(itemEjemplo);
		System.out.println(shoppingCart2);
		
		

		
		

	}

}
