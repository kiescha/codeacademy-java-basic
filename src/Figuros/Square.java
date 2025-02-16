package Figuros;

public class Square implements Figuren, isCorneredFigure{

    private final double krastine;


    public Square(double a) {
        this.krastine = a;
    }

    @Override
    public double getArea() {
        return krastine * krastine;
    }

    @Override
    public double getPerimeter() {
        return krastine * 4;
    }
}
