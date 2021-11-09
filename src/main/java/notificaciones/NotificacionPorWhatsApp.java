package notificaciones;

public class NotificacionPorWhatsApp implements EstrategiaDeNotificacion {

	public void enviar(Notificacion notificacion) {
			System.out.println("Enviando WhatsApp a " +
					notificacion.getNroCompletoDestinatario() +
					"'" + notificacion.getMensaje() + "'"
			);
	}
}
