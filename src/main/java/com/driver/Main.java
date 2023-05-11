package com.driver;

public class Main {

    //Task 2
    static class Product{

        // Task 3
        public int product(int x,int y){
            return x * y;
        }

        // Task 4
        public int product(int x,int y,int z){
            return x*y*z;
        }

        //Task 5
        public double product(double x,double y){
            return (double) x*y;
        }
    }
    public static void main(String[] args) {
        //Task 2
          Product p = new Product();
           // Task 3
        System.out.println(p.product(2,3));
           // Task 4
        System.out.println(p.product(2,3,4));
           // Task 5
        System.out.println(p.product(2.2,3.6));
    }

}