public class NavegadorSimples implements NavegadorWeb {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    public static void main(String[] args) {
        NavegadorSimples navegador = new NavegadorSimples();
        navegador.exibirPagina("https://www.exemplo.com");
        navegador.adicionarNovaAba("https://www.outroexemplo.com");
        navegador.atualizarPagina();
    }
}
