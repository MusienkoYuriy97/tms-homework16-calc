package by.tms.calculator.service;

import by.tms.calculator.Entity.Calculator;
import by.tms.calculator.Entity.Operation;
import by.tms.calculator.dao.DaoHistory;
import by.tms.calculator.dao.DaoHistoryImp;
import java.util.ArrayList;
import java.util.List;

public class CalculatorService {
    DaoHistory daoHistory = new DaoHistoryImp();

    public List<Operation> getOperation() {
        return new ArrayList<>(daoHistory.getOperations());
    }

    public double selectCommand(String command, double x, double y){
        double result;
        switch (command){
            case "sum":
                result = Calculator.sum(x,y);
                daoHistory.saveOperation(new Operation(x,y,result,command));
                return result;
            case "sub":
                result = Calculator.sub(x,y);
                daoHistory.saveOperation(new Operation(x,y,result,command));
                return result;
            case "divide":
                result = Calculator.division(x,y);
                daoHistory.saveOperation(new Operation(x,y,result,command));
                return result;
            case "multiply":
                result = Calculator.multiply(x,y);
                daoHistory.saveOperation(new Operation(x,y,result,command));
                return result;
            default:
                return 0;
        }
    }
}
