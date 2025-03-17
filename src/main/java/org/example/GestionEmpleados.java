package org.example;

import java.util.ArrayList;
import java.util.List;
class Empleado{

    private static int contadorEmpleados = 0;

    private int id;
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.id = ++contadorEmpleados;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Salario=" + salario + "]";
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }
}


    public class GestionEmpleados {

    private List<Empleado> listaEmpleados = new ArrayList<>();

    public void agregarEmpleado(String nombre, double salario) {
        Empleado nuevoEmpleado = new Empleado(nombre, salario);
        listaEmpleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado: " + nuevoEmpleado);
    }
    public void mostrarEmpleados() {
        System.out.println("\nLista de Empleados:");
        for (Empleado emp : listaEmpleados) {
            System.out.println(emp);
        }
    }
    public static void main(String[] args) {
        GestionEmpleados gestion = new GestionEmpleados();

        gestion.agregarEmpleado("Juan Pérez", 50000);
        gestion.agregarEmpleado("Ana Gómez", 60000);
        gestion.agregarEmpleado("Luis Ramírez", 45000);

        gestion.mostrarEmpleados();

        System.out.println("\nTotal de empleados creados: " + Empleado.getContadorEmpleados());
    }
}