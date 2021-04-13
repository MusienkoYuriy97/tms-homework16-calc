package by.tms.calculator.dao;

import by.tms.calculator.Entity.Operation;

import java.util.List;

public interface DaoHistory {
    void saveOperation(Operation operation);
    List<Operation> getOperations();
}
