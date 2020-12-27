public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString(){
        String hours = String.format("%02d", hour);
        String minutes = String.format("%02d", minute);
        String seconds = String.format("%02d", second);
        return hours+":"+minutes+":"+seconds;
    }
    public Time nextSecond(){
        second+=1;
        return new Time(hour, minute, second);
    }
    public Time previousSecond(){
        second-=1;
        return new Time(hour, minute, second);
    }
}

