package cl.diazfabiola.service;


import cl.diazfabiola.modelo.Tarea;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GestionarTareasTest {

    GestionarTareas gestionarTareas;
    Tarea tarea;

    @BeforeEach
    void setUp() {
        gestionarTareas = new GestionarTareas();
        tarea = gestionarTareas.agregarTarea("Tarea 1", "Descripción de la tarea 1");
    }

    @Test
    void agregarUnaTarea() {
        assertThat(tarea.getId()).isEqualTo(1);
        assertThat(gestionarTareas.getAll()).hasSize(1);
    }

    @Test
    void actualizarUnaTarea() {
        boolean actualizado = gestionarTareas.actualizarEstado(tarea.getId(), "COMPLETADA");
        assertThat(actualizado).isTrue();
        assertThat(tarea.getStatus()).isEqualTo("COMPLETADA");
    }

    @Test
    void eliminarUnaTarea() {
        boolean eliminado = gestionarTareas.eliminarTarea(tarea.getId());
        assertThat(eliminado).isTrue();
        assertThat(gestionarTareas.getAll()).isEmpty();
    }
}