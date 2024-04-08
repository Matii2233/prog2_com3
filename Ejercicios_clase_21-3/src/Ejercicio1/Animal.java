package Ejercicio1;

public abstract class Animal {
    private String picture;
    private String location;
    private String size;
    private String food;


    public Animal() {}
    public Animal(String picture, String location, String size, String food) {
        this.picture = picture;
        this.location = location;
        this.size = size;
        this.food = food;
    }


    public String getPhoto() {return picture;}
    public void setPhoto(String photo) {this.picture = photo;}
    public String getLocate() {return location;}
    public void setLocate(String locate) {this.location = locate;}
    public String getSize() {return size;}
    public void setSize(String size) {this.size = size;}
    public String getFood() {return food;}
    public void setFood(String food) {this.food = food;}


    public void makeSound(){}
    public void toSleep(){System.out.println("El animal esta durmiendo");}
    public void toEat(){}
    public void toRoar(){}
}
