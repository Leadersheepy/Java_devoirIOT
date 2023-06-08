package com.hitema.servletpoctrois;

import com.hitema.dao.CountryDaoImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CountryServlet", value = "/CountryServlet")
public class CountryServlet extends HttpServlet {

    private CountryDaoImpl dao = new CountryDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        req.setAttribute("countries", dao.findAll());
        RequestDispatcher rd =
                req.getRequestDispatcher("countries.jsp");
        rd.forward(req, resp);
    }
}
