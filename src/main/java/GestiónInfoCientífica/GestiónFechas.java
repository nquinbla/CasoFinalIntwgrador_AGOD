package GestiónInfoCientífica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestiónFechas {
    private List<Fecha> fechas; // Clase interna Fecha

    public GestiónFechas() { // Constructor
        this.fechas = new ArrayList<>();
    }

    public void agregarFecha(int dia, int mes, int año) { // Método
        this.fechas.add(new Fecha(dia, mes, año));
    }

    public List<Fecha> listarFechas() { // Método
        Collections.sort(this.fechas);
        return this.fechas;
    }

    private class Fecha implements Comparable<Fecha> { // Clase interna
        private int dia;
        private int mes;
        private int año;

        public Fecha(int dia, int mes, int año) { // Constructor
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        }

        @Override
        public int compareTo(Fecha otraFecha) { // Método
            if (this.año != otraFecha.año) {
                return this.año - otraFecha.año;
            } else if (this.mes != otraFecha.mes) {
                return this.mes - otraFecha.mes;
            } else {
                return this.dia - otraFecha.dia;
            }
        }

        @Override // Método
        public String toString() {
            return dia + "/" + mes + "/" + año;
        }
    }
}