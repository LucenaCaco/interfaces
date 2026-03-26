public class Aviao implements Voador {
    private String modelo;

    public Aviao(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void voar() {
        System.out.println("O avião " + modelo + " está decolando da pista...");
    }
    public void ligarTurbinas() {
        System.out.println("Turbinas do " + modelo + " aquecendo! Som de jato no fundo.");
    }
    public String getModelo() {
        return modelo;
    }
}