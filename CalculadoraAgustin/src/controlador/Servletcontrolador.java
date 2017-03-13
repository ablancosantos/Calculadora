package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Operaciones;
//Esto es a�adido por Alberto Ta�n primer comenterio
// Segundp comentario de Alberto Ta�n

/**
 * 
 * Servlet implementation class servletcontrolador
 * 
 */

@WebServlet("/Servletcontrolador")

public class Servletcontrolador extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @see HttpServlet#HttpServlet()
	 * 
	 */

	public Servletcontrolador() {

		super();

		// TODO Auto-generated constructor stub

	}

	/**
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 * 
	 *      Este m�todo se encarga de procesar las peticiones recibidas.
	 * 
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub

		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		
				
		int resultado;

		Operaciones operacion = new Operaciones();

		// Recuperamos los operandos que utilizaremos en nuestra operaci�n

		operacion.setOperandoa(Integer.parseInt(request.getParameter("numa")));

		operacion.setOperandob(Integer.parseInt(request.getParameter("numb")));

		// Comprobamos que operaci�n hay que realizar

		if (request.getParameter("operacion").equals("sumar")) {

			resultado = operacion.suma();

			System.out.println("el resultado es:" + resultado);

		} else {

			resultado = operacion.resta();

			System.out.println("el resultado es:" + resultado);

		}

		System.out.println("el resultado es:" + resultado);

		request.setAttribute("result", resultado);

		System.out.println("El valor del atributo es....." + request.getAttribute("result").toString());

		// Redirigimos a la pagina resultado.jsp para que muestre el resultado
		// de la operaci�n

		request.getRequestDispatcher("/resultado.jsp").forward(request, response);

	}

	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 * 
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub

		doGet(request, response);

	}

}