package Haskell.Java;
interface numTest{
    boolean test(int n);
}

interface NumericFunc{
    int func(int n);
}

interface ChangeStr{
    String func(String str);
}

public class Test {
    numTest ref = (n) -> (n>=10 && n<=20);

    NumericFunc fact = (n) -> {
        int result = 1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    };

    ChangeStr palabra = (str) ->{
        String strResult = str.replace(" ", "");
        return strResult;
    };

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.ref.test(15));
        System.out.println(obj.fact.func(5));
        System.out.println(obj.palabra.func("Hola mundo"));
    }
}