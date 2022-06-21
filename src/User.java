public class User {
    private String login;
    private String password;
    private String confirmPassword;
public User(String login, String password, String confirmPassword){
    this.login=login;
    this.password = password;
    this.confirmPassword = confirmPassword;
}

    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static void dataUser(String login, String password, String confirmPassword){

      if (login.matches("[a-z],\\d,_+")&&login.length()<=20){

      }
    }


}
