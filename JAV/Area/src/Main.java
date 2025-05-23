import Areas.Square;
import Areas.Triangle;
import Areas.Circle;

public class Main{
    public static void main(String[] args) throws Exception {
        Circle ci = new Circle();
        ci.setRadio(5);
        System.out.println("Circulo");
        System.out.println(ci.getPerimeter());
        System.out.println(ci.getArea());
        ////////////////
        Square sq = new Square();
        sq.setLado(5);
        System.out.println("Cuadrado");
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());
        ////////////////
        Triangle tr = new Triangle();
        tr.setBase(5);
        tr.setAltura(7);
        tr.setLados(6);
        System.out.println("Triangulo");
        System.out.println(tr.getPerimeter());
        System.out.println(tr.getArea());
    }

}