package estabelecimento;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Deskjet;
import Equipamentos.impressora.Impressora;
import Equipamentos.impressora.Laserjet;
import Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new  EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

       impressora.imprimir();
       digitalizadora.digitalizar();
       copiadora.copiar();
    }
}
