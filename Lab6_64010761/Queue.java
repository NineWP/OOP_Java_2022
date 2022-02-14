public class Queue {
    private int [] element;
    private int size;

    Queue(){
        element = new int[8];
        size = 0;
    }

    public void enqueue(int v){
        if(size >= element.length){
            int [] temp = new int[element.length * 2];
            System.arraycopy(element, 0, temp, 0, element.length);
			element = temp;
        }
        element[size++] = v;
    }

    public void dequeue(){
        if(!empty()){
            this.element[0] = '\0';
            // shift element
            for(int i = 0 ; i < element.length-1 ; i++){
                element[i] = element[i+1];
            }
            size--;
            if(element.length > 8 && element.length / 2 >= size){
                int [] temp = new int[element.length / 2];
                for(int i = 0 ; i < this.element.length / 2 ; i++){
                    temp[i] = this.element[i];
                }
                this.element = temp;
            }
        }

    }

    public boolean empty(){
        if(size == 0)
            return true;
        else
            return false;
    }

    public int getSize(){
        return size;
    }

    public int getLength(){
        return this.element.length;
    }

    public int getElement(int i){
        return element[i];
    }
}
