public class Lavadora extends Electrodomestico{ //"extends" enlaza la clase actual (hijo) con otra clase (padre)
    double precio;
    boolean aguaCaliente;

    public Lavadora(String tipo, String marca, double potencia, double precio, boolean aguaCaliente) {
        super(tipo, marca, potencia); //"super" llama al constructor de la clase padre
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public Lavadora(String marca, double potencia) {
        super(marca, potencia);
        this.aguaCaliente=false;
    }

    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
        super(marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    @Override
    public double getConsumo(int horas) {
        if(!aguaCaliente){
            return (horas*this.potencia);
        } else {
         return (horas*(this.potencia*1.20));
        }
    }

    @Override
    public double getCosteConsumo(int horas, double costeHora){
        return (horas*costeHora);
    }
}
