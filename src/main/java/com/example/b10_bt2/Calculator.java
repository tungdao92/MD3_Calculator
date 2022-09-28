package com.example.b10_bt2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/servlet")
public class Calculator extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        float num1 = Float.parseFloat(request.getParameter("num1"));
        float num2 = Float.parseFloat(request.getParameter("num2"));
        String operator = request.getParameter("op");
        float result = 0;
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        }

        request.setAttribute("result", result);
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);


        request.getRequestDispatcher("index.jsp").forward(request, response);

//        PrintWriter printWriter = response.getWriter();
//        printWriter.println("<h1> Ré: " + result + "</h1>");
    }

    public void destroy() {
    }
}