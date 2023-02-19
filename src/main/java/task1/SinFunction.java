package task1;

public class SinFunction {
    public static double fact(double x) {
        if (x > 0) return x * fact(x - 1);
        else return 1;
    }

    public static double sin(double x) {
        double tmp;
        double ans = 0;
        double i = 0;
        do {
            tmp = Math.pow(-1, i) * Math.pow(x, (2 * i + 1)) / fact(2 * i + 1);
            ans += tmp;
            i++;
        }
        while (Math.abs(tmp) > 0.001);
        return ans;
    }
}
