public class Auto extends Vehiculo{

    private int numeroPuertas;

    public Auto(String marca, String modelo, double precioBase, int año, int numeroPuertas) {
        super(marca, modelo, precioBase, año);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numeroPuertas=" + numeroPuertas +
                '}';
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Puertas: " + numeroPuertas);
    }
    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() * 0.95;
    }
}
