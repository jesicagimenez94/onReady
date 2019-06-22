import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Vehiculos v1 = new Vehiculos("peugeot", "206", 4, 200000.00);
        Vehiculos v2 = new Vehiculos("honda", "titan", "125c", 60000.00);
        Vehiculos v3 = new Vehiculos("peugeot", "208", 5, 250000.00);
        Vehiculos v4 = new Vehiculos("yamaha", "ybr", "160c", 80500.00);

        List<Vehiculos> vehiculo = new ArrayList<>();
        vehiculo.add(v1);
        vehiculo.add(v2);
        vehiculo.add(v3);
        vehiculo.add(v4);

        Collections.sort(vehiculo);


        for (Vehiculos elemento : vehiculo) {
             elemento.mostrarDetalles();
        }
        
        System.out.println("======================================================================"); 

        if (v1.compareTo(v2) < 0 && v1.compareTo(v3) < 0 && v1.compareTo(v4) < 0) {
            System.out.println("Vehiculo mas barato: " + v1.getMarca()+" "+v1.getModelo());
        }else if(v2.compareTo(v1) < 0 && v2.compareTo(v3) < 0 && v2.compareTo(v1) < 0){
            System.out.println("Vehiculo mas barato: " + v2.getMarca()+" "+v2.getModelo());
        }else if(v3.compareTo(v1) < 0 && v3.compareTo(v2) < 0 && v3.compareTo(v4) < 0){
            System.out.println("Vehiculo mas barato: " + v3.getMarca()+" "+v3.getModelo());
        }else if(v4.compareTo(v1) < 0 && v4.compareTo(v2) < 0 && v4.compareTo(v3) < 0){
            System.out.println("Vehiculo mas barato: " + v4.getMarca()+" "+v4.getModelo());
        }

        if (v1.compareTo(v2) > 0 && v1.compareTo(v3) > 0 && v1.compareTo(v4) >0) {
            System.out.println("Vehiculo mas caro: " + v1.getMarca()+" "+v1.getModelo());
        }else if(v2.compareTo(v1) > 0 && v2.compareTo(v3) > 0 && v2.compareTo(v1) > 0){
            System.out.println("Vehiculo mas caro: " + v2.getMarca()+" "+v2.getModelo());
        }else if(v3.compareTo(v1) > 0 && v3.compareTo(v2) > 0 && v3.compareTo(v4) > 0){
            System.out.println("Vehiculo mas caro: " + v3.getMarca()+" "+v3.getModelo());
        }else if(v4.compareTo(v1) > 0 && v4.compareTo(v2) > 0 && v4.compareTo(v3) > 0){
            System.out.println("Vehiculo mas caro: " + v4.getMarca()+" "+v4.getModelo());
        }
    }
}
