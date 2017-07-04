package br.univel;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.univel.qualifiers.Cachorro;
import br.univel.service.CachorroService;

@WebServlet("/Principal")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	@Cachorro
	protected CachorroService cachorroService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("Cachorro Latindo: " + cachorroService.latir());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
