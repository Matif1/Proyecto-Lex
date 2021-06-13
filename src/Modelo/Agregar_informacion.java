/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author XPS 9560
 */
public class Agregar_informacion {
    int fecha_dia;
    int fecha_mes;
    int fecha_anno;
    String rut_cliente;
    String diligencias;
    String documentacion_asociado_causas;
    String documentacion_asociada_contratos;
    String causas_clientes;
    int ingresos_anuales;
    int ingresos_mensuales;
    String documentacion_factibilidad_caso;
    String instrucciones_causas;
    int presupuestos;
    int pagos_precenciales;
    int pagos_por_trasferencia;

    public Agregar_informacion(
            int fecha_dia, 
            int fecha_mes, 
            int fecha_anno, 
            String rut_cliente, 
            String diligencias, 
            String documentacion_asociado_causas, 
            String documentacion_asociada_contratos, 
            String causas_clientes, 
            int ingresos_anuales, 
            int ingresos_mensuales, 
            String documentacion_factibilidad_caso, 
            String instrucciones_causas, 
            int presupuestos, 
            int pagos_precenciales, 
            int pagos_por_trasferencia) {
        this.fecha_dia = fecha_dia;
        this.fecha_mes = fecha_mes;
        this.fecha_anno = fecha_anno;
        this.rut_cliente = rut_cliente;
        this.diligencias = diligencias;
        this.documentacion_asociado_causas = documentacion_asociado_causas;
        this.documentacion_asociada_contratos = documentacion_asociada_contratos;
        this.causas_clientes = causas_clientes;
        this.ingresos_anuales = ingresos_anuales;
        this.ingresos_mensuales = ingresos_mensuales;
        this.documentacion_factibilidad_caso = documentacion_factibilidad_caso;
        this.instrucciones_causas = instrucciones_causas;
        this.presupuestos = presupuestos;
        this.pagos_precenciales = pagos_precenciales;
        this.pagos_por_trasferencia = pagos_por_trasferencia;
    }

    public int getFecha_dia() {
        return fecha_dia;
    }

    public int getFecha_mes() {
        return fecha_mes;
    }

    public int getFecha_anno() {
        return fecha_anno;
    }

    public String getRut_cliente() {
        return rut_cliente;
    }

    public String getDiligencias() {
        return diligencias;
    }

    public String getDocumentacion_asociado_causas() {
        return documentacion_asociado_causas;
    }

    public String getDocumentacion_asociada_contratos() {
        return documentacion_asociada_contratos;
    }

    public String getCausas_clientes() {
        return causas_clientes;
    }

    public int getIngresos_anuales() {
        return ingresos_anuales;
    }

    public int getIngresos_mensuales() {
        return ingresos_mensuales;
    }

    public String getDocumentacion_factibilidad_caso() {
        return documentacion_factibilidad_caso;
    }

    public String getInstrucciones_causas() {
        return instrucciones_causas;
    }

    public int getPresupuestos() {
        return presupuestos;
    }

    public int getPagos_precenciales() {
        return pagos_precenciales;
    }

    public int getPagos_por_trasferencia() {
        return pagos_por_trasferencia;
    }

    public void setFecha_dia(int fecha_dia) {
        this.fecha_dia = fecha_dia;
    }

    public void setFecha_mes(int fecha_mes) {
        this.fecha_mes = fecha_mes;
    }

