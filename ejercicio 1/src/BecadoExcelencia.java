public class BecadoExcelencia extends EstudianteBecado {
    private double bonoExcelencia;

    public void setBonoExcelencia(double bonoExcelencia) {
        this.bonoExcelencia = bonoExcelencia;
    }

    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal() - bonoExcelencia;
        if (pago < 0) {
            pago = 0;
        }
        return pago;
    }
}