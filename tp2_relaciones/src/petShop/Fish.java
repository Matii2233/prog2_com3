package petShop;

public class Fish extends Animal{
    private String type;
    private String color;
    private float lengthSize;

    public Fish(String name, int age, float price) {
        super(name, age, price);
    }
    public Fish(String name, int age, float price, String type, String color, float lengthSize) {
        super(name, age, price);
        this.type = type;
        this.color = color;
        this.lengthSize = lengthSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getLengthSize() {
        return lengthSize;
    }

    public void setLengthSize(float lengthSize) {
        this.lengthSize = lengthSize;
    }


    @Override
    public String toString() {
        return "Pez: nombre " +this.getName()+", especie "+this.getType()+", edad "+this.getAge()+", color "+
                this.getColor()+", tamaño " +this.getLengthSize()+ "cm, precio "+this.getPrice();
    }
}
