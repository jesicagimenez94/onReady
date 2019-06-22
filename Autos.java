
public class Autos extends Vehículos{
	public Autos(String ma, String mo, int pu, double pr) {
		super(n, t, pu, pr);
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Marca : "+this.getMarca()+" /// "+"Modelo : "+this.getModelo()+" /// " +"Puertas : "+this.getPuertas()+" /// " +"Precio : "+this.getPrecio());

	}
}
