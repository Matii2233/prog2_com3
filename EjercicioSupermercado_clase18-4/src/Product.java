public class Product {
    private String name;
    private float price;
    protected int stockNum;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
        this.stockNum = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStockNum() {
        return this.stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }


    public void showInfo(){
        System.out.println("  " +this.getName()+ ": ");
        System.out.println("   precio: " +this.getPrice());
        System.out.println("   stock: " +this.getStockNum());
    }
}
