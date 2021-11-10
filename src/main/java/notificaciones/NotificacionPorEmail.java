package notificaciones;

public class NotificacionPorEmail implements EstrategiaDeNotificacion {

    public void enviar(Notificacion notificacion) {
        System.out.println("Enviando Email a " +
                notificacion.getNroCompletoDestinatario() +
                " '" + notificacion.getMensaje() + "'"
        );
    }
}
