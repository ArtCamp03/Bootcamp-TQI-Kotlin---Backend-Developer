import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validaCalculodeIdade(){
        Pessoa pessoa = new Pessoa("Antonio", LocalDate.of(2021,5,13));
        Assertions.assertEquals(2, pessoa.getIdade());
    }

    @Test
    void deveRetornarseEmaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2021,5,13));
        Assertions.assertTrue(jessica.getNascimento());

        Pessoa joao = new Pessoa("Joao", LocalDate.of(2021,5,13));
        Assertions.assertFalse(joao.getIdade());
    }
}
