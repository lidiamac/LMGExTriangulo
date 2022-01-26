package br.com.triangulo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Triangulo
 */
@WebServlet("/Triangulo")
public class Triangulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Triangulo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int lado1, lado2, lado3;
		lado1 = Integer.parseInt(request.getParameter("lado1"));
		lado2 = Integer.parseInt(request.getParameter("lado2"));
		lado3 = Integer.parseInt(request.getParameter("lado3"));
		
		if(lado1 > lado2 - lado3 && lado2 > lado1 - lado3 && lado3 > lado1 - lado2) {
			if(lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
				response.getWriter().println("É um triangulo!: ");
			}
			
		}
		
	}
	
//	public int verificarExistencia(HttpServletRequest request, HttpServletResponse response) {
//		
//	}

}
