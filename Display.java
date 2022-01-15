class Display {
    public static void main(String[] args) {
    int num = 10, num1 = 20;

    // constant variable should be uppercase
    final int NUM2 = 50;
    final char CHAR = 'A';
    final boolean T = true;
    {
        final int c = 55; // <-- c is local variable
        System.out.println(c);
        System.out.println(num);
    }
    //System.out.println(c); <-- you can't print c here

    System.out.println("sum = " + (num + num1 + NUM2));
    System.out.println(T);
    System.out.println(CHAR);

    System.out.println(Integer.MIN_VALUE); // print min_value of int data type
    System.out.println(Long.MIN_VALUE); // print min_value of long data type
    System.out.println(Integer.MAX_VALUE); // print max_value of int data type
    System.out.println(Long.MAX_VALUE); // print max_value of long data type

    // String
    String a = "100", b ="200";
    a = a + 50;
    System.out.println(a);
    System.out.println(b);

    //change string to int
    a = "100";
    int c = Integer.parseInt(a);
    c = c + 50;
    System.out.println(c);

    //change string to double
    a = "100";
    double d = Double.parseDouble(a);
    d = d + 2.3;
    System.out.println(d);

    //integer to string
    int number = 1000;
    String age = String.valueOf(number);
    age = age + 50;
    System.out.println(age);

    //check data type for class data type like Integer, Double, Long ...
    boolean result = a instanceof String; // if a is String , result = true else error
    System.out.println(result);

    }
}
