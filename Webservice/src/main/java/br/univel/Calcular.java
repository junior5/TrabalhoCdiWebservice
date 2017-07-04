package br.univel;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import br.univel.interfaces.Calculadora;
import java.net.URL;

public class Calcular {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://127.0.0.1:9090/calculadora?wsdl");
			QName qname = new QName("http://calculadora/", "CalculadoraImpl");
			Service sv = Service.create(url, qname);
			Calculadora calc = sv.getPort(Calculadora.class);

			System.out.println(calc.somar(1,2));

		} catch (Exception e) {
			e.printStackTrace();
		}

}
}
