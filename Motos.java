public class Motos  extends Vehículos{
	public Autos(String ma, String mo, String  c, double pr) {
		super(ma, mo, c , pr );
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Marca : "+this.getMarca()+" /// "+"Modelo : "+this.getModelo()+" /// " +"Cilindrada : "+this.getCilindrada()+" /// " +"Precio : "+this.getPrecio());

	}
}
