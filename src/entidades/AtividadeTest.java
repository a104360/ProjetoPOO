package entidades;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

public class AtividadeTest {
    @Test
    void testGetCaloriasConsumidas() {
        Atividade a = new Atividade(10,false,1000,false,500,13,LocalDate.of(2020,2,2));
        assertEquals(a.getCaloriasConsumidas(),1000);
    }

    @Test
    void testGetDuracao() {
        Atividade a = new Atividade(10,false,1000,false,500,13,LocalDate.of(2020,2,2));
        assertEquals(a.getDuracao(),10);
    }

    @Test
    void testGetmediaCardio() {
        Atividade a = new Atividade(10,false,1000,false,500,13,LocalDate.of(2020,2,2));
        assertEquals(a.getmediaCardio(),500);
    }

    @Test
    void testIsHard() {
        Atividade a = new Atividade(10,false,1000,false,500,13,LocalDate.of(2020,2,2));
        assertFalse(a.isHard());
    }

    @Test
    void testIsProfissional() {
        Atividade a = new Atividade(10,false,1000,false,500,13,LocalDate.of(2020,2,2));
        assertFalse(a.isProfissional());
    }

    @Test
    void testSetCaloriasConsumidas() {
        Atividade a = new Atividade(10,false,1000,false,500,13,LocalDate.of(2020,2,2));
        assertEquals(a.getCaloriasConsumidas(),1000);
        a.setCaloriasConsumidas(10);
        assertEquals(a.getCaloriasConsumidas(),10);
    }

    @Test
    void testSetDuracao() {
        Atividade a = new Atividade(10,false,1000,false,500,13,LocalDate.of(2020,2,2));

        assertEquals(a.getDuracao(),10);
        a.setDuracao(100);
        assertEquals(a.getDuracao(),100);
    }

    @Test
    void testSetHard() {
        Atividade a = new Atividade(10,true,1000,false,500,13,LocalDate.of(2020,2,2));
        assertTrue(a.isHard());
        a.setHard(false);
        assertFalse(a.isHard());
    }

    @Test
    void testSetProfissional() {
        Atividade a = new Atividade(10,false,1000,false,500,13,LocalDate.of(2020,2,2));
        assertFalse(a.isProfissional());
        a.setProfissional(true);
        assertTrue(a.isProfissional());
    }

    @Test
    void testSetmediaCardio() {
        Atividade a = new Atividade(10,false,1000,false,500,13,LocalDate.of(2020,2,2));
        assertNotEquals(a.getCaloriasConsumidas(),23);
        a.setCaloriasConsumidas(23);
        assertEquals(a.getCaloriasConsumidas(), 23);
    }

    @Test
    void testToString() {
        Atividade a = new Atividade(10,false,1000,false,500,13,LocalDate.of(2020,2,2));
        assertEquals(a.toString(),"Atividade [duracao=10, hard=" + a.isHard() + ", caloriasConsumidas=1000, profissional="+ a.isProfissional() +", mediaCardio=500, userId=13, data=2024-04-08]");
    }
}
