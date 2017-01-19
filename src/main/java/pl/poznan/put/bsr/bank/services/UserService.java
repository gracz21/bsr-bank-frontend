package pl.poznan.put.bsr.bank.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebService(name = "UserService", targetNamespace = "http://services.bank.bsr.put.poznan.pl/")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface UserService {


    /**
     * @param firstName
     * @param lastName
     * @param password
     * @param userName
     * @throws BankServiceException_Exception
     * @throws ValidationException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "register", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.RegisterResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/UserService/registerRequest", output = "http://services.bank.bsr.put.poznan.pl/UserService/registerResponse", fault = {
            @FaultAction(className = BankServiceException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/UserService/register/Fault/BankServiceException"),
            @FaultAction(className = ValidationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/UserService/register/Fault/ValidationException")
    })
    public void register(
            @WebParam(name = "userName", targetNamespace = "")
                    String userName,
            @WebParam(name = "password", targetNamespace = "")
                    String password,
            @WebParam(name = "firstName", targetNamespace = "")
                    String firstName,
            @WebParam(name = "lastName", targetNamespace = "")
                    String lastName)
            throws BankServiceException_Exception, ValidationException_Exception
    ;

    /**
     * @throws AuthException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "logout", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.LogoutResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/UserService/logoutRequest", output = "http://services.bank.bsr.put.poznan.pl/UserService/logoutResponse", fault = {
            @FaultAction(className = AuthException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/UserService/logout/Fault/AuthException")
    })
    public void logout()
            throws AuthException_Exception
    ;

    /**
     * @param password
     * @param userName
     * @return returns java.lang.String
     * @throws BankServiceException_Exception
     * @throws ValidationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.LoginResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/UserService/loginRequest", output = "http://services.bank.bsr.put.poznan.pl/UserService/loginResponse", fault = {
            @FaultAction(className = BankServiceException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/UserService/login/Fault/BankServiceException"),
            @FaultAction(className = ValidationException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/UserService/login/Fault/ValidationException")
    })
    public String login(
            @WebParam(name = "userName", targetNamespace = "")
                    String userName,
            @WebParam(name = "password", targetNamespace = "")
                    String password)
            throws BankServiceException_Exception, ValidationException_Exception
    ;

    /**
     * @throws AuthException_Exception
     * @throws BankServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCurrentUser", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.DeleteCurrentUser")
    @ResponseWrapper(localName = "deleteCurrentUserResponse", targetNamespace = "http://services.bank.bsr.put.poznan.pl/", className = "pl.poznan.put.bsr.bank.services.DeleteCurrentUserResponse")
    @Action(input = "http://services.bank.bsr.put.poznan.pl/UserService/deleteCurrentUserRequest", output = "http://services.bank.bsr.put.poznan.pl/UserService/deleteCurrentUserResponse", fault = {
            @FaultAction(className = BankServiceException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/UserService/deleteCurrentUser/Fault/BankServiceException"),
            @FaultAction(className = AuthException_Exception.class, value = "http://services.bank.bsr.put.poznan.pl/UserService/deleteCurrentUser/Fault/AuthException")
    })
    public void deleteCurrentUser()
            throws AuthException_Exception, BankServiceException_Exception
    ;

}