    public void setFecha_anno(int fecha_anno) {
        this.fecha_anno = fecha_anno;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public void setDiligencias(String diligencias) {
        this.diligencias = diligencias;
    }

    public void setDocumentacion_asociado_causas(String documentacion_asociado_causas) {
        this.documentacion_asociado_causas = documentacion_asociado_causas;
    }

    public void setDocumentacion_asociada_contratos(String documentacion_asociada_contratos) {
        this.documentacion_asociada_contratos = documentacion_asociada_contratos;
    }

    public void setCausas_clientes(String causas_clientes) {
        this.causas_clientes = causas_clientes;
    }

    public void setIngresos_anuales(int ingresos_anuales) {
        this.ingresos_anuales = ingresos_anuales;
    }

    public void setIngresos_mensuales(int ingresos_mensuales) {
        this.ingresos_mensuales = ingresos_mensuales;
    }

    public void setDocumentacion_factibilidad_caso(String documentacion_factibilidad_caso) {
        this.documentacion_factibilidad_caso = documentacion_factibilidad_caso;
    }

    public void setInstrucciones_causas(String instrucciones_causas) {
        this.instrucciones_causas = instrucciones_causas;
    }

    public void setPresupuestos(int presupuestos) {
        this.presupuestos = presupuestos;
    }

    public void setPagos_precenciales(int pagos_precenciales) {
        this.pagos_precenciales = pagos_precenciales;
    }

    public void setPagos_por_trasferencia(int pagos_por_trasferencia) {
        this.pagos_por_trasferencia = pagos_por_trasferencia;
    }

    @Override
    public String toString() {
        return "Agregar_informacion{" + "fecha_dia=" + fecha_dia + ", fecha_mes=" + fecha_mes + ", fecha_anno=" + fecha_anno + ", rut_cliente=" + rut_cliente + ", diligencias=" + diligencias + ", documentacion_asociado_causas=" + documentacion_asociado_causas + ", documentacion_asociada_contratos=" + documentacion_asociada_contratos + ", causas_clientes=" + causas_clientes + ", ingresos_anuales=" + ingresos_anuales + ", ingresos_mensuales=" + ingresos_mensuales + ", documentacion_factibilidad_caso=" + documentacion_factibilidad_caso + ", instrucciones_causas=" + instrucciones_causas + ", presupuestos=" + presupuestos + ", pagos_precenciales=" + pagos_precenciales + ", pagos_por_trasferencia=" + pagos_por_trasferencia + '}';
    }

   
    public String consultar_causas_cliente(String rut)
    {
        if(rut.compareToIgnoreCase(rut_cliente)==0)
        {
            return causas_clientes;
        }
        return "No hay informacion asociado al rut ingresado";
    }
    public int consultar_presupestos_cliente(String rut)
    {
        if(rut.compareToIgnoreCase(rut_cliente)==0)
        {
            return presupuestos;
        }
        return 0;
    }
    public String consultar_documento_asociado_causa(String rut)
    {
        if(rut.compareToIgnoreCase(rut_cliente)==0)
        {
            return documentacion_asociado_causas;
        }
        return "No hay informacion asociado al rut ingresado";
        
    }
    public String consultar_diliegencias_cliente(String rut)
    {
        if(rut.compareToIgnoreCase(rut_cliente)==0)
        {
            return diligencias;
        }
        return "No hay informacion asociado al rut ingresado";
        
    }
    public String consultar_documentacion_asociada_contratos(String rut)
    {
        if(rut.compareToIgnoreCase(rut_cliente)==0)
        {
            return documentacion_asociada_contratos;
        }
        return "No hay informacion asociado al rut ingresado";
    }
        
    public int consultar_ingresos_anuales_por_parte_de_un_cliente(int anno)
    {
        int total=0;
        if(anno==fecha_anno)
        {
            total=total+ingresos_anuales;
        }
        return total;
    }
    public int consultar_ingresos_mensuales_por_parte_de_un_cliente(int mes)
    {
        int total=0;
        if(mes==fecha_mes)
        {
            total=total+ingresos_mensuales;
        }
        return total;
    }
    public String documento_factibilidad_caso(String rut)
    {
        if(rut.compareToIgnoreCase(rut_cliente)==0)
        {
            return documentacion_factibilidad_caso;
        }
        return "No hay informacion asociado al rut ingresado";
        
    }
    public String instruccion_causa_cliente(String rut)
    {
        if(rut.compareToIgnoreCase(rut_cliente)==0)
        {
            return instrucciones_causas;
        }
        return "No hay informacion asociado al rut ingresado";
            
    }
    public int pagos_cliente(String rut)
    {
        int total=0;
        if(rut.compareToIgnoreCase(rut_cliente)==0)
        {
            total=total+pagos_precenciales+pagos_por_trasferencia;
        }
        return total;
    }
        
    

  
    
}
