package logicaNegocios;

public class usuario {

    private String user;
    private String contraseña;
    private String nombre;
    private String apellidos;
    private String mail;
    private String feNacimiento;
    private String direccion;
    private int trabajoTel;
    private int celular;

    public usuario() {
        this.user = null;
        this.contraseña = null;
        this.nombre = null;
        this.apellidos = null;
        this.mail = null;
        this.feNacimiento = null;
        this.direccion = null;
        this.trabajoTel = 0;
        this.celular = 0;
    }

    public usuario(String user, String contraseña, String nombre, String apellidos, String mail, String fnacimiento, String direccion, int trabajoTel, int celular) {
        this.user = user;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mail = mail;
        this.feNacimiento = fnacimiento;
        this.direccion = direccion;
        this.trabajoTel = trabajoTel;
        this.celular = celular;
    }

    public String getUser() {
        return user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getMail() {
        return mail;
    }

    public String getFnacimiento() {
        return feNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTrabajoTel() {
        return trabajoTel;
    }

    public int getCelular() {
        return celular;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setFnacimiento(String fnacimiento) {
        this.feNacimiento = fnacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTrabajoTel(int trabajoTel) {
        this.trabajoTel = trabajoTel;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "usuario{" + "user=" + user + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellidos=" + apellidos + ", mail=" + mail + ", feNacimiento=" + feNacimiento + ", direccion=" + direccion + ", trabajoTel=" + trabajoTel + ", celular=" + celular + '}';
    }

}
