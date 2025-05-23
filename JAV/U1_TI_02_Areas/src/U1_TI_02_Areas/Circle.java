package U1_TI_02_Areas;

public class Circle {

    private double radio;

    public double getPerimeter() {
        return (radio*(3.14*3.14));
    }
    public double getArea() {
        return (3.14*(radio*radio));
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
