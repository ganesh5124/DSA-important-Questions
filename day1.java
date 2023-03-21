import java.util.Arrays;

class Day {
    public int numSum(int num){
        return num+100;
    }
    public int sumOfDigits(int n){
                if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        return n%10 + sumOfDigits(n/10);
    }

    public int power(int base, int exp){
        if(exp ==0){
            return 1;
        }
        return base*power(base, exp-1);
    }

    public int gcd(int a,int b){
        if(a<0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public int decimalToBinary(int n){
        if(n==0){
            return 0;
        }
        return n%2 + 10* decimalToBinary(n/2);
    }
    public int factoril(int n){
        if(n<0 ){
            return -1;
        }
        if(n==0){
            return 1;
        }
        return n * factoril(n-1);
    }
    public boolean someRecursive(int[] arr, OddFunction odd){
        if(arr.length ==0){
            return false;
        }else if(odd.run(arr[0]) ==false){
            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
        }else{
            return true;
        }
    }
    public String reverseofString(String str){
        if(str.isEmpty())
            return str;
        return reverseofString(str.substring(1))+ str.charAt(0);
    }
    public int maxofArray(int arr[], int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1], maxofArray(arr, n-1));
    }

    void spofArray(int[] arr){
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            product *=arr[i];
        }
        System.out.println("sum of Array "+ sum + " And its product is "+ product);
    }
    // public 
    public static void main(String args[]){
         Day day = new Day();
        // var result = day.numSum(123);
        // sumOfDigits
        // int result = day.sumOfDigits(-1080);
        // GCD
        // var result = day.gcd(2, 4);
        // Decimal To Binary
        // var binary = day.decimalToBinary(10);
        // Factorial of a number
        // var fact = day.factoril(2);
        OddFunction odd = new OddFunction();
        int arr[] ={4,6,8,5};
        var some = day.someRecursive(arr, odd );
        var str1 = day.reverseofString("hello");
        var val = day.maxofArray(arr, 4);

        day.spofArray(arr);
        // System.out.println(val);
        
    }
}








