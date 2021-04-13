package by.tms.calculator.dao;

import by.tms.calculator.Entity.Operation;

import java.util.ArrayList;
import java.util.List;

public class DaoHistoryImp implements DaoHistory{
    private static List<Operation> operations = new ArrayList<>();

    public List<Operation> getOperations() {
        return operations;
    }


    @Override
    public void saveOperation(Operation operation) {
        operations.add(operation);
    }
}
