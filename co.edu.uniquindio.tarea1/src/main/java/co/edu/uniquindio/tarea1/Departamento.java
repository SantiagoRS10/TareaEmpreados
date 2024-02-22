package co.edu.uniquindio.tarea1;

import java.util.ArrayList;


public class Departamento {
    private String nombre;
    private int codigo;
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public Departamento(){

    }

    public Departamento(String nombre,int codigo, ArrayList<Empleado> listaEmpleados){
        this.nombre=nombre;
        this.codigo=codigo;
        this.listaEmpleados=listaEmpleados;
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

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
}
