package by.tms.calculator.servlets;


import by.tms.calculator.service.CalculatorService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/home")
public class CalculatorServlet extends HttpServlet{
    CalculatorService calculatorService = new CalculatorService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double x = Double.parseDouble(req.getParameter("num1"));
        double y = Double.parseDouble(req.getParameter("num2"));
        String command = req.getParameter("command");

        double result = calculatorService.selectCommand(command,x,y);

        resp.getWriter().println(command + " = " + result);
    }
}
