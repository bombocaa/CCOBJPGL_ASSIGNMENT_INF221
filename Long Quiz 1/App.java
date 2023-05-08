import Locations.*;
import Tourists.*;


public class App {
    public static void main(String[] args) throws Exception {

        Locations Batanes = new Batanes();
        Locations Boracay = new Boracay();
        Locations Cebu = new Cebu();
        Locations Palawan = new Palawan();
        Locations Siargao = new Siargao();
        Locations Samar = new Samar();

        Tourist Me = new Me();

        Boracay.accept(Me);
        Batanes.accept(Me);
        Cebu.accept(Me);
        Palawan.accept(Me);
        Siargao.accept(Me);
        Samar.accept(Me);



    }
}