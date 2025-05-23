package U1_TI_02_Areas;

public class Square {
    private double lado;

    public double getPerimeter() {
        return lado*4;
    }
    public double getArea() {
        return lado*lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
}
