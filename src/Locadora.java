import java.util.ArrayList;

public class Locadora {
    public ArrayList<Carro> lista = new ArrayList<>();

    public void cadastrarCarros(Carro carro) {
        this.lista.add(carro);
    }
    public void consultarCarros(){
        for ( Carro carro : this.lista){
            System.out.println( "carro: " + carro);
        }
    }
}