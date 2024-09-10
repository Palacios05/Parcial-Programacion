class Novelas extends Libro {
    String Tipo;

    public Novelas(String Titulo, String Autor, String Propietario, Double Precio, String Tipo) {
        super(Titulo, Autor, Propietario, Precio);
        this.Tipo = Tipo;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Nombre del género/tipo del libro: " + Tipo);
    }
}