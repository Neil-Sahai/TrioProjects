package MVCCalculator;

public class Model {

    public String num(String number, String newNum, boolean concat) {

        String result = "";

        if (concat) {
            result = number + newNum;
        } else {
            result = newNum;
        }

        return result;
    }

    public String operate(double one, int operation, double two) {

        double answer = 0;

        switch(operation) {
            case 0:
                answer = two;
                break;
            case 1:
                answer = one + two;
                break;
            case 2:
                answer = one - two;
                break;
            case 3:
                answer = one * two;
                break;
            case 4:
                answer = one / two;
                break;
        }

        double roundedAnswer = Math.round(answer * 1000000);
        String result = String.valueOf(roundedAnswer / 1000000);

        return result;
    }

}
