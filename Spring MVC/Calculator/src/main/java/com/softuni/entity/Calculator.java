package com.softuni.entity;

public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private String operator;

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public Calculator() {

    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public double calculateResult() {
        double result = 0;
        switch (this.operator) {
            case "+":
                result = this.getLeftOperand() + this.getRightOperand();
                break;
            case "-":
                result = this.getLeftOperand() - this.getRightOperand();
                break;
            case "*":
                result = this.getLeftOperand() * this.getRightOperand();
                break;
            case "/":
                result = this.getLeftOperand() / this.getRightOperand();
                break;
            case "^":
                result = Math.pow(this.getLeftOperand(), this.getRightOperand());
                break;
            case "√":
                result = Math.sqrt(this.getLeftOperand());
                break;
            case "% of":
                result = (getLeftOperand() / 100) * getRightOperand();
                break;

        }
        return result;
    }

}
