/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporte2conexion;

import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Participante {

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Participante(int id, String nombre, String username, String password, String comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.comentarios = comentarios;
    }

    public Participante() {
    }
    private int id;
    private String nombre;
    private String username;
    private String password;
    private String comentarios;
    /**
     * @param args the command line arguments
     */
   
    
}
