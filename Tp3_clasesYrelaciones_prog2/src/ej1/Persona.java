package ej1;

public abstract class Persona {
    protected int idn;
    protected String name;

    public Persona(int idn, String name) {
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
