package by.tms.calculator.dao;

import by.tms.calculator.entity.Operation;

import java.util.List;

public interface DaoHistory {
    void saveOperation(Operation operation);
    List<Operation> getOperations();
}
