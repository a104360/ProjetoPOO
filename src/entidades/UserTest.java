package entidades;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void testCalculaCalorias() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);

        assertEquals(a.calculaCalorias(),2500);
    }

    @Test
    void testEquals() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        User b = new User();
        User c = new User(20,"A","Avenida 3","69@vesgo.pt",'a',100);
        assertTrue(a.equals(c));
        assertFalse(a.equals(b));
    }

    @Test
    void testGetCaloriasDiarias() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        assertEquals(a.getCaloriasDiarias(),2500);
    }

    @Test
    void testGetEmail() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        assertEquals(a.getEmail(), "123@vesgo.pt");
    }

    @Test
    void testGetId() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);

        assertEquals(a.getId(),20);
    }

    @Test
    void testGetMediaCardio() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);

        assertEquals(a.getMediaCardio(),100);
    }

    @Test
    void testGetMorada() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        assertEquals(a.getMorada(), "Avenida 2");
    }   

    @Test
    void testGetNome() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        assertEquals(a.getNome(), "java");
    }   

    @Test   
    void testGetTipo() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        assertEquals(a.getTipo(), 'p');
    }   

    @Test
    void testHashCode() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        User b = new User();
        assertNotEquals(a.hashCode(),b.hashCode());
    }   

    @Test
    void testSetCaloriasDiarias() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        a.setCaloriasDiarias(2000);
        assertEquals(a.getCaloriasDiarias(),2000);
        assertNotEquals(a.getCaloriasDiarias(),a.calculaCalorias());
    }   

    @Test
    void testSetEmail() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        a.setEmail("abc@d.com");
        assertEquals(a.getEmail(),"abc@d.com");
        assertNotEquals(a.getEmail(),"123@vesgo.pt");
    }

    @Test
    void testSetId() { 
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        a.setId(2000);
        assertEquals(a.getId(),2000);
        assertNotEquals(a.getId(),20);
    }

    @Test
    void testSetMediaCardio() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        a.setMediaCardio(2000);
        assertEquals(a.getMediaCardio(),2000);
        assertNotEquals(a.getMediaCardio(),100);
    }

    @Test
    void testSetMorada() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        a.setMorada("Rego");
        assertEquals(a.getMorada(),"Rego");
        assertNotEquals(a.getMorada(),"Avenida 2");
    }

    @Test
    void testSetNome() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        a.setNome("qjm");
        assertEquals(a.getNome(),"qjm");
        assertNotEquals(a.getNome(),"java");
    }

    @Test
    void testSetTipo() {
        User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
        a.setTipo('a');
        assertEquals(a.getTipo(),'a');
        assertNotEquals(a.getTipo(),'p');
    }

    @Test
    void testToString() {
       User a = new User(20,"java","Avenida 2","123@vesgo.pt",'p',100);
       assertEquals(a.toString(),"User [id=20, nome=java, morada=Avenida 2, email=123@vesgo.pt, tipo=p, mediaCardio=100, caloriasDiarias=2500]");
    }
}
