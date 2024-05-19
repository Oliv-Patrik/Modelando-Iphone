public class AparelhoTelefonico {
    @SuppressWarnings("unused")
    private String numeroLigacao;

    public void ligar(String numero) {
        this.numeroLigacao = numero;
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}