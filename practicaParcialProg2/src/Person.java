public class Person {
    private int idn;
    private String name;

    public Person() {}
    public Person(int idn, String name) {
        this.idn = idn;
        this.name = name;
    }

    public int getIdn() {
        return idn;
    }

    public void setIdn(int idn) {
        this.idn = idn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
