import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10,11,12,16,84,52,20};
        int[] segundoLancamento = {22,21,16,84,52,20,90,34,51};

        //Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);

        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }
}
