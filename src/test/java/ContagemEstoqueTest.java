

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContagemEstoqueTest {

    @Test
    void contadorDeEstoquePorTipo() {
        Tipo tipo = new Tipo(
                new Veiculo("Focus", true),
                new Veiculo("Corolla", true),
                new Veiculo("Civic", false)


        );
        assertEquals(2, ContagemEstoque.contadorDeEstoquePorTipo(tipo));
    }

    @Test
    void contadorDeEstoqueTotal() {
        Tipo tipo = new Tipo(
                new Veiculo("Focus", true),
                new Veiculo("Corolla", true),
                new Veiculo("Civic", false)
        );
        assertEquals(3, ContagemEstoque.contadorDeEstoqueTotal(tipo));
    }

}