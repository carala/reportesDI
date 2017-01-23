/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporteconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author dam2
 */
public class ReporteConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/informesdi", "root", "campus");
        /**
 * @param args argumentos recibidos por la linea de comandos
 */


 JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("sesion1.jasper");
 JasperPrint jasperPrint = JasperFillManager.fillReport(reporte,null, conexion);
 //Generamos el informe en PDF.
 Exporter exporter;

 exporter = new JRPdfExporter();

 exporter.setExporterInput(new
SimpleExporterInput(jasperPrint));
 exporter.setExporterOutput(new
SimpleOutputStreamExporterOutput(new
java.io.File("reporteSesion1PDF.pdf")));
    }
}
