package br.univel;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import br.univel.interfaces.Calculadora;

@Stateless
@WebService
@SOAPBinding(style = Style.RPC)
public class CalculadoraImpl implements Calculadora {

    public int somar(int add1, int add2) {
        return add1 + add2;
    }

    public int multiplicar(int mul1, int mul2) {
        return mul1 * mul2;
    }
    
}
