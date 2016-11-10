package git_example;

public class Calc {
    private double a;
    private double b;

    public Calc(double a, double b) {
        setA(a);
        setB(b);
    }

    public Calc(){

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add(double a, double b) {
        return getA() + getB();
    }

    public double sub(double a, double b) {
        return getA() - getB();
    }
}
