package com.hitema.servletpoctrois;

import com.hitema.dao.CityDaoImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CityServlet", value = "/CityServlet")
public class CityServlet extends HttpServlet {

    CityDaoImpl dao = new CityDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        req.setAttribute("cities",dao.findAll());
        RequestDispatcher rd =
                req.getRequestDispatcher("cities.jsp");
        rd.forward(req, resp);
    }
}
