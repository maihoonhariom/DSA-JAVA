/*
            1
           212
          32123
         4321234
        543212345
 */


public class palDromNum {
    public static void main(String args[]){
        int n =5;
        int count=n;
        for(int i=n; i>0; i--){
            count=n-i+1;
            for(int j=1; j<=n*2-i; j++){
                if(j>=i){
                    
                    if(j<=n){
                        System.out.print(count--);
                        if (j==n) {
                            count=1;
                        }
                    }
                    else{                        
                        System.out.print(++count);
                    }
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
