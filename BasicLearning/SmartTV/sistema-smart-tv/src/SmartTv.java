public class SmartTv {
    boolean ligada = false;
    int canal = 10;
    int volume = 20;

    public void ligar() {
        ligada = true;
        System.err.println("Canal: " + canal);
    }

    public void desligar() {
        ligada = false;
        System.err.println("Desligando...");
    }

    public void aumentarCanal() {
        canal = canal + 10;
        System.err.println("Canal atual: "+ canal);
    }

    public void diminuirCanal() {
        canal = canal - 10;
        System.err.println("Canal atual: "+ canal);
    }

    public void escolherCanal(int tipoCanal) {
        canal = tipoCanal;

        switch (tipoCanal) {
            case 10:
                System.err.println("Seu canal atual e GLOBO");
                break;
            case 20:
                System.err.println("Seu canal atual e SBT");
                break;
            case 30:
                System.err.println("Seu canal atual e RECORD");
                break;
            case 40:
                System.err.println("Seu canal atual e FOX");
                break;        
            default:
                break;
        }
    }

    public void aumentar() {
        volume++;
        System.err.println("Aumentando volume: " + volume);
    }

    public void diminuir() {
        volume--;
        System.err.println("Diminuindo volume: " + volume);
    }

}
