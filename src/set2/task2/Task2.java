package set2.task2;

public class Task2 {
    private double a;
    private double b;
    private double c;

    public void setNumbers(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getY(double x){
        return  a*Math.pow(x,2)+b*x+c;
    }

    public int getNumberOfSqrt(){
        double sum = Math.pow(b,2)-4*a*c;
        if(sum< 0){
            return 0;
        }else if(sum ==0){
            return 1;
        }else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.setNumbers(1,4,4);
        System.out.println(task2.getNumberOfSqrt());
        System.out.println(task2.getY(3));
    }

}

