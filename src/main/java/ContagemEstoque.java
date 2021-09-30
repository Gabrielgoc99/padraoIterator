

import java.util.Iterator;

public class ContagemEstoque {

    public static Integer contadorDeEstoquePorTipo(Tipo tipo) {
        int quantidade = 0;
        for (Veiculo veiculo: tipo) {
            if (veiculo.isEstoque()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contadorDeEstoqueTotal(Tipo tipo) {
        int quantidade = 0;
        for (Iterator v = tipo.iterator(); v.hasNext(); ) {
            quantidade++;
            v.next();
        }
        return quantidade;
    }

}