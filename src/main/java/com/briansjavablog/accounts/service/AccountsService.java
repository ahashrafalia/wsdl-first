package com.briansjavablog.accounts.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import com.briansjavablog.accounts.service.Accounts;
import com.briansjavablog.accounts.service.AccountsService;

import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-09-26T09:08:42.753+05:30
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "AccountsService", 
                  wsdlLocation = "file:/H:/ws-ekm/wsdl-first/src/main/resources/wsdl/Accounts.wsdl",
                  targetNamespace = "http://www.briansjavablog.com/Accounts/") 
public class AccountsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.briansjavablog.com/Accounts/", "AccountsService");
    public final static QName AccountsPort = new QName("http://www.briansjavablog.com/Accounts/", "AccountsPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/H:/ws-ekm/wsdl-first/src/main/resources/wsdl/Accounts.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AccountsService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/H:/ws-ekm/wsdl-first/src/main/resources/wsdl/Accounts.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AccountsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AccountsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountsService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AccountsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AccountsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AccountsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Accounts
     */
    @WebEndpoint(name = "AccountsPort")
    public Accounts getAccountsPort() {
        return super.getPort(AccountsPort, Accounts.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Accounts
     */
    @WebEndpoint(name = "AccountsPort")
    public Accounts getAccountsPort(WebServiceFeature... features) {
        return super.getPort(AccountsPort, Accounts.class, features);
    }

}