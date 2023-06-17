package Facade.api;

public class AvionAPI {
    public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino){
        System.out.println("----------");
        System.out.println("Vuelos encontrados para " + destino + "desde " + origen );
        System.out.println("Fecha ida: " + fechaIda + " Fecha vuelta " + fechaVuelta);
        System.out.println("----------");
    }
}
