package co.com.ProyectoBase.Screenplay.model;

public class DatosUsuario {
    private String ubicacion;
    private String fechaIngreso;
    private String fechaSalida;
    private String numHabitaciones;
    private String numAdultos;
    private String numNinos;

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(String numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getNumAdultos() {
        return numAdultos;
    }

    public void setNumAdultos(String numAdultos) {
        this.numAdultos = numAdultos;
    }

    public String getNumNinos() {
        return numNinos;
    }

    public void setNumNinos(String numNinos) {
        this.numNinos = numNinos;
    }
}
