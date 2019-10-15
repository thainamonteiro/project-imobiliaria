package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Imoveis;
import persistence.Dao;

@WebServlet("/ImoveisController")
public class ImoveisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ImoveisController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Dao<Imoveis> dao = new Dao<Imoveis>();

		try {
			Imoveis imoveis = new Imoveis();

			imoveis.setNome(request.getParameter("nome"));
			imoveis.setCep(request.getParameter("cpf"));
			imoveis.setCidade(request.getParameter("cidade"));
			imoveis.setRua(request.getParameter("rua"));
			imoveis.setUf(request.getParameter("uf"));
			imoveis.setComodos(request.getParameter("comodos"));
			imoveis.setPreço(Double.parseDouble(request.getParameter("preco")));

			if(request.getParameter("id") == null) {
				
			}else {
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
