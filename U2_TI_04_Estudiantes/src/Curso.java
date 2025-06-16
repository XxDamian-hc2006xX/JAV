public class Curso {
    private String codigo;
    private String nombre;
    private Estudiante[] inscritos;

    public Curso(String codigo, String nombre, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        inscritos = new Estudiante[capacidad];
    }

    public boolean inscribir(Estudiante e){
        for(int i = 0; i < inscritos.length; i++){
            if(inscritos[i] == null){
                inscritos[i] = e;
                return true;
            }
        }
        return false;
    }
    public double calcularPromedioG(){
        double suma = 0;
        int contador = 0;
        for(int i = 0; i < inscritos.length; i++){
            if(inscritos[i] != null){
              suma= suma+ inscritos[i].getPromedio();
              contador++;
            }
        }
        if (contador > 0) {
            return suma/contador;
        } else {
            return 0;
        }
    }

}
