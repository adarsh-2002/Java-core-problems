package Number;

public class Number {
    private double number;

    Number() {
        number = 0;
    }

    Number(double number) {
        this.number = number;
    }

    public boolean isZero() {
        if(number == 0)
            return true;
        return false;
    }
    public boolean isPositive() {
        if(number >= 0)
            return true;
        return false;
    }
    public boolean isNegative() {
        if(number < 0)
            return true;
        return false;
    }
    public boolean isEven() {
        if(number%2 == 0)
            return true;
        return false;
    }
    public boolean isOdd() {
        if(number%2 != 0)
            return true;
        return false;
    }
    public boolean isPrime() {
        if(number >= 0 && number < 3)
            return true;
        for(int i = 3; i < number/2; i = i+2) {
            if(number%i == 0)
                return false;
        }
        return true;
    }
    public boolean isAmstrong() {
        int armstrong = 0;
        int temp = (int)number;
        int digits = 0;
        while(temp != 0) {
            temp = temp/10;
            digits++;
        }
        temp = (int)number;
        while(temp != 0) {
            armstrong += (int)Math.pow(temp%10, digits);
            temp = temp/10;
        }
        if(armstrong == number)
            return true;
        return false;
    }
    public int getFactorial() {
        int fact = 1;
        for(int i = 1; i <= number; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public int getReverse() {
        int reverse = 0;
        int temp = (int)number;
        while(temp != 0) {
            reverse = reverse*10;
            reverse = reverse + temp%10;
            temp = temp/10;
        }
        return reverse;
    }
    public int getSqr() {
        return (int)Math.pow(number, 2);
    }
    public int getSqrt() {
        return (int)Math.sqrt(number);
    }
    public int sumDigits() {
        int sum = 0;
        int temp = (int)number;
        while(temp != 0) {
            sum += temp%10;
            temp = temp/10;
        }
        return sum;
    }
    public void dispBinary() {
        int temp = (int)number;
        while(temp != 0) {
            System.out.print(temp%2);
            temp = temp/2;
        }
    }
    public void dispFactor() {
        for(int i = 1; i <= number; i++) {
            if(number%i == 0)
                System.out.print(i+" ");
        }
    }
}