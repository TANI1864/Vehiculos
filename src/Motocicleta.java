public class Motocicleta extends Vehiculo{

    private int cilindrada;

    public Motocicleta(String marca, String modelo, double precioBase, int año, int cilindrada) {
        super(marca, modelo, precioBase, año);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString()+
                "cilindrada=" + cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
   @Override
   public double calcularPrecioFinal(){
        return super.calcularPrecioFinal() * 0.95;

   }

}
