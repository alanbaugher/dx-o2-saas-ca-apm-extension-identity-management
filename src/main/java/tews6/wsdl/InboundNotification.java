/**
 * InboundNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class InboundNotification  implements java.io.Serializable {
    private tews6.wsdl.InboundNotificationInboundNotificationTab inboundNotificationInboundNotificationTab;

    public InboundNotification() {
    }

    public InboundNotification(
           tews6.wsdl.InboundNotificationInboundNotificationTab inboundNotificationInboundNotificationTab) {
           this.inboundNotificationInboundNotificationTab = inboundNotificationInboundNotificationTab;
    }


    /**
     * Gets the inboundNotificationInboundNotificationTab value for this InboundNotification.
     * 
     * @return inboundNotificationInboundNotificationTab
     */
    public tews6.wsdl.InboundNotificationInboundNotificationTab getInboundNotificationInboundNotificationTab() {
        return inboundNotificationInboundNotificationTab;
    }


    /**
     * Sets the inboundNotificationInboundNotificationTab value for this InboundNotification.
     * 
     * @param inboundNotificationInboundNotificationTab
     */
    public void setInboundNotificationInboundNotificationTab(tews6.wsdl.InboundNotificationInboundNotificationTab inboundNotificationInboundNotificationTab) {
        this.inboundNotificationInboundNotificationTab = inboundNotificationInboundNotificationTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundNotification)) return false;
        InboundNotification other = (InboundNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inboundNotificationInboundNotificationTab==null && other.getInboundNotificationInboundNotificationTab()==null) || 
             (this.inboundNotificationInboundNotificationTab!=null &&
              this.inboundNotificationInboundNotificationTab.equals(other.getInboundNotificationInboundNotificationTab())));
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
        if (getInboundNotificationInboundNotificationTab() != null) {
            _hashCode += getInboundNotificationInboundNotificationTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">InboundNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundNotificationInboundNotificationTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "InboundNotificationInboundNotificationTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">InboundNotificationInboundNotificationTab"));
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