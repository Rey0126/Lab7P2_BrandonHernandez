
package lab7p2_brandonhernandez;

public class Usuario {
    private String name;
    private String user;
    private String pass;
    private double saldo;

    public Usuario() {
    }

    public Usuario(String name, String user, String pass) {
        this.name = name;
        this.user = user;
        this.pass = pass;
        this.saldo = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "name=" + name + ", user=" + user + ", pass=" + pass + ", saldo=" + saldo + '}';
    }
    
    
}
