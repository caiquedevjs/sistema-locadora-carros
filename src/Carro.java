class Carro {
    public String nome;
    public int ano;
    private int marcha;
    public boolean ligado;
    public int velocidade;

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

   public void acelerar(int velocidade) {
    if (this.ligado) {
        if (this.marcha > 1) {
            if (velocidade > 50) {
                this.velocidade = velocidade;
                System.out.println("O carro está andando a " + velocidade + " Km/h");
            } else {
                System.out.println("A velocidade mínima para acelerar é de 50 Km/h");
            }
        } else {
            System.out.println("O carro está em marcha lenta. Troque de marcha para acelerar.");
        }
    } else {
        System.out.println("O carro está desligado");
    }
}


    public void trocarMarcha() {
        if (this.ligado) {
            this.marcha += 1;
        } else {
            System.out.println("O carro está desligado");
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
