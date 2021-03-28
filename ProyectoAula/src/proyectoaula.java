/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.math.BigInteger;
import java.util.Date;
/**
 *
 * @author Harold Castillo
 */
public class proyectoaula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creación del objeto consulta
        ConsultaProcesos Consulta = new ConsultaProcesos();
        Consulta.ParteA = "Ricardo Castillo";
        Consulta.ParteB = "Harold Castillo";
        BigInteger NumRadicado = new BigInteger("12795278394027183728347");
        Consulta.NumRadicado = NumRadicado;
        System.out.println(Consulta.ParteA);
        System.out.println(Consulta.ParteB);
        System.out.println(Consulta.NumRadicado);
        //Creacion del objeto DatosDocumentos
        DatosDocumentos Documento = new DatosDocumentos();
        Documento.Nombre = "Solicitud habeas corpus";
        Documento.Cuaderno = 1;
        Date fechaCreacion = new Date(121,2,27);//Creación objeto fecha
        Date fechaIncorporacion = new Date(121,4,15);
        Documento.FechaCreacion = fechaCreacion;
        Documento.FechaIncorporacion = fechaIncorporacion;
        Documento.Formato = "PDF";
        Documento.Size = 12.04;
        Documento.NumPag = 3;
        Documento.Origen = true;
        Documento.OrdenDocumento = 1;
        Documento.PagFin = 3;
        Documento.PagInicio = 1;
        Documento.Observaciones ="No hay observaciones";
        System.out.println(Documento.FechaCreacion);
        System.out.println(Documento.FechaIncorporacion);
        //Creación del objeto Series
        Series Serie1 = new Series();
        Serie1.Codigo = 02;
        Serie1.Descripcion ="ACCIONES CONSTITUCIONALES";
        //Creación del objeto SubSeries
        SubSeries SubSerie1 = new SubSeries();
        SubSerie1.Codigo = 12;
        SubSerie1.Descripcion = "ACCIONES DE HABEAS CORPUS";
        //Creación del objeto NumCuaderno
        NumCuaderno Cuaderno = new NumCuaderno();
        Cuaderno.Cuaderno = 1;
        Cuaderno.TipoCuaderno = "Cuaderno principal";
        NumCuaderno Cuaderno2 = new NumCuaderno();
        Cuaderno2.Cuaderno = 2;
        Cuaderno2.TipoCuaderno = "Medias previas";
        //Creación del objeto AccesoUsuario
        AccesoUsuario login = new AccesoUsuario();
        login.Usuario = "Admin";
        login.Password = "123admin";
        //Creación del objeto Usuarios
        Usuarios Usuario = new Usuarios();
        Usuario.Nombre = "Harold";
        Usuario.Apellido = "Castillo";
        Usuario.Rol = "SuperAdmin";
        //Creación del objeto TipoDocumental
        TipoDocumental TipoDoc = new TipoDocumental();
        TipoDoc.Documento = "Acta de reparto";
        //Creación del objeto ParteProcesal
        ParteProcesal Proceso = new ParteProcesal();
        Proceso.ParteA = "Harold Castillo";
        Proceso.ParteB = "Ricardo Castillo";
        //Creación del objeto RegistroDespacho
        RegistroDespacho Despacho = new RegistroDespacho();
        Despacho.Ciudad = "Valledupar";
        Despacho.Codigo = 123;
        Despacho.Dept = "Cesár";
        Despacho.Nombre = "Alcaldia de Valledupar";
        Despacho.Categoria = true;
        //Creación del objeto DatosExpediente 
        DatosExpedientes Expediente = new DatosExpedientes();
        Expediente.Ciudad = "Bogotá";
        Expediente.Dept = "Cundinamarca";
        Expediente.Despacho = "Alcaldia de Bogotá";
        BigInteger NumRadicadoEx = new BigInteger("12795278394027183728347");
        Expediente.NumRadicado = NumRadicadoEx;
        Expediente.nombreA.ParteA = Proceso.ParteA; //= new ParteProcesal();
        Expediente.nombreB.ParteB = Proceso.ParteB;
        System.out.println(Expediente.nombreA.ParteA);
        
        //Sobrecargas de constructores
        ConsultaProcesos OverloadConsult = new ConsultaProcesos(Proceso.ParteA);
        ConsultaProcesos OverloadConsult2 = new ConsultaProcesos(Proceso.ParteA, Proceso.ParteB);
        
        
        
                
        
        
        
        
        
        
        
    }
    
}
