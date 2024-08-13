public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone(null, null);

        iphone.atualizarPagina();
        iphone.encerrarChamada();
        iphone.fazerChamada();
        iphone.fecharWebBrowser();
        iphone.navegar();
        iphone.pause();
        iphone.play();
        iphone.receberChamada();
        iphone.stop();

        
    }
}
