package co.edu.uniquindio.tarea1;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();


        gerente1.contribuir();
        gerente1.Gestionarempleado();


        gerente1.setNombre("Juan");
        gerente1.setId(1);
        gerente1.setDepartamento("Ventas");
        gerente1.setAñosExperiencia(3);
        gerente1.setTelefono(32023104);


        System.out.println("Información del Gerente:");
        System.out.println("Nombre: " + gerente1.getNombre());
        System.out.println("ID: " + gerente1.getId());
        System.out.println("Departamento: " + gerente1.getDepartamento());
        System.out.println("Teléfono: " + gerente1.getTelefono());





        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(gerente1);



        Departamento departamento1 = new Departamento();


        departamento1.setNombre("Ventas");
        departamento1.setCodigo(101);
        departamento1.setListaEmpleados(listaEmpleados);


        System.out.println("Información del Departamento:");
        System.out.println("Nombre: " + departamento1.getNombre());
        System.out.println("Código: " + departamento1.getCodigo());
        System.out.println("Empleados:");

        for (Empleado empleado : departamento1.getListaEmpleados()) {
            System.out.println("  - Nombre: " + empleado.getNombre() + ", ID: " + empleado.getId() + ", Departamento: " + empleado.getDepartamento());
        }
    }

    }


