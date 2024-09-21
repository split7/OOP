
class MyFirstClass{
    public static void main(String[] s){
        MySecondClass o = new MySecondClass(3, 7);
        System.out.println(o.operations());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setFirst(i);
                o.setSecond(j);
                System.out.print(o.operations());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass{
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