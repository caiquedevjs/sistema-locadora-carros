public class App {
    public static void main(String[] args) {
        Carro c4 = new Carro();
        c4.nome = "C4";
        c4.ano = 2022;
        c4.ligar();

        Locadora localiza = new Locadora();
        localiza.cadastrarCarros(c4);
        c4.desligar();
        c4.ligar();
        c4.trocarMarcha();
        c4.acelerar(50);
    
    }
}