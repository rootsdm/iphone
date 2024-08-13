public class Iphone implements MediaPlayer, Telephone, WebBrowser {
    private String modelo;
    private String numeroSerial;

    
    public Iphone(String modelo, String numeroSerial) {
        this.modelo = modelo;
        this.numeroSerial = numeroSerial;
    }


    @Override
    public void navegar() {
        System.out.println("Navegando...");
        
    }


    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
        
    }


    @Override
    public void fecharWebBrowser() {
        System.out.println("Fechando browser...");
    }


    @Override
    public void fazerChamada() {
        System.out.println("Fazendo a chamada...");
    }


    @Override
    public void receberChamada() {
        System.out.println("Recebendo a chamada...");
    }


    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando a chamada..");
    }


    @Override
    public void play() {
        System.out.println("Tocando...");
    }


    @Override
    public void pause() {
        System.out.println("Pausando...");
    }


    @Override
    public void stop() {
        System.out.println("Parando...");
    
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getNumeroSerial() {
        return numeroSerial;
    }


    public void setNumeroSerial(String numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    

    
}
