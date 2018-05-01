/**
 * Member.java
 * Jennifer Aube, 040507317
 * CST8288 OOPII
 * Project 2
 * August 4, 2017
 * George Krieger
 * Description: The purpose of this class to have access the member table.
 */
package transferobject;

/**
 *
 * @author Jennifer
 */
public class Member {
    private Integer memberID;
    private Integer IsAdmin;
    private String alias;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    /**
     * no argument constructor.
     */
    public Member() {
       
    }
   /**
    * getMemberID method will return the memberid.
    * @return integer
    */
    public Integer getMemberID() {
        return memberID;
    }
/**
 * setMemberID method will set the memberid.
 * @param memberID integer
 */
    public void setMemberID(Integer memberID) {
        this.memberID = memberID;
    }
/**
 * getIsAdmin method will return the isAdmin;
 * @return integer
 */
    public Integer getIsAdmin() {
        return IsAdmin;
    }
/**
 * setIsAdmin method will set the isAdmin.
 * @param isAdmin integer
 */
    public void setIsAdmin(Integer isAdmin) {
        this.IsAdmin = isAdmin;
    }
/**
 * getAlias method will return the alias.
 * @return string
 */
    public String getAlias() {
        return alias;
    }
/**
 * setAlias method will set the alias.
 * @param alias string
 */
    public void setAlias(String alias) {
        this.alias = alias;
    }
/**
 * getFirstName method will return the firstname.
 * @return string
 */
    public String getFirstName() {
        return firstName;
    }
/**
 * setFirstName method will set the firstname.
 * @param firstName string
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
/**
 * getLastName method will return the lastname.
 * @return string
 */
    public String getLastName() {
        return lastName;
    }
/**
 * setLastName method will set the lastname.
 * @param lastName string
 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
/**
 * getEmail method will return the email.
 * @return string
 */
    public String getEmail() {
        return email;
    }
/**
 * setEmail method will set the email.
 * @param email string
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * getUsername method will return the username.
 * @return string
 */
    public String getUsername() {
        return username;
    }
/**
 * setUsername method will set the username.
 * @param username string
 */
    public void setUsername(String username) {
        this.username = username;
    }
/**
 * getPassword method will return the password.
 * @return string
 */
    public String getPassword() {
        return password;
    }
/**
 * setPassword method will set the password.
 * @param password string
 */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
            
}
