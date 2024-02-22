package co.edu.uniquindio.tarea1;

public class Gerente extends Empleado implements IContribuyente, IGestionEmpleado{
    private int añosExperiencia;
    private int telefono;



    public Gerente(){

    }

    public Gerente(String nombre,int id, String departamento, int añosExperiencia, int telefono){
        super(nombre, id, departamento);
        this.añosExperiencia=añosExperiencia;
        this.telefono=telefono;
    }

    @Override
    public void contribuir(){
        System.out.println("Front end");
    }

    public void Gestionarempleado(){
        System.out.println("Empleado gestionado");
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nombre='" + getNombre() + '\'' +
                ", id=" + getId() +
                ", departamento='" + getDepartamento() + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                ", telefono=" + telefono +
                '}';

}
}
