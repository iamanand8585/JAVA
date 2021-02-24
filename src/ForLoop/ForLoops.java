package ForLoop;

public class ForLoops {
    public static void main(String[] args){
        //Print 1 to 100
        System.out.println("Printing 1 to 100");
        for(int i=1;i<=100;i=i+1){
            System.out.println(i);
        }

        //Print Even Numbers from 0 to 100
        System.out.println("Even Numbers from 0 to 100");
        for(int j=0;j<=100;j=j+2){
            System.out.println(j);
        }

        //Print 100 to 1
        System.out.println("Printing 100 to 1");
        for (int k=100;k>0;k--){
            System.out.println(k);
        }
    }
}
