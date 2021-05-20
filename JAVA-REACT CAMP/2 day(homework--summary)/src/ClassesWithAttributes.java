
public class ClassesWithAttributes {

	public static void main(String[] args) {

		Product_ClassesWithAttributes product = new Product_ClassesWithAttributes(  1, "Laptop", "Asus Laptop", 3000 , 2  );
			
		/*product._name = "Laptop";
		  product.setid(1);
		  product.set_description("Asus Laptop");
		  product._price = 5000;
		  product._stockAmount = 3;
		  product.getid(); */

		ProductManager_ClassesWithAttribute productManager = new ProductManager_ClassesWithAttribute();
		productManager.Add(product);
		System.out.println(product.get_description());
	}

}
