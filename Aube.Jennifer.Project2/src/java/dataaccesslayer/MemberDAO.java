/**
 * MemberDAO.java
 * Jennifer Aube, 040507317
 * CST8288-OPPII
 * Project 2
 * August 4, 2017
 * George Krieger
 * Description: The purpose of this interface is to ensure that these methods are implemented.
 *
 */
package dataaccesslayer;

import java.util.ArrayList;
import transferobject.Member;

/**
 * MemberDAO is an interface class.
 * @author Jennifer
 */
public interface MemberDAO {
    
  
    ArrayList<Member> getAllMembers();
   
    
    
    
}
