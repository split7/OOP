package myfirstpackage;
public class MySecondClass{
    private int first;
    private int second;

    public MySecondClass(){
        first = 0;
        second = 0;
    }

    public MySecondClass(int first, int second){
        this.first = first;
        this.second = second;
    }

    public int operations(){
        return Math.max(first, second);
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}