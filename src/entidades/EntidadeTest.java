package entidades;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class EntidadeTest {
    @Test
    void testEquals() {
        Entidade n = new Entidade();
        Entidade a = new Entidade(2);
        Entidade n1 = new Entidade();
        Entidade a2 = new Entidade(2);

        assertFalse(n.equals(a));

        assertTrue(n.equals(n1));

        assertFalse(a.equals(n));

        assertTrue(a.equals(a2));
    }

    @Test
    void testToString() {
        Entidade n = new Entidade();
        assertEquals(n.toString(),"Atividade");
        assertNotEquals(n.toString(),"User");
        assertNotEquals(n.toString(),"Plano");
    }
}
