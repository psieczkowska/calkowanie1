package edu;

import static java.lang.Math.pow;

public class MetodaSimpsona implements Function{

    public double metodaSimpsona(int n,  double a, double b){
        double licznik1 = 0;
        double licznik2 =0;
        double h = (b-a)/n;
        for (double i=1; i<n; i=i+2){
            licznik1+=f(a+h*i);
        }
        for (double j= 2; j<n; j=j+2){
            licznik2+=f(a+h*j);
        }

        return ((h/3.0)*(f(a)+4*licznik2+2*licznik1+f(b)));
    }

    @Override
    public double f(double x) {
        return pow((1+x), 0.5) ;
    }
}
