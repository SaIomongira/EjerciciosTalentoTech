package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionBiblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Libro> listaLibros = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca(listaLibros);

        int opcion;
        do {
            System.out.println("Menu de gestión de biblioteca:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Ver libros disponibles");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ISBN del libro: ");
                    String ISBNAgregar = scanner.nextLine().trim();
                    System.out.print("Ingrese el título del libro: ");
                    String tituloAgregar = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autorAgregar = scanner.nextLine();

                    Libro libroAgregar = new Libro(tituloAgregar, autorAgregar, ISBNAgregar);
                    biblioteca.agregarLibro(libroAgregar);
                    System.out.println("Libro agregado exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el ISBN del libro a buscar: ");
                    String ISBNBuscar = scanner.nextLine().trim();

                    Libro libroEncontrado = biblioteca.buscarLibro(ISBNBuscar);
                    if (libroEncontrado != null) {
                        System.out.println(libroEncontrado);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el ISBN del libro a devolver: ");
                    String ISBNDevolver = scanner.nextLine().trim();

                    Libro libroDevolver = biblioteca.buscarLibro(ISBNDevolver);
                    if (libroDevolver != null) {
                        biblioteca.devolverLibro(libroDevolver);
                        System.out.println("Libro devuelto exitosamente.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 4:
                    ArrayList<Libro> librosDisponibles = biblioteca.getLibros();
                    if (librosDisponibles.isEmpty()) {
                        System.out.println("No hay libros en la biblioteca.");
                    } else {
                        System.out.println("Libros disponibles:");
                        for (Libro libro : librosDisponibles) {
                            System.out.println(libro);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
