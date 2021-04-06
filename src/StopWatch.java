import java.time.LocalTime;
import java.util.Date;
import java.util.zip.DataFormatException;

public class StopWatch {
    double startTime;
    double endTime;
    StopWatch(){
        this.startTime= System.currentTimeMillis();;
    }
    public void setStartTime(){
        this.startTime=System.currentTimeMillis();;
    }
    public void setEndTime(){
        this.endTime=System.currentTimeMillis();;
    }
    public double getElapsedTime(){
        return (this.endTime-this.startTime)/1000;
    }
}
