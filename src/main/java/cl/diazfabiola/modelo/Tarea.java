package cl.diazfabiola.modelo;

public class Tarea {

    private final int id;
    private final String titulo;
    private final String descripcion;
    private String status;

    public Tarea(int id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.status = "PENDIENTE";
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


