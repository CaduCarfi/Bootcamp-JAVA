public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido ="msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMensager();
        } else if(appEscolhido.equals("fbm")){
            smi = new FacebookMensager();
        } else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
