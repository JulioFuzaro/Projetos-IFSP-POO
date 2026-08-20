package app;

public class AutoFatorial {
    public static Integer fatorial(Integer n){
        Integer fat = 1;

        for( Integer i = 1; i <= n; i++){
            fat = fat * i;
        }
        return fat;
    }
}
