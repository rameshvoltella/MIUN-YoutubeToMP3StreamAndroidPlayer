
package miun.connector;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b04 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Converter", targetNamespace = "http://player.miun/", wsdlLocation = "http://localhost:8080/MIUN-Youtube-Music-Converter/Converter?wsdl")
public class Converter_Service
    extends Service
{

    private final static URL CONVERTER_WSDL_LOCATION;
    private final static WebServiceException CONVERTER_EXCEPTION;
    private final static QName CONVERTER_QNAME = new QName("http://player.miun/", "Converter");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/MIUN-Youtube-Music-Converter/Converter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERTER_WSDL_LOCATION = url;
        CONVERTER_EXCEPTION = e;
    }

    public Converter_Service() {
        super(__getWsdlLocation(), CONVERTER_QNAME);
    }

    public Converter_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERTER_QNAME, features);
    }

    public Converter_Service(URL wsdlLocation) {
        super(wsdlLocation, CONVERTER_QNAME);
    }

    public Converter_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERTER_QNAME, features);
    }

    public Converter_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Converter_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Converter
     */
    @WebEndpoint(name = "ConverterPort")
    public Converter getConverterPort() {
        return super.getPort(new QName("http://player.miun/", "ConverterPort"), Converter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Converter
     */
    @WebEndpoint(name = "ConverterPort")
    public Converter getConverterPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://player.miun/", "ConverterPort"), Converter.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERTER_EXCEPTION!= null) {
            throw CONVERTER_EXCEPTION;
        }
        return CONVERTER_WSDL_LOCATION;
    }

}
