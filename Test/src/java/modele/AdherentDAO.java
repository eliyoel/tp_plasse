package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MOS
 */
public class AdherentDAO {

    public static Adherent getByNum(int num) throws SQLException {
        Adherent result = null;
        // connexion, accès a la bdd
        Connection connection = Database.getConnection();
        Statement ordre = connection.createStatement();
        String sql = "SELECT num, nom, prenom, adrRue, adrCP, adrVille, tel, mel FROM Adherent WHERE num=" + num;
        ResultSet rs = ordre.executeQuery(sql);
        if (rs.next()) {
            result = new Adherent(
                rs.getInt("num"),
                rs.getString("nom"),
                rs.getString("prenom"),
                rs.getString("adrRue"),
                rs.getString("adrCP"),
                rs.getString("adrVille"),
                rs.getString("tel"),
                rs.getString("mel")
            );
        }       
        return result;
    }
}        


   
