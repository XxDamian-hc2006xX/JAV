
public class Main {
    public static void main(String[] args) {

        Curso miCurso = new Curso("123", "Cheetos1",3);

        Estudiante estudiante1 = new Estudiante("Vitor Dios", "Vitor", 10.00);
        Estudiante estudiante2 = new Estudiante("Santiago", "Santi", 10.00);
        Estudiante estudiante3 = new Estudiante("Alets", "Alex", 10.00);

        miCurso.inscribir(estudiante1);
        miCurso.inscribir(estudiante2);
        miCurso.inscribir(estudiante3);

        double promedio = miCurso.calcularPromedioG();

        System.out.println(promedio);


    }
}