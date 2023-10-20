public class AparelhoTelefonico {
    private boolean ligando = false;
    private boolean correioDeVozIniciado = false;
    private boolean chamadaAtendida = false;

    public void ligar() {
        ligando = true;
        System.out.println("Aparelho Telefônico: Ligando...");
    }

    public void atender() {
        chamadaAtendida = true;
        System.out.println("Aparelho Telefônico: Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        correioDeVozIniciado = true;
        System.out.println("Aparelho Telefônico: Iniciando correio de voz");
    }
}
