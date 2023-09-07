package empleado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

    

public class Empleado {
    public String dni;
    public String nombre;
    public String apellido;
    public String domicilio;
    public String fechaDeNacimiento;
    public double sueldoBruto;
    public int edad;
    
    public Empleado(String dni,String nombre, String apellido, String domicilio, String fechaDeNacimiento, double sueldoBruto){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sueldoBruto = sueldoBruto;
        this.edad = calcularEdad();
    }
    public int calcularEdad() {
     // Formatear la fecha de nacimiento en un formato válido para LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDate fechaNacimiento = LocalDate.parse(this.fechaDeNacimiento, formatter);
        // Calcular la diferencia en años entre la fecha de nacimiento y la fecha actual
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        // Ajustar la edad si aún no ha llegado el cumpleaños este año
        if (fechaNacimiento.plusYears(edad).isAfter(fechaActual)) {
            edad--;
        }

        return edad;
    }

    public void mostrarDatos(){
        System.out.println("---------------------------");
        System.out.println("DNI: "+dni);
        System.out.println("Nombre :"+nombre);
        System.out.println("Apellido:"+apellido);
        System.out.println("Fecha Nacimiento:"+fechaDeNacimiento);
        System.out.println("Edad: "+edad);
        System.out.println("Domicilio: "+domicilio);
        System.out.println("Sueldo bruto: "+sueldoBruto);
        System.out.println("----------------------------");
    }
    
    
    
    
    
}