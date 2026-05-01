public class Docente extends PersonaAcademica {
    private int horasClase;
    private double valorHora;

    public void setHorasClase(int horasClase) {
        if (horasClase >= 1 && horasClase <= 40) {
            this.horasClase = horasClase;
        }
    }
    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        }
    }
    public int getHorasClase() {
        return horasClase;
    }
    public double getValorHora() {
        return valorHora;
    }
    public double calcularPago() {
        return horasClase * valorHora;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas de clase " + horasClase);
        System.out.println("Valor por hora " + valorHora);
    }
    public void describirRol() {
        System.out.println("Rol Docente");
    }
}