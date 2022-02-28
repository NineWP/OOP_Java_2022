public class Lab8_Pro3_64010761 {
    public static void main(String[] args) {
        Rectangle [] rec = {new Rectangle(2,5,"Red",true),
                            new Rectangle(2.5,4,"green",false),
                            new Rectangle(10,15,"Blue",true)
                        };

        for(int i = 0 ; i < rec.length ; i++){
            System.out.println("Rectangle" + (i+1) + rec[i].toString() + "\n");
        }

        if(rec[0].compareTo(rec[1]) == -1){
            System.out.println("Rectangle1 is equal to Rectangle2");
        }
        else{
            System.out.println("Rectangle1 is not equal to Rectangle2");
        }

        if(rec[1].compareTo(rec[2]) == -1){
            System.out.println("Rectangle2 is equal to Rectangle3");
        }
        else{
            System.out.println("Rectangle2 is not equal to Rectangle3");
        }
    }    
}
