package Exercise8.Exercise8_3;

public class Pen {
    Body body;
    Bar bar;
    Spring spring;
    boolean isOn;

    public Pen(Bar bar, Spring spring) {
        this.bar = bar;
        this.spring = spring;
    }

    public void putForward(){
        if(!spring.haveSpring){
            System.out.println("Vstavte prujinu");
        }
        else {
            isOn = true;
            System.out.println("Sterjen vstavlen");
        }

    }
    public void pushIn(){
        isOn = false;
        System.out.println("Sterjen zadvinut");

    }
    public void write(String s){
        if(isOn) {
            if (s.length() <= bar.countOfBar) {
                System.out.println(s);
                bar.countOfBar -= s.length();
            } else {
                System.out.println(s.substring(0, bar.countOfBar));
                bar.countOfBar = 0;
            }
        }else{
            System.out.println("Vidvinte sterjen");
        }
    }
}
