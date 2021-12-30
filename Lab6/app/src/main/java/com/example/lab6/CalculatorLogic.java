package com.example.lab6;

import android.annotation.SuppressLint;

public class CalculatorLogic {

    float firstNum;
    float secondNum;
    private int selectedAction;
    StringBuilder inputText = new StringBuilder();



    private State state;
    private enum State {
        inputFirstNum, inputSecondNum, showResult
    }

    public CalculatorLogic(){
        state = State.inputFirstNum;
    }

    @SuppressLint("NonConstantResourceId")
    public void onNumPressed(int btnID) {

        if (state == State.showResult) {
            state = State.inputFirstNum;
            inputText.setLength(0);
        }

        if(inputText.length() < 9) {
            switch (btnID) {
                case R.id.zero:
                    if(inputText.length() != 0) {
                        inputText.append("0");
                    }
                    break;
                case R.id.one:
                        inputText.append("1");
                    break;
                case R.id.two:
                    inputText.append("2");
                    break;
                case R.id.three:
                    inputText.append("3");
                    break;
                case R.id.four:
                    inputText.append("4");
                    break;
                case R.id.five:
                    inputText.append("5");
                    break;
                case R.id.six:
                    inputText.append("6");
                    break;
                case R.id.seven:
                    inputText.append("7");
                    break;
                case R.id.eight:
                    inputText.append("8");
                    break;
                case R.id.nine:
                    inputText.append("9");
                    break;
                case R.id.dot:
                    if(inputText.length() != 0) {
                        inputText.append(".");
                    }
                    break;
            }
        }
    }


    @SuppressLint("NonConstantResourceId")
    public void onActionPressed(int actionID) {
        if (actionID == R.id.equals && state == State.inputSecondNum) {
            secondNum = Float.parseFloat(inputText.toString());
            state = State.showResult;
            inputText.setLength(0);
            switch (selectedAction) {
                case R.id.divide:
                    inputText.append(firstNum / secondNum);
                    break;
                case R.id.multiply:
                    inputText.append(firstNum * secondNum);
                    break;
                case R.id.plus:
                    inputText.append(firstNum + secondNum);
                    break;
                case R.id.minus:
                    inputText.append(firstNum - secondNum);
                    break;
                case R.id.percent:
                    inputText.append(firstNum * (secondNum / 100));
                    break;

            }
        } else if (inputText.length() > 0 && state == State.inputFirstNum) {
            firstNum = Float.parseFloat(inputText.toString());
            state = State.inputSecondNum;
            inputText.setLength(0);
            switch (actionID) {
                case R.id.divide:
                    selectedAction = R.id.divide;
                    break;
                case R.id.multiply:
                    selectedAction = R.id.multiply;
                    break;
                case R.id.plus:
                    selectedAction = R.id.plus;
                    break;
                case R.id.minus:
                    selectedAction = R.id.minus;
                    break;
                case R.id.percent:
                    selectedAction = R.id.percent;
                    break;

            }
        }


    }
    public void clear() {
        state = State.inputFirstNum;
        inputText.setLength(0);
    }


    public String getText() {
        return inputText.toString();
    }

    private char getOperation() {
        switch(selectedAction) {
            case R.id.multiply:
                return 'x';
            case R.id.divide:
                return '/';
            case R.id.plus:
                return '+';
            case R.id.minus:
                return '-';
            default:
                return ' ';
        }
    }
}
