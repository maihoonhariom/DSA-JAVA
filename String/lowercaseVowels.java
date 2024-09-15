import java.util.*;
class lowercaseVowels{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string here: ");
        String st= scan.nextLine();
        scan.close();
        int count=0;
        for(int i = 0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }

        System.out.print(count);

    }
}