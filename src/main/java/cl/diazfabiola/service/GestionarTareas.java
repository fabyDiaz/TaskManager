package cl.diazfabiola.service;

import cl.diazfabiola.modelo.Tarea;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/*
public class GestionarTareas {

    List<Tarea> tareas = new ArrayList<>();
    private int nextId = 1;

    public Tarea agregarTarea(String titulo, String descripcion) {
        Tarea tarea = new Tarea(nextId++, titulo, descripcion);
        tareas.add(tarea);
        return tarea;
    }

    public boolean actualizarEstado(int id, String newStatus) {
        Optional<Tarea> task = tareas.stream()
                .filter(t -> t.getId() == id)
                .findFirst();
        if (task.isPresent()) {
            task.get().setStatus(newStatus);
            return true;
        }
        return false;
    }

    public boolean eliminarTarea(int id) {
        return tareas.removeIf(t -> t.getId() == id);
    }

    public List<Tarea> getAll() {
        return tareas;
    }
}


 */
