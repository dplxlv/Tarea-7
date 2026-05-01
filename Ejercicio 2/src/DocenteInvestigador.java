public class DocenteInvestigador extends Docente {
    private int publicaciones;

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        }
    }
    public int getPublicaciones() {
        return publicaciones;
    }
    public double calcularPago() {
        double pagoBase = super.calcularPago();
        double bono = publicaciones * 20;
        return pagoBase + bono;
    }
    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Publicaciones " + publicaciones);
    }
    public void describirRol() {
        System.out.println("Rol Docente investigador con produccion academica");
    }
}