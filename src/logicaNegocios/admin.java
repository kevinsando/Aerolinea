package logicaNegocios;

public class admin {
    private String suer;
    private String password;

    public admin(String suer, String password) {
        this.suer = suer;
        this.password = password;
    }

    public String getSuer() {
        return suer;
    }

    public String getPassword() {
        return password;
    }

    public void setSuer(String suer) {
        this.suer = suer;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
