import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2 {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String now = dateFormat.format(new Date());
        
        for (int i = 0; i < accounts.length; i++) {
            String email = "Email " + (i + 1);
            String username = "Username " + (i + 1);
            String fullName = "Full name " + (i + 1);
            String createDate = now;
           
            accounts[i] = new Account(email, username, fullName, createDate);
        }
        
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}

class Account {
    private String email;
    private String username;
    private String fullName;
    private String createDate;

    public Account(String email, String username, String fullName, String createDate) {
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account: " +
                 email + "-"+
                 username + "-" +
                 fullName + "-" +
                 createDate + '\'' 
               ;
    }
}