package Credenciales;

public abstract class Usuario {

    private String nombre;

    private String Contraseña;

    private String rol;

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña, String rol) {
        this.nombre = nombre;
      
        this.Contraseña = contraseña;
        this.rol = rol;
    }

    public Usuario(String rol) {
        this.rol = rol;
    }

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
    
        this.Contraseña = contraseña;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        this.Contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    private boolean login(String nombre, String cotraseña) {
        return false;
    }

    public String getInfo() {
        return this.nombre+", "+this.Contraseña+", "+this.rol;
    }
}
