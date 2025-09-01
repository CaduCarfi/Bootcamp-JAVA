public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram mensagem");
    }

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram mensagem");
    }
}
