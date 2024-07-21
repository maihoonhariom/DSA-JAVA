/*
                *             * 
                * *         * *
                * * *     * * *
                * * * * * * * *
                * * * * * * * *
                * * *     * * *
                * *         * *
                *             *
 */

public class butterfly {
    public static void main(String args[]){
        int n = 4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n*2; j++){
                if(j<=i || j>=n*2-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=n; i>0; i--){
            for(int j=1; j<=n*2; j++){
                if(j<=i || j>=n*2-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
