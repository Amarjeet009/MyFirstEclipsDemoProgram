package com.niit.MyFirstWebApp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.MyFirstWebApp.dao.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   /* public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * 
	 */
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("calling doGet method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		System.out.println("calling doPost method");
		
		String UserName=(String)request.getAttribute("UserName");
		 String Password=(String)request.getAttribute("Password");
		 
		 response.setContentType("text/html");
		/* 
		 System.out.println(UserName+"UserName");
		 System.out.println(Password+"password");
		 
		 if(UserName.equals("Amarjeet")&& Password.equals("12345"))
		 {
			 // need to nevigate the home page
			 System.out.println("Valid Credentials");
		 }
		 else
		 {   //need to nevigate the error page
			 System.out.println("Invalid Credentials");
		 }*/
		 
		 //Here  created the instance of user DAO
		 UserDAO userDAO=new UserDAO();
		 //call valid method
		 //declare the RequestDispatcher
		 
		 RequestDispatcher dispatcher;
		 
		 //call validate method
		 if(UserDAO.isValidUser(UserName, Password))
		 {
			 //need to nevigate/dispatch to home page
			 //to dispatch the request and response, ew need RequestDispatcher which is avaliable on reponse object

		     // create the object of requestDispatcher
			 
			 dispatcher=request.getRequestDispatcher("Home.jsp");//just created the instance
			 
			 dispatcher.forward(request,response);//forward thew request nad response to home page
		 }
		 else
		 {    
			 //if it is invalid credentials, elase part will execute
			 //need to navigate to login page+show the error message.
			 dispatcher=request.getRequestDispatcher("Login.jsp");
			 
			 //how can i give the message
			 //You should write System.out.println("Invalid login")??it will print on consol not in web page.
			 
			 // So, we have to use PrintWriter object from response
			 
			PrintWriter writer=response.getWriter();
			writer.println("Invaid login, Please enter correct user name and password");
			 
			 dispatcher.include(request,response);
			 
			// include: whatever written in dispatcher or request both are perform
		 }
	}

}
