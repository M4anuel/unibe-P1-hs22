public class fibonacci {
    public static void main(String[] args) {
        try{
        for (int i = 1; i <= 50; i++){
            System.out.println(fib(i)+"");
        }
        }
        catch (StackOverflowError ignored){}
    }
    static long fib(int i){
        if (i == 1)return 2;
        if (i == 2 || i == 3)return 1;
        return fib(i - 1)+fib(i - 2);
    }
}
