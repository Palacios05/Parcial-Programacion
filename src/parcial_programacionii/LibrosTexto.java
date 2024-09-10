class LibrosTexto extends Libro {
    String Curso;

    public LibrosTexto(String Titulo, String Autor, String Propietario, Double Precio, String Curso) {
        super(Titulo, Autor, Propietario, Precio);
        this.Curso = Curso;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Nombre del curso: " + Curso);
    }
}
