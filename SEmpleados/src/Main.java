//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {

        Empleado empleado = new EmpleadoTiempoCompleto("1", "Vitor", 500000 , "Seguro de vida" );
        Empleado empleado2 = new EmpleadoPorHoras("2", "Jaime", 20, 10);

        System.out.println("salario de " + empleado.getNombre()+ " $ "+empleado.calcularSalario());
        System.out.println("salario de " + empleado2.getNombre()+ " $ "+empleado2.calcularSalario());


    }
}