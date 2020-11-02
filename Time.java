package calender;
public class Time{
    int hours;
    int minutes;
    Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public int TimeinMinutes(){
        return this.hours*60 + this.minutes;
    }
}
