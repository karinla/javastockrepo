package com.shultz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shultz.model.Portfolio;
import com.shultz.service.PortfolioManager;

@SuppressWarnings("serial")
public class PortfolioServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				
		resp.setContentType("text/html");
		
		PortfolioManager portfolioManager= new PortfolioManager();
				
		Portfolio portfolio = portfolioManager.getPortfolio();
		portfolio.getHtmlString();
		
		resp.getWriter().println(portfolio.getHtmlString());
		
	
	
	}

}

	