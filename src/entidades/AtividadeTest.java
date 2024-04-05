package entidades;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AtividadeTest {
    @Test
    void testGetCalorias() {
        Atividade a = new Atividade();
        
        assertEquals(a.getCalorias(),0);

        a.setCalorias(1000);

        assertEquals(a.getCalorias(),1000);
        assertNotEquals(a.getCalorias(),0);
    }

    @Test
    void testGetDuracao() {
        Atividade a = new Atividade();
        assertEquals(a.getDuracao(),0);
    }

    @Test
    void testGetmediaCardio() {
        Atividade a = new Atividade();
        assertEquals(a.getmediaCardio(),0);
    }

    @Test
    void testIsHard() {
        Atividade a = new Atividade();
        assertFalse(a.isHard());
    }

    @Test
    void testIsProfissional() {
        Atividade a = new Atividade();
        assertFalse(a.isProfissional());
    }

    @Test
    void testSetCalorias() {
        Atividade a = new Atividade(10,true,1000,false,500);
        assertEquals(a.getCalorias(),1000);
        a.setCalorias(10);
        assertEquals(a.getCalorias(),10);
    }

    @Test
    void testSetDuracao() {
        Atividade a = new Atividade(10,true,1000,false,500);

        assertEquals(a.getDuracao(),10);
        a.setDuracao(100);
        assertEquals(a.getDuracao(),100);
    }

    @Test
    void testSetHard() {
        Atividade a = new Atividade(10,true,1000,false,500);
        assertTrue(a.isHard());
        a.setHard(false);
        assertFalse(a.isHard());
    }

    @Test
    void testSetProfissional() {

    }

    @Test
    void testSetmediaCardio() {

    }

    @Test
    void testToString() {

    }
}
