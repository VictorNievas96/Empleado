package pruebaempleado;

import empleado.Empleado;
import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[3];
        
        for (int i = 0; i < 3; i++) { 
            System.out.println("Ingrese los datos del empleado " + (i + 1));
            
            System.out.print("Digite su DNI: ");
            String dni = escaner.nextLine();
            
            System.out.print("Digite su Nombre: ");
            String nombre = escaner.nextLine();
            
            System.out.print("Digite su Apellido: ");
            String apellido = escaner.nextLine();
            
            System.out.print("Digite su domicilio: ");
            String domicilio = escaner.nextLine();
            
            System.out.print("Digite su fecha de nacimiento: ddMMyyy ");
            String fechaDeNacimiento = escaner.nextLine();
            
            System.out.print("Digite su sueldo: ");
            double sueldoBruto = Double.parseDouble(escaner.nextLine());

            Empleado empleado = new Empleado(dni, nombre, apellido, domicilio, fechaDeNacimiento, sueldoBruto);

            empleados[i] = empleado;
        }
        
        for (int i = 0; i < 3; i++) {
            empleados[i].mostrarDatos();
        }
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Datos del empleado " + (i + 1) + ":");
//            System.out.println("DNI: " + empleados[i].dni);
//            System.out.println("Nombre: " + empleados[i].nombre);
//            System.out.println("Apellido: " + empleados[i].apellido);
//            System.out.println("Domicilio: " + empleados[i].domicilio);
//            System.out.println("Fecha de Nacimiento: " + empleados[i].fechaDeNacimiento);
//            System.out.println("Sueldo Bruto: " + empleados[i].sueldoBruto);
//            System.out.println("Edad: " + empleados[i].edad);
//            System.out.println();
//        }
        
        escaner.close();
    }

}