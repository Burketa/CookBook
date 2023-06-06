package net.luanwilliam.cookbook;

import static org.junit.Assert.assertEquals;

import net.luanwilliam.cookbook.model.Receita;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void receitaIsCorrect() {
        Receita receita = new Receita(
                "Minha receita legal",
                "Minha descricao",
                "Meus ingredientes",
                "Meu modo de preparo",
                false,
                "Minha avaliacao", 1
        );

        assertEquals(receita.getNome(), "Minha receita legal");
    }
}