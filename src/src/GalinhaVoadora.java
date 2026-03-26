public class GalinhaVoadora implements Voador {

    // Atributo para dar aquela diferenciada (exigido no exercício anterior)
    private String nome;

    public GalinhaVoadora(String nome) {
        this.nome = nome;
    }

    // Construtor padrão caso queira instanciar sem nome
    public GalinhaVoadora() {
        this.nome = "Galinha Comum";
    }

    @Override
    public void voar() {
        System.out.println(nome + " bateu as asas freneticamente e subiu 1 metro do chão!");
    }

    @Override
    public void planar() {
        System.out.println(nome + " está tentando planar... na verdade, está só caindo com estilo.");
    }

    @Override
    public void pousar() {
        System.out.println(nome + " pousou de um jeito meio desajeitado no galinheiro.");
    }
}