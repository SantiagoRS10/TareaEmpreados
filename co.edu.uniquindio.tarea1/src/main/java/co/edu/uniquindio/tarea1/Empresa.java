package co.edu.uniquindio.tarea1;

public class Empresa {
    private Proyecto proyecto;
    private Departamento departamento;
    private Empleado empleado;

    public Empresa(){

    }

    public Empresa(Proyecto proyecto,Departamento departamento, Empleado empreado){
        this.proyecto=proyecto;
        this.departamento=departamento;
        this.empleado=empreado;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
