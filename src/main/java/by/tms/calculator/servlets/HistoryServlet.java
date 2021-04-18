package by.tms.calculator.servlets;

import by.tms.calculator.entity.Operation;
import by.tms.calculator.service.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/history")
public class HistoryServlet extends HttpServlet {
    CalculatorService calculatorService = new CalculatorService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        for (Operation operation : calculatorService.getOperation()) {
            resp.getWriter().println(operation);
        }
    }
}
