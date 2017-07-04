package br.univel.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Calculadora {

    public int somar(int add1, int add2);

    public int multiplicar(int mul1, int mul2);
	
}
