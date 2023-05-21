package com.time;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.TimeZone;

@WebServlet("/beijing")
public class BeijingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        Date now = new Date();
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Beijing"));
        printWriter.println("<h3>Время Пекин: " + now + "</h3>");
        printWriter.close();

    }
}
