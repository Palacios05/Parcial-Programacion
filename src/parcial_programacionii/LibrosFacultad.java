class LibrosFacultad extends LibrosTexto {
    String Facultad;

    public LibrosFacultad(String Titulo, String Autor, String Propietario, Double Precio, String Curso, String Facultad) {
        super(Titulo, Autor, Propietario, Precio, Curso);
        this.Facultad = Facultad;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Nombre de la facultad: " + Facultad);
    }
}
