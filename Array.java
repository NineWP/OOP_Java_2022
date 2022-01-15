class Array {
    public static void main(String[] args) {
        // declare array variable
        int[] number = new int[10];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        System.out.println(number[0]);

        int[] number1 = {5, 15, 25 , 35, 50};
        System.out.println(number1[2]);

        String[] name = {"Nine", "Jame", "Kim"};
        System.out.println(name[2]+ "\narray name length = " +name.length); //check length of array
        name[0] = "Alex";
        System.out.println(name[0]+ "\n-----------------------------");

        // for Each
        for(String data : name){ // also you can use 'for Each' for other data type
            System.out.println(data);
        }

        int sum = 0;
        for(int item : number){
            sum += item;
        }

        System.out.println("Sum of number = " +sum);

        // 2D array
        String [][] product = {
            {"table", "fan", "TV"},
            {"guitar", "tablet", "game"},
            {"keyboard", "mouse", "bed"}
        };
        System.out.println(product[0][0]);
        System.out.println(product[0][1]);
        System.out.println(product[0][2]+ "\n-----------------------------------");

        for(int row = 0; row < product.length; row++){
            for(int column = 0; column < product[row].length; column++){
                System.out.println("row : " +row+ " column : " +column+ " Product = " +product[row][column]);
            }
        }

    }
}
