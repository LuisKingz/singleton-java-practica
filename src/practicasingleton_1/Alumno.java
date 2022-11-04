package practicasingleton_1;

import java.util.Scanner;

public class Alumno {

    public static void main(String[] args) {
        Buscar alumno = Buscar.getInstance();
        Scanner rd = new Scanner(System.in);

        System.out.println("nombre:");
        String nombre = rd.next();
        System.out.println("apellido");
        String apellido = rd.next();
        System.out.println("fecha de nacimiento");
        String fecha = rd.next();
        alumno.buscarCurp(nombre, apellido, fecha);
    }
}
