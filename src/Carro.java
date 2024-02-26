class Carro {
    public String nome;
    public int ano;
    public int marcha;
    public boolean ligado;

    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro já está ligado");
        }
    }

    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("Carro desligado");
        } else {
            System.out.println("Carro já está desligado");
        }
    }

    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", marcha=" + marcha +
                ", ligado=" + ligado +
                '}';
    }
}