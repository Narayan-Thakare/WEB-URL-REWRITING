

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		  try{  
			  
		        response.setContentType("text/html");  
		        PrintWriter out = response.getWriter();  
		          
		        String n=request.getParameter("userName");  
		        out.print("Welcome "+n);  
		        out.print("<br> ");  

		        //appending the username in the query string  
		        out.print("<a href='Serv2?uname="+n+"'>visit</a>");  
		                  
		        out.close();  
		  
		                }catch(Exception e){System.out.println(e);}  

		
		
		
	}

}
