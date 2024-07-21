public class Triangel01 {
    public static void main(String args[]){
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(iseven(i) && iseven(j) || !iseven(i) && !iseven(j))
                System.out.print("1 ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static boolean iseven(int num){
        if(num%2==0)
        return true;
        else
        return false;
    }
    
}
