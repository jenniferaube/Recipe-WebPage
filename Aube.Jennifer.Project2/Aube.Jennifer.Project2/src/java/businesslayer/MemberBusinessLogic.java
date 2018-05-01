
/** 
 * RecipeBusinessLogic.java
 * Jennifer Aube, 040507317
 * CST8288 OOPII
 * Project 2
 * August 4, 2017
 * George Krieger
 * Description: The purpose of this class is get all members from the potluckrecipes database using the 
 * MemberDaoImpl class.
 */
package businesslayer;

import dataaccesslayer.MemberDaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jennifer
 */
public class MemberBusinessLogic {
    
    private MemberDaoImpl memberdao = null;
    
    /**
     * a non-argument constructor that will instantiate the recipeDAO.
     */
    public MemberBusinessLogic(){
        memberdao = new MemberDaoImpl();
    }
    /**
     * getAllRecipes method will return a list of all the recipes stored in the database.
     * @return recipes
     */
    public ArrayList getAllMembers() throws SQLException{
        return memberdao.getAllMembers();
    }
   
}
