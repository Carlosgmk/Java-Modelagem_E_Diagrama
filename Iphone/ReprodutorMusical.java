public class ReprodutorMusical {
    private String estado = "Pausado"; // Inicialmente, o reprodutor está pausado

    public void tocar() {
        estado = "Tocando música";
        System.out.println("Reprodutor Musical: " + estado);
    }

    public void pausar() {
        estado = "Pausado";
        System.out.println("Reprodutor Musical: " + estado);
    }

    public void selecionarMusica() {
        estado = "Selecionando música";
        System.out.println("Reprodutor Musical: " + estado);
    }
}
