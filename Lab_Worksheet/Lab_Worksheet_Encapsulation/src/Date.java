public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;

    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day=day;
    }

    public int getMonth(){
        return month;
    }
    public void setMonth(int Month){
        this.month=Month;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }

    public void setDate(int day,int month,int year){

    }
    public String toString(){
        return day+"."+month+"."+year;
    }



}
