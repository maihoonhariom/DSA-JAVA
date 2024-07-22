/*
          1
         2 2
        3 3 3
       4 4 4 4
      5 5 5 5 5
 */
          


public class numberPyramid {
    

    public static boolean iseven(int num){
        if(num%2==0){
            return true;
        }
        else 
        return false;
    }
    public static void main(String args[]){
        int n=5 ;
        int count =0;
        for(int i=n; i>0; i--){
            count++;
            for(int j=1; j<=n*2-i; j++){
                if(j>=i){
                    if(iseven(i)){
                        if(iseven(j))
                        System.out.print(count);
                        else
                        System.out.print(" ");
                    }
                    else{
                        if (!iseven(j)) 
                        System.out.print(count);
                        else
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
