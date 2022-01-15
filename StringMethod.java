public class StringMethod {
    public static void main(String[] args) {
        String name = "Worrapon Rangsee";
        String name1 = "Worrapon Rangsee";

        int count = name.length();
        System.out.println(count);

        System.out.println(name.charAt(3)); // check char in index

        boolean result = name.equals(name1); // compare String
        if(result){
            System.out.println("Equal");
        }
        else{
            System.out.println("Different"); 
        }

        // use startWith
        result = name.startsWith("Wor"); // Can be applied to gender testing by check for Mr. or Ms.
        System.out.println(result);

        // use endWith
        result = name.endsWith("see");
        System.out.println(result);

        // replace String
        String message = "Happy new Year 2021";
        System.out.println(message);
        message =  message.replace("2021", "2022");
        System.out.println(message);
    }
}
