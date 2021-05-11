package Credenciales;

public class Coordinador extends Usuario {
    
    private String Coord = "Coord";
    
    public Coordinador() {
    }

    public Coordinador(String Nombre,  String contraseña, String rol) {
        super(Nombre, contraseña, rol);
    }

    public Coordinador( String rol) {
        super( rol);
    }

    
    public void setCoord(String Coord) {
        this.Coord = Coord;
    }

}
