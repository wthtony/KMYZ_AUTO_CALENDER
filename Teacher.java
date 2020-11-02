package calender;
import java.util.ArrayList;

/*public class Time{
    int hours;
    int minutes;
    Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public int TimeinMinutes(){
        return this.hours*60 + this.minutes;
    }
}*/

public class Teacher{
    //int day;
    String name;
    int TimeSpan;
    int StartTime;
    int EndTime;
    TeacherOneDay(/*int day,*/ String name, Time StartTime, Time EndTime){
        //this.day = day;
        this.name = name;
        this.StartTime = StartTime.TimeinMinutes();
        this.EndTime = EndTime.TimeinMinutes();
        this. TimeSpan = this.EndTime - this.StarTime;
    }
}

/*public class Teacher{
    //ArrayList???
    ArrayList teacher;
    Teacher(){
        this.teacher = new ArrayList<>();
    }

    public void add(TeacherOneDay x){
        teacher.add(x.day, x);
    }
    
    
    public void remove(TeacherOneDay x){
        teacher.remove(x);
    }
}*/

