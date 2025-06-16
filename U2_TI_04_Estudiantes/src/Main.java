
public class Main {
    public static void main(String[] args) {

        Curso miCurso = new Curso("123", "Cheetos1", 3);

        Estudiante estudiante1 = new Estudiante("Vitor Dios", "VitorDios@gmail.com", 10.00);
        Estudiante estudiante2 = new Estudiante("Santiago", "Santiago@gmail.com", 9.9);
        Estudiante estudiante3 = new Estudiante("Alets", "Alex@gmail.com", 9.9);

        miCurso.inscribir(estudiante1);
        miCurso.inscribir(estudiante2);
        miCurso.inscribir(estudiante3);

        System.out.println("INSCRITOS"+"\nEstudiante 1: " + estudiante1.getNombre() + "\nEstudiante 2: " + estudiante2.getNombre() + "\nEstudiante 3: " + estudiante3.getNombre() );

        double promedio = miCurso.calcularPromedioG();
        System.out.println("Promedio grupal "+ promedio);
    }
}