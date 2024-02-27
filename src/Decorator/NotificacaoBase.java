package Decorator;

public class NotificacaoBase implements INotificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação: " + mensagem);
        System.out.println();
    }
}