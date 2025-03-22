public class Vehiculo {
    private String marca;
    private String modelo;
    private double precioBase;
    private int año;


    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, double precioBase, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.año = año;

    }
    public double calcularPrecioFinal() {
        return precioBase * 1.10; // 10% de impuesto
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                ", año=" + año+
                '}';
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio Base: " + precioBase);
        System.out.println("Precio Final: " + calcularPrecioFinal());
    }

}


