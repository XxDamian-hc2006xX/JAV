public class main {

    private String nombre;
    private String matricula;
    private double[] notas;

    // Constructor
    public main() {
        notas = new double[5];
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }


    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }

    // Getters y setters para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota(int i) {
        if (i >= 0 && i < notas.length) {
            return notas[i];
        } else {
            throw new IndexOutOfBoundsException("Índice de nota inválido");
        }
    }

    public void setNota(int i, double n) {
        if (i >= 0 && i < notas.length) {
            notas[i] = n;
        } else {
            throw new IndexOutOfBoundsException("Índice de nota inválido");
        }
    }


    public static void main(String[] args) {
        main[] estudiantes = new main[5];

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new main();
            estudiantes[i].setNombre("Estudiante " + (i + 1));
            estudiantes[i].setMatricula("MAT00" + (i + 1));


            for (int j = 0; j < 5; j++) {
                double nota = 50 + Math.random() * 50;
                estudiantes[i].setNota(j, nota);
            }
        }


        for (main e : estudiantes) {
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Matrícula: " + e.getMatricula());
            System.out.printf("Promedio: %.2f\n", e.calcularPromedio());
            System.out.println("¿Aprobado?: " + (e.aprobado() ? "Sí" : "No"));
            System.out.println("---------------");
        }
    }
}
