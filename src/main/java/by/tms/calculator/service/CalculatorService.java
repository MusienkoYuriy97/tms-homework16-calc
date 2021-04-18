package by.tms.calculator.service;

import by.tms.calculator.entity.Calculator;
import by.tms.calculator.entity.Operation;
import by.tms.calculator.dao.CalcDao;
import by.tms.calculator.dao.CalcDaoImp;
import java.util.ArrayList;
import java.util.List;

public class CalculatorService {
    CalcDao calcDao = new CalcDaoImp();

    public List<Operation> getOperation() {
        return new ArrayList<>(calcDao.getOperations());
    }

    public double selectCommand(String command, double x, double y){
        double result;
        switch (command){
            case "sum":
                result = Calculator.sum(x,y);
                calcDao.saveOperation(new Operation(x,y,result,command));
                return result;
            case "sub":
                result = Calculator.sub(x,y);
                calcDao.saveOperation(new Operation(x,y,result,command));
                return result;
            case "divide":
                result = Calculator.division(x,y);
                calcDao.saveOperation(new Operation(x,y,result,command));
                return result;
            case "multiply":
                result = Calculator.multiply(x,y);
                calcDao.saveOperation(new Operation(x,y,result,command));
                return result;
            default:
                return 0;
        }
    }
}
