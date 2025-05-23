package U1_TI_02_Areas;

public class Triangle {

    private double base;
    private double altura;
    private double lados;

    public double getPerimeter() {
        return (base+(lados*2));
    }
    public double getArea() {
        return ((base*altura)/2);
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setLados(double lados) {
        this.lados = lados;
    }

}
