package Credenciales;

public class SuperAdmin extends Usuario {
    static final String Admin = "Admin";
    static final String contraseñaSuperAdmin = "1234";
    static final int RolSuperAdmin = 1;
    static final int RolCoordinador = 2;
    static final String CredencialSuperAdmin = "Super";
    static final String CredencialCoordinador = "Coord";
    //private String Rol;
    public SuperAdmin() {

    }

    public static String getCredencialSuperAdmin() {
        return CredencialSuperAdmin;
    }

    public static String getCredencialCoordinador() {
        return CredencialCoordinador;
    }
    
    public static String getAdmin() {
        return Admin;
    }

    public SuperAdmin(String nombre, String contraseña, String CredencialSuperAdmin) {
        super(nombre,contraseña);
        this.setRol(CredencialSuperAdmin);
    }

    public static String getContraseñaSuperAdmin() {
        return contraseñaSuperAdmin;
    }

    public void CrearUsuario(String nombre, String contraseña, int rol) {

        if (rol == RolSuperAdmin) {
            Usuario U = new SuperAdmin(nombre, contraseña, CredencialSuperAdmin);
        }
        if (rol == RolCoordinador) {
            Usuario c = new Coordinador(nombre, contraseña, CredencialCoordinador);
        }
    }
    public String getInfo(){
        return this.getNombre()+", "+this.getContraseña()+", "+this.getRol();
    }
}
