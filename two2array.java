package com.example.demo;

    public class two2array {


        public static void main(String[] args) {
            Funcprog utility = new Funcprog();

            int select;
            int m;
            int n;
            System.out.println("1. Interger 2D Array");
            System.out.println("2. Double 2D Array");
            System.out.println("3. Boolean 2D Array");
            System.out.print("Select the type of array from above : ");
            select = utility.getIntValue();
            if( select > 0 && select <=3) {
                System.out.print("Enter the number of columns in array: " );
                m = utility.getIntValue();
                System.out.print("Enter the number of row in array: " );
                n = utility.getIntValue();

                switch (select) {
                    case 1 -> {
                        Integer[][] Array = utility.getInt2DArray(m, n);
                        utility.printArray(Array, m, n);
                    }
                    case 2 -> {
                        Double[][] Array1 = utility.getDouble2DArray(m, n);
                        utility.printArray(Array1, m, n);
                    }
                    case 3 -> {
                        Boolean[][] Array3 = utility.getBoolean2DArray(m, n);
                        utility.printArray(Array3, m, n);
                    }
                }
            }
            else
                System.out.println("Invalid Selection");
        }
    }

