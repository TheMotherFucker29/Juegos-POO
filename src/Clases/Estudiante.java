package Clases;

public class Estudiante extends Persona {
    private String carrera;
    private String id;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Estudiante(String nombre, int edad, String sexo, String id, String carrera){
        super(nombre,sexo,edad);

    }
}
