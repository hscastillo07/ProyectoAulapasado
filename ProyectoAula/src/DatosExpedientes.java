import java.math.BigInteger;
public class DatosExpedientes extends RegistroDespacho {

    public String Despacho;

    public BigInteger NumRadicado;

    public boolean ExpedienteFisico;
    
    public ParteProcesal nombreA;
    public ParteProcesal nombreB;

    public DatosExpedientes() {
        nombreA = new ParteProcesal();
        nombreB = new ParteProcesal();
    }

    public String getDespacho() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getNumRadicado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getExpedienteFisico() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setDespacho() {
    }

    public void setNumRadicado() {
    }

    public void setExpedienteFisico() {
    }
}
