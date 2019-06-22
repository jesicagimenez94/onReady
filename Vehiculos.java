
public class Vehiculos implements Comparable<Vehiculos> {
    String marca;
    String modelo;
    String cilindrada;
    int puertas;
    double precio;

    public Vehiculos(String marca, String modelo, int puertas, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.precio = precio;
    }

    public Vehiculos(String marca, String modelo, String cilindrada, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
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

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    public String toString(){
        return "marca: "+marca+" modelo: "+modelo+" puertas: "+puertas+" cilindrada: "+cilindrada+" precio: "+precio;
    }

    @Override
    public int compareTo(Vehiculos v){
        return this.getPrecio()>v.getPrecio()?1:this.getPrecio()<v.getPrecio()?-1:0;


    }
    public abstract void mostrarDetalles();
}
