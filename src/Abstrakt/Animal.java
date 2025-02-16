package Abstrakt;

public abstract class Animal {

    protected String code;

    public abstract void voice();
    public abstract void setCode();

    @Override
    public String toString() {
        return "Cia yra gyvunas";
    }
}
