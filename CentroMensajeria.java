public class CentroMensajeria {
    public void recibirMensaje(Mensaje mensaje) {
        System.out.println("mensaje recibido:");
        System.out.println("remitente: " + mensaje.getRemitente());
        System.out.println("prioridad:" + mensaje.getPrioridad());
    }

}
