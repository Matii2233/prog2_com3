import java.util.ArrayList;

public class Supermarket {
    protected ArrayList<Product> inventory;


    public Supermarket() {
        this.inventory = new ArrayList<Product>();
    }
    public Supermarket(Product product) {
        this.inventory = new ArrayList<Product>();
        this.inventory.add(product);
    }


    public void showInventory() {
        for (Product p : inventory) {
            System.out.println("  " +p.getName()+ ": ");
            System.out.println("   precio: " +p.getPrice());
            System.out.println("   stock: " +p.getStockNum());
        }
    }

    public void addProductToInventory(Product product) {
        this.inventory.add(product);
        product.stockNum++;
    }

    public void searchProduct(String productName){
        boolean found = false;
        // se itera sobre los productos de inventory, si se encuentra uno con el nombre pedido se rompe el ciclo y
        // se muestra los datos del producto
        for (Product product : inventory) {
            if (product.getName().equals(productName)) {
                found = true;
                System.out.println("Producto encontrado: ");
                product.showInfo();
                break;
            }
        }
        // cuando no se encuentra el producto la variable found permanece falso y se comunica que el producto no esta
        // disponible
        if(found == false) {
            System.out.println("El producto no esta disponible");
        }
    }

    public void makePurchase(Customer customer) {
        for(Product product : inventory){
            for(Product cproduct : customer.getCart()){
                if(product.getName().equals(cproduct.getName())){
                    product.stockNum--;
                    customer.cart.remove(cproduct);
                    break;
                }
            }
        }
        System.out.println("Compra realizada");
    }
}
