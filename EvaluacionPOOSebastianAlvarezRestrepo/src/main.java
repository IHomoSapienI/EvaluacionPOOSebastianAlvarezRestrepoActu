import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombreEstudiante = leer.nextLine();
        System.out.print("Dirección: ");
        String direccionEstudiante =leer.nextLine();
        System.out.print("Teléfono: ");
        String telefonoEstudiante = leer.nextLine();
        System.out.print("Correo electrónico: ");
        String emailEstudiante = leer.nextLine();
        System.out.print("Estado (1, 2, 3 o 4): ");
        int estadoEstudiante = leer.nextInt();
        System.out.println("El promedio del estudiante");
        double promedioEstudiante = leer.nextDouble();

        System.out.println("\nIngrese los datos del empleado:");
        leer.nextLine(); // 
        System.out.print("Nombre: ");
        String nombreEmpleado = leer.nextLine();
        System.out.print("Dirección: ");
        String direccionEmpleado = leer.nextLine();
        System.out.print("Teléfono: ");
        String telefonoEmpleado = leer.nextLine();
        System.out.print("Correo electrónico: ");
        String emailEmpleado = leer.nextLine();
        System.out.print("Departamento (Contabilidad, Recursos Humanos o Compras): ");
        String departamentoEmpleado = leer.nextLine();
        System.out.print("Salario: ");
        double salarioEmpleado = leer.nextDouble();
        System.out.print("Fecha de contratación: ");
        String fechaContratacionEmpleado = leer.next();

        Estudiante estudiante = new Estudiante(nombreEstudiante, direccionEstudiante, telefonoEstudiante, emailEstudiante, estadoEstudiante, promedioEstudiante);
        empleado empleado = new empleado(nombreEmpleado, direccionEmpleado, telefonoEmpleado, emailEmpleado, departamentoEmpleado, salarioEmpleado, fechaContratacionEmpleado);

        System.out.println("\nDatos del estudiante:");
        System.out.println(estudiante.toString());

        System.out.println("\nDatos del empleado:");
        System.out.println(empleado.toString());

        leer.close();

	}

}
