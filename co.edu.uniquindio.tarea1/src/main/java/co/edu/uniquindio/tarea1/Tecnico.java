package co.edu.uniquindio.tarea1;

public class Tecnico extends Empleado implements IContribuyente {


    public Tecnico(){
    }
    public Tecnico(String nombre,int id, String departamento){
        super(nombre, id, departamento);
        }


        @Override
    public void contribuir(){
            System.out.println("Back end");
    }
}
