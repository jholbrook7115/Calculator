package Calculator;


import java.util.Objects;

public class Calculator {


    public Calculator() {

    }

    public String[] parseInputString(String str) {
        return str.split("\\s+");
    }

    public double calculation(String str) {
        String[] parsedInput = str.split("\\s+");
        for(int i = 1; i < parsedInput.length; i=i+2){
            if(parsedInput[i] == "-"){
                //change the number following it to a negative
                if(parsedInput[i+1].equals("\\-[0-9]*")){
                    parsedInput[i+1].split("\\-");
                } else {
                    parsedInput[i+1] = "-" + parsedInput[i+1];
                    parsedInput[i] = "+";
                }
            }
        }
        return calculate(0.0, parsedInput);

    }

    private double calculate(double result, String[] expr) {

        if(expr.length <= 3){
            switch(expr[1]){
                case "*":
                    result = multiply(Double.parseDouble(expr[0]), Double.parseDouble(expr[2]));
                    break;
                case "/":
                    result = divide(Double.parseDouble(expr[0]), Double.parseDouble(expr[2]));
                    break;
                case "+":
                    result = add(Double.parseDouble(expr[0]), Double.parseDouble(expr[2]));
                    break;
                case "-":
                    result = subtract(Double.parseDouble(expr[0]), Double.parseDouble(expr[2]));
                    break;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < expr.length; i=i+2){
                switch(expr[i]){
                    case "*":
                    case "/":

                        calculate(result, expr);
                    case "+":
                    case "-":

                }
            }
            result += calculate(result, expr);
        }
        return result;
    }

    public double add(double lhs, double rhs) {
        return lhs + rhs;
    }

    public double subtract(double lhs, double rhs) {
        return lhs - rhs;
    }

    public double multiply(double lhs, double rhs) {
        return lhs * rhs;
    }

    public double divide(double lhs, double rhs) {
        return lhs / rhs;
    }


}