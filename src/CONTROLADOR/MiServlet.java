package CONTROLADOR;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet("/MiServlet")
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		 public void doGet(HttpServletRequest req, HttpServletResponse res)
		 throws IOException, ServletException
		 {
		 res.setContentType("text/html");
		 PrintWriter out = res.getWriter();

		out.println("<html><head><meta name=viewport content=width=device-width,initial-scale=1><style>");

		        out.println(".bg {background-image: url(registro.jpg);height: 100%; background-position: center;background-repeat: no-repeat;background-size: cover;}");
		        out.println("input {width: 100%;padding: 12px;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;margin-top: 6px;margin-bottom: 16px;}");
		        out.println("body{font-family: Arial, Helvetica, sans-serif;margin:0;padding-top: 10;}");

		        out.println("input[type=submit] {background-color: #4CAF50;color: white;}");

		        out.println(".container {background-color: #f1f1f1;width: 50%;padding-left: 20px;padding-right: 20px;}");

		    out.println("</style></head><body><style>margin-bottom: 0;</style>");

		    
		        out.println("<div class=bg>");
		        out.println("<h2>&nbsp;&nbsp;&nbsp;&nbsp;Registro</h2>");
		        out.println("<p>&nbsp;&nbsp;&nbsp;&nbsp;Creación de un nuevo usuario.</p>");

		        out.println("<div class=container><form action=Registrado name=f1 method=post onsubmit=return valido()>");
		        out.println("<label for=nickname><br><b>Nickname</b></br></label><input type=text id=nickname name=nickname required>");

		        out.println("<label for=psw><br><b>Contraseña</b></br></label>");
		        out.println("<h2>holakaseholakase</h2>");
		        out.println("<input type=password id=psw name=psw pattern='(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}' title='Debe tener por lo menos un numero, una letra mayuscula, una minuscula y como minimo 8 caracteres.' required>");
		        out.println("<label for=psw-repeat><br><b>Repite Contraseña</b></br></label>");
		        out.println("<input type=password id=psw-repeat name=psw-repeat pattern='(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}' title='Debe tener por lo menos un numero, una letra mayuscula, una minuscula y como minimo 8 caracteres.' required>");
		        out.println("<input type=submit value=Registrarse></form></div>");



		            out.println("<script> function valido()");
		            out.println("{ if(document.getElementById('psw').value != document.getElementById('psw-repeat').value)");
		            out.println("{alert('Las contraseñas no coinciden.');"); 
		            out.println("} } </script>");        

		    out.println("</body></html>");

		 out.close();
		 
		}

}
