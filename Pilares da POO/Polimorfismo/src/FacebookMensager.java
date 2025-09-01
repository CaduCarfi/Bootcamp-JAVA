public class FacebookMensager extends ServicoMensagemInstantanea {

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo facebook mensagem");
    }

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo facebook mensagem");
    }

}
