/**
 * DtRegistro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtRegistro  implements java.io.Serializable {
    private java.util.Calendar fechaRegistro;

    private publicadores.DtSocio socio;

    private publicadores.DtClase clase;

    public DtRegistro() {
    }

    public DtRegistro(
           java.util.Calendar fechaRegistro,
           publicadores.DtSocio socio,
           publicadores.DtClase clase) {
           this.fechaRegistro = fechaRegistro;
           this.socio = socio;
           this.clase = clase;
    }


    /**
     * Gets the fechaRegistro value for this DtRegistro.
     * 
     * @return fechaRegistro
     */
    public java.util.Calendar getFechaRegistro() {
        return fechaRegistro;
    }


    /**
     * Sets the fechaRegistro value for this DtRegistro.
     * 
     * @param fechaRegistro
     */
    public void setFechaRegistro(java.util.Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    /**
     * Gets the socio value for this DtRegistro.
     * 
     * @return socio
     */
    public publicadores.DtSocio getSocio() {
        return socio;
    }


    /**
     * Sets the socio value for this DtRegistro.
     * 
     * @param socio
     */
    public void setSocio(publicadores.DtSocio socio) {
        this.socio = socio;
    }


    /**
     * Gets the clase value for this DtRegistro.
     * 
     * @return clase
     */
    public publicadores.DtClase getClase() {
        return clase;
    }


    /**
     * Sets the clase value for this DtRegistro.
     * 
     * @param clase
     */
    public void setClase(publicadores.DtClase clase) {
        this.clase = clase;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtRegistro)) return false;
        DtRegistro other = (DtRegistro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaRegistro==null && other.getFechaRegistro()==null) || 
             (this.fechaRegistro!=null &&
              this.fechaRegistro.equals(other.getFechaRegistro()))) &&
            ((this.socio==null && other.getSocio()==null) || 
             (this.socio!=null &&
              this.socio.equals(other.getSocio()))) &&
            ((this.clase==null && other.getClase()==null) || 
             (this.clase!=null &&
              this.clase.equals(other.getClase())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFechaRegistro() != null) {
            _hashCode += getFechaRegistro().hashCode();
        }
        if (getSocio() != null) {
            _hashCode += getSocio().hashCode();
        }
        if (getClase() != null) {
            _hashCode += getClase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtRegistro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtRegistro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "socio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtSocio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtClase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
