public class Main {
    public static void main(String[] args) {
        CentroMensajeria centro = new CentroMensajeria();
        SistemaSeguridad sistema = new SistemaSeguridad(centro);
        sistema.enviarAlerta("Alerta de seguridad: Intruso detectado", 1);
        sistema.enviarAlerta("la puerta principal fue abierta" , 2);
    }
    }