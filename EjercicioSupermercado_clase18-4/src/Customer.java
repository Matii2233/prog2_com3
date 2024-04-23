import java.util.ArrayList;

public class Customer {
    private String name;
    private String surname;
    protected ArrayList<Product> cart;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.cart = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void addProduct(Product product){
        if (product.getStockNum()>0) {
            cart.add(product);
        } else {
            System.out.println("El producto no esta disponible");
        }
    }

    public void total () {
        System.out.println("El total de la compra de " +this.getName()+ " es:");
        float total = 0;
        for (Product product : cart) {
            total = total + product.getPrice();
        }
        System.out.println("  " +total+ " pesos");
    }
}
