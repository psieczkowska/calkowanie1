package edu;

import static java.lang.Math.pow;

public class MetodaTrapezow implements Function{
    @Override
    public double f(double x) {
        return pow((1+x), 0.5);
    }


    public double metodaTrapezow(int n,  double a, double b){
        double licznik = 0;
        double h = (b-a)/n;
        for (int i=0; i<n+1; i++){
            licznik+=f(a+i*h);
        }

        return (h)*(f(a)*0.5+licznik+f(b)*0.5);
    }
}
