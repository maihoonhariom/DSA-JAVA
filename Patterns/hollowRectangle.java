import java.util.*;
class hollowRectangel{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scan.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = scan.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0 || i==row-1 || j==0 || j==col-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scan.close();
    }
}