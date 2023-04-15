public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + this.nombre + " y tengo " + this.edad + " años. Estudio " + this.carrera + ".");
    }

    public void estudiar() {
        System.out.println(this.nombre + " está estudiando para su carrera de " + this.carrera + ".");
    }
}