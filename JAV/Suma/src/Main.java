import javax.swing.*;

public class Main {
    public static void main(String[] args){
        String calif1 = JOptionPane.showInputDialog("Ingresa el primer numero:");
        String calif2 = JOptionPane.showInputDialog("Ingresa el segundo numero:");
        String calif3 = JOptionPane.showInputDialog("Ingresa el tercer numero:");
        float promedio = (Float.parseFloat(calif1) + Float.parseFloat(calif2) + Float.parseFloat(calif3)) / 3;
        System.out.println("El promedio de los 3 numeros ingresados es: "+promedio);
}
}