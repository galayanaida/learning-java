package Hayk.Hertevtsyan.lesson03;

public class APP_232 {
    public static void main(String[] args){
        int count = 0;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,0,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=0; i < massive.length; i=i+1) {
            if (massive[i]%2 == 0 && massive[i] !=0) {
//                System.out.println(massive[i]);
                count=count + 1;
            }
        }
        System.out.println("Զույգ տարրերի քանակը = " + count);
    }
}
