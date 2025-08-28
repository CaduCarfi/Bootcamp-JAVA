public class Telegram extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo Telegram");
    }
}
