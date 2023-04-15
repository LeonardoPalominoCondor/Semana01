public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private String universidad; // Nuevo atributo

    public Estudiante(String nombre, int edad, String carrera, String universidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.universidad = universidad;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + this.nombre + " y tengo " + this.edad + " años. Estudio " + this.carrera + " en la universidad " + this.universidad + "."); // Modificación en la salida de presentarse()
    }

    public void estudiar() {
        System.out.println(this.nombre + " está estudiando para su carrera de " + this.carrera + " en la universidad " + this.universidad + "."); // Modificación en la salida de estudiar()
    }

    public void setUniversidad(String universidad) { // Nuevo método
        this.universidad = universidad;
    }
}
