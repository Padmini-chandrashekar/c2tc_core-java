

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String Prodname;
	float price;
	public Product(int id, String prodname, float price) {
		super();
		this.id = id;
		Prodname = prodname;
		this.price = price;
	}
	
	}
	

public class JavaStreamExample {

	public static void main(String[] args) {
		List <Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"hp laptop",25000f));
		productList.add(new Product(1,"dell laptop",50000f));
		productList.add(new Product(1,"lenova laptop",30000f));
		productList.add(new Product(1,"apple laptop",75000f));
		System.out.println(productList.stream().count());
	
		/*
		 * List product1=productList.stream() .filter(p->p.price>50000)//
		 * .map(p->p.price) .collect(Collectors.toList()); System.out.println(product1);
		 */
		
	}

}
