package headfirst.chapter4.exercises.e1;

/*This class would not compile because the getTime() method is not expected to return anything*/
public class Clock {
    private String time;                    // added private modifier

    // changed return type from void to String
    public String getTime() {               // added public modifier
        return time;
    }

    public void setTime(String time) {      // added public modifier
        this.time = time;
    }
}
