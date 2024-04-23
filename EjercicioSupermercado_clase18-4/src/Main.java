// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Supermarket smarket = new Supermarket();
        Product muñecoSuperman = new Product("Muñeco Superman Articulado", 12000);
        Product virulana = new Product("Virulana Chica", 1900);
        Customer daniela = new Customer("Daniela", "Rodriguez");
        System.out.println();


        // Gestion de inventario del supermercado
        smarket.addProductToInventory(muñecoSuperman);
        smarket.addProductToInventory(virulana);
        System.out.println("Obtencion informacion del producto: ");
        muñecoSuperman.showInfo();
        System.out.println();
        System.out.println("Obtencion informacion del inventario del supermercado: ");
        smarket.showInventory();
        System.out.println();
        System.out.println("Buscar un producto del supermercado por el nombre: ");
        smarket.searchProduct("Virulana Chica");
        System.out.println();


        //Compras de los clientes
        System.out.println("-----------compra de un objeto del carrito de un cliente----------");
        System.out.println("Se añade un objeto al carrito");
        daniela.addProduct(muñecoSuperman);
        System.out.println();

        System.out.println("Se muestran los objetos del carrito");
        for(Product p : daniela.getCart()){
            System.out.println("  " +p.getName());
        }
        System.out.println();

        System.out.println("Se muestra el valor total de los objetos del carrito");
        daniela.total();
        System.out.println();

        System.out.println("Se realiza la compra");
        smarket.makePurchase(daniela);
        System.out.println();

        System.out.println("Se muestra el carrito de daniela despues de la compra (mostrara vacio): ");
        for(Product p : daniela.getCart()){
            System.out.println(" -"+p.getName());
        }
    }
}