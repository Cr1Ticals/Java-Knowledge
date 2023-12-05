public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();

        smartTv.aumentar();
        smartTv.aumentar();
        smartTv.aumentar();
        smartTv.diminuir();

        smartTv.escolherCanal(20);
        
        smartTv.aumentarCanal(); 
        smartTv.aumentarCanal();
        
        smartTv.diminuirCanal(); 
        
        smartTv.desligar();
        
        
    }
}
