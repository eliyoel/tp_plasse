package modele;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import modele.Adherent;
import modele.AdherentDAO;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author MOS
 */
public class AdherentTest {

    public AdherentTest() {
    }

    @Test
    public void testgetByNum() throws SQLException {
        Adherent expected = new Adherent(8, "Derzou", "Fred", "230 avenue de la liberté", 
                "93100", "Montreuil-sous-bois", "01...", "ouzala@aol.com");
        Adherent result = AdherentDAO.getByNum(8);
        assertEquals(expected.getPrenom(), result.getPrenom());
    }
    /*@Test
     public void testSomeMethod() {
     fail("The test case is a prototype.");
     }*/

    /**
     * @Test public void testAdherent() throws SQLException { Connection conn =
     * Database.getConnection(); String sql = "SELECT * from adherent where
     * num=1"; Statement ordre = conn.createStatement(); ResultSet rs =
     * ordre.executeQuery(sql); assertTrue(rs.next()); }
     */
    /*@Test
    public void testDelete() throws SQLException {
        assertNotNull(Auteur.getByNum(34));
        Auteur.delete(34);
        assertNull(Auteur.getByNum(34));
    }

    @Before // La procedure initialisation sera exécutée avant chaque test
    public void initialiser() throws Exception {
        Connection connexion = Database.getConnection();
        CallableStatement cs = connexion.prepareCall("CALL biblio_reset()");
        cs.execute();
        connexion.close();
    }

    @Test
    public void testUpdate() throws SQLException {
        Auteur instance = Auteur.getByNum(34);
        instance.setNom("Toto");
        instance.setPrenom("Titi");
        instance.setNationalite("Gros minet");
        instance.update();
        Auteur result = Auteur.getByNum(34);
        assertEquals(instance, result);
    }

    @Before // La procedure initialisation sera exécutée avant chaque test
    public void setUp() throws SQLException {
        Connection conn = Database.getConnection();
        String sql = "CALL biblio_reset();";
        CallableStatement cs = conn.prepareCall(sql);
        cs.executeUpdate();
    }
*/
}
