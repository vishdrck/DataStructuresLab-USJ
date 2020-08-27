/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtfractionapp;

/**
 *
 * @author csc2020
 */
public class ADTFraction {

    private int n;
    private int d;

    public ADTFraction(int n, int d) {
        this.setN(n);
        this.setD(d);
    }

    public ADTFraction() {
        this.setN(1);
        this.setD(5);
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getN() {
        return this.n;
    }

    public int getD() {
        return this.d;
    }

    private int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }

    // Calculate lcm
    private int lcm(int m, int n) {
        return m * (n / gcd(m, n));
    }

    // Add two fractions
    public ADTFraction plus(ADTFraction x) {
        int f = this.gcd(this.getN(), x.n);
        int g = this.gcd(this.getD(), x.d);
        ADTFraction s = new ADTFraction(
                ((x.n / f)
                * (x.d / g)
                + (x.n / f)
                * (this.getD() / g)), this.lcm(this.getD(), x.d)
        );
        s.n *= f;
        return s;
    }

    // Return numeric value
    public float value() {
        return this.getN() / this.getD();
    }

    // Display the value in visible format
    public void display() {
        System.out.println(this.getN() + "/" + this.getD());
    }

    //  Multiply by a integer
    public ADTFraction times(int a) {
        return new ADTFraction(this.n * a, this.d);
    }

    // Reciprocal 
    public ADTFraction reciprocal() {
        return new ADTFraction(this.getD(), this.getN());
    }

    // Multiply two fractional numbers
    public ADTFraction times(ADTFraction x) {
        x.n *= this.getN();
        x.d *= this.getD();
        return x;
    }
}
