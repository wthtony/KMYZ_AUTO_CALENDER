package calender;
public class Class{
  String name;
  int grade;
  int StartTime;
  int EndTime;
  int TimeSpan;
  Class(String name; Time StartTime Time EndTime){
    this.name = name;
    this.StartTime = StartTime.TimeinMinutes();
    this.EndTime = EndTime.TimeinMinutes();
    this.TimeSpan = this.StartTime - this.EndTime;
  }
  public int GradetoCol(){
    if(this.grade <= 102){
      return this.grade - 101
    }
    if(this.grade <= 112){
      return this.grade -111 + 2; 
    }
    if(this.grade <= 122){
        return this.grade -121 + 4;
    }
  }
  
}
public class Schedule{
  Class[][] schedule;
  Schedule(){
    this.schedule = Class[10][6];
  }
  public void add(Class x){
    Time start = new Time(7,55);
    int classtime = x.StartTime;
    int i = 0;
    while(classtime != start.TimeinMinutes()){
      class = class - 50;
      i++;
    }
    schedule[i][x.GradetoCol] = x;
    }
  }
}

