//De las clases abstractas no se pueden crear objetos
public abstract class Electrodomestico {
    protected String tipo;
    protected String marca;
    protected double potencia;

    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Electrodomestico(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    public abstract double getConsumo(int horas);
    public abstract double getCosteConsumo(int horas, double costeHora);
}
