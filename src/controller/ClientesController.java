package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Clientes;
import persistence.Dao;

@WebServlet("/ClientesController")
public class ClientesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClientesController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dao<Clientes> dao = new Dao<Clientes>();
		
		try {
			Clientes clientes = new Clientes();
			
			clientes.setNome(request.getParameter("nome"));
			clientes.setBairro(request.getParameter("bairro"));
			clientes.setCep(request.getParameter("cep"));
			clientes.setCidade(request.getParameter("cidade"));
			clientes.setCpf(request.getParameter("cpf"));
			clientes.setLogradouro(request.getParameter("logradouro"));
			clientes.setUf(request.getParameter("uf"));
			clientes.setRg(request.getParameter("rg"));
			clientes.setSexo(request.getParameter("sexo"));
			clientes.setTelefone(request.getParameter("telefone"));
			
			
			
		} catch (Exception e) {
			
		}
	}

}
