package Decorator;

public class NotificacaoComLog extends NotificacaoDecorator {
    public NotificacaoComLog(INotificacao notificacaoDecorada) {
        super(notificacaoDecorada);
    }
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Registrando notificação em arquivo de log: " + mensagem);
        registrarLog(mensagem);
    }
    private void registrarLog(String mensagem) {
        System.out.println("Registrando em log: " + mensagem);
        System.out.println();
    }
}
