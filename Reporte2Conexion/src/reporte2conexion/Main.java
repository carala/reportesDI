/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporte2conexion;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;

/**
 *
 * @author dam2
 */
public class Main {
     public static void main(String[] args) {
       ParticipantesDataSource datasource = new ParticipantesDataSource();
        for (int i = 1; i<= 10; i++){
            Participante p = new Participante(i, "Particpante " + i, "Usuario " + i, "Pass " + i, "Comentariospara " + i);
    datasource.addParticipante(p);
 }
try{
 JasperReport reporte = (JasperReport)JRLoader.loadObjectFromFile("report2.jasper");
 JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, datasource);
 Exporter exporter = new JRPdfExporter();

 exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
 exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(new java.io.File("reporteSesion2PDF.pdf")));
 SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
 exporter.setConfiguration(configuration);

 exporter.exportReport();
 } catch (JRException ex) {
     System.out.println("ERROR");
//Logger.getLogger(reporte2.class.getName()).log(Level.SEVERE, null, ex);
 }
    }
}
