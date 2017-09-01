package main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Random;

/**
 * Servlet implementation class RandomDouble
 */

public class RandomDouble extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomDouble() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet RandomDouble got a request from address: " +request.getRemoteAddr());
		Random rand = new Random();
		PrintWriter wout = response.getWriter();
		wout.println("<!DOCTYPE html>");
		wout.println("<html><body>");
		wout.println("Random double between 0 and 1: ");
		wout.println("<strong>"+rand.nextDouble()+"</strong>");
		wout.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
