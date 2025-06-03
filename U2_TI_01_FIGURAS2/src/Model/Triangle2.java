package Model;
//triangulo rectangulo

public class Triangle2 extends FigureAbs {
    private double base;
    private double height;
    private double lado1;

    public Triangle2(double base, double height, double lado1) {
        this.base = base; //a
        this.height = height; //b
        this.lado1 = lado1; // c

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }



    @Override
    public double getArea() {
        return (base*height)/2;
    }
    @Override
    public double getPerimeter() {
        return lado1+height+base;
    }
}

