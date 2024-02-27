package Decorator;

public class Main {
    public static void main(String[] args) {
        INotificacao notificacao = new NotificacaoBase();

        notificacao = new NotificacaoComSom(notificacao);

        notificacao = new NotificacaoComImagem(notificacao);

        notificacao = new NotificacaoComPrioridade(notificacao);

        notificacao = new NotificacaoComLog(notificacao);

        // Enviando a notificação decorada
        notificacao.enviar("Nova mensagem!");
    }
}
