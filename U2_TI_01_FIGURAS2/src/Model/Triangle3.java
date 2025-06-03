package Model;
// triangulo equilatero

public class Triangle3 extends  FigureAbs {
    private double base;

    public Triangle3(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(0.75))*(Math.pow(base,2));
    }
    @Override
    public double getPerimeter() {
        return 3*base;
    }


}
