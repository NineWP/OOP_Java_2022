public class StopWatch {

    private double startTime;
    private double endTime;

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return endTime - startTime;
    }

    public double getStartTime(){
        return startTime;
    }

    public double getEndTime(){
        return endTime;
    }
}
