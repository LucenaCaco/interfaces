public class Drone implements Voador {
    private int bateria; // Atributo solicitado

    public Drone(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public void voar() {
        System.out.println("Drone subindo verticalmente. Bateria em " + bateria + "%");
    }
    public void tirarFoto() {
        System.out.println("Foto aérea batida e salva no cartão SD!");
    }
}