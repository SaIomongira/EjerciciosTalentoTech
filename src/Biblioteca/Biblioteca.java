package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros != null ? libros : new ArrayList<Libro>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro) {
        if (libro != null) {
            libros.add(libro);
        }
    }

    public void devolverLibro(Libro libro) {
        if (libro != null) {
            libros.remove(libro);
        }
    }

    public Libro buscarLibro(String ISBN) {
        try {
            for (Libro libro : libros) {
                if (libro != null && libro.getISBN().equals(ISBN)) {
                    return libro;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
