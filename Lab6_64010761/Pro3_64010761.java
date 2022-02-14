public class Pro3_64010761 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for(int i = 1 ; i < 21 ; i++){
            queue.enqueue(i);
            System.out.println("Length of the queue = " + queue.getLength());
            System.out.println("Size of the queue = " + queue.getSize());
        }

        while(!queue.empty()){
            queue.dequeue();
            for(int i = 0 ; i < queue.getSize() ; i++){
                System.out.print(queue.getElement(i) + " ");
            }
            System.out.print("        Size of the queue = " + queue.getSize());
            System.out.println("        Length of the queue = " + queue.getLength() + "\n"); 
        }
        
    }
}
