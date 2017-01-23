/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporte2conexion;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRField;
/**
 *
 * @author dam2
 */
public class ParticipantesDataSource implements JRDataSource {
    
private List<Participante> listaParticipantes = new ArrayList<>();
private int indiceParticipanteActual = -1;

    @Override
    public boolean next() throws JRException {
return ++indiceParticipanteActual<listaParticipantes.size();    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {
       Object valor = null;
       if("id".equals(jrField.getName())){
           valor=listaParticipantes.get(indiceParticipanteActual).getId();
       }
       else if("nombre".equals(jrField.getName())) {
valor = listaParticipantes.get(indiceParticipanteActual).getNombre();
}
else if("username".equals(jrField.getName())) {
valor =
listaParticipantes.get(indiceParticipanteActual).getUsername();}
else if("password".equals(jrField.getName())) {
valor =
listaParticipantes.get(indiceParticipanteActual).getPassword();
}
else if("comentarios".equals(jrField.getName())) {
valor =
listaParticipantes.get(indiceParticipanteActual).getComentarios();
}
return valor;
    }
    public void addParticipante(Participante participante){
this.listaParticipantes.add(participante);
}
   
   
}