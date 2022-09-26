
package com.mustafacoban.matematik;

/**
 *
 * @author shepherd
 */
public class Matematik implements IMatematik{

    public static void main(String[] args) {
        
    }

    @Override
    public void add(int x, int y) {
        System.out.println("Result: " + (x+y));
    }

    @Override
    public void extract(int x, int y) {
        System.out.println("Result: " + (x-y));
    }

    @Override
    public void multiply(int x, int y) {
        System.out.println("Result: " + (x*y));
    }

    @Override
    public void division(int x, int y) {
        System.out.println("Result: " + ((double)x/y));
    }
}
