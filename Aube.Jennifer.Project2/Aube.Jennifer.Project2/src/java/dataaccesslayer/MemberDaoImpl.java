/**
 * MemberDAOImpl.java
 * Jennifer Aube, 040507317
 * CST8288 OOPII
 * Project 2
 * August 4, 2017
 * George Krieger
 * Description: The purpose of this class is to get all the members from the potluckrecipes database.
 */
package dataaccesslayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transferobject.Member;

/**
 * MemberDaoImpl class implements the MemberDAO interface.
 *
 * @author Jennifer
 */
public class MemberDaoImpl implements MemberDAO {
/**
 * getAllMembers method returns an arraylist of all members in the member table.
 * @return arraylist
 */
    @Override
    public ArrayList<Member> getAllMembers() {
        ArrayList<Member> listmember = new ArrayList<>();
        Connection c = null;
        Statement s = null;
        ResultSet r = null;
        String sql = "SELECT * FROM members";
        DataSource dataSource = new DataSource();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = dataSource.createConnection();
            s = c.createStatement();
            r = s.executeQuery(sql);
            Member member = null;

            while (r.next()) {
                member = new Member();
                member.setMemberID(r.getInt("MemberID"));
                member.setIsAdmin(r.getInt("IsAdmin"));
                member.setAlias(r.getString("Alias"));
                member.setFirstName(r.getString("FirstName"));
                member.setLastName(r.getString("LastName"));
                member.setEmail(r.getString("Email"));
                member.setUsername(r.getString("Username"));
                member.setPassword(r.getString("Password"));

                listmember.add(member);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MemberDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listmember;
    }

}
