package by.tms.calculator.entity;

public class Operation {
    private double x;
    private double y;
    private double result;
    private String operationType;

    public Operation(double x, double y, double result, String operationType) {
        this.x = x;
        this.y = y;
        this.result = result;
        this.operationType = operationType;
    }

    public Operation() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "x=" + x +
                ", y=" + y +
                ", result=" + result +
                ", operationType='" + operationType + '\'' +
                '}';
    }
}
