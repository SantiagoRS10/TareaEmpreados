package co.edu.uniquindio.tarea1;

public class Proyecto {
    private String nombre;
    private int codigo;
    private Empleado empleadosasignados;

    public Proyecto(){

    }

    public Proyecto(String nombre,int codigo,Empleado empleadosasignados){
        this.nombre=nombre;
        this.codigo=codigo;
        this.empleadosasignados=empleadosasignados;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Empleado getEmpleadosasignados() {
        return empleadosasignados;
    }

    public void setEmpleadosasignados(Empleado empleadosasignados) {
        this.empleadosasignados = empleadosasignados;
    }
}
