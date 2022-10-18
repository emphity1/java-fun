import java.util.Scanner;


public class WordCounter {
    public static void main (String[] args){
        //scann the sentence
        System.out.println("Write your sentence: ");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        scan.close();
        userInput = userInput.trim(); //trim removes whitespace from both endings
        int count = 0;
        if(userInput.length()==0){
            count = 0;
        }else{
            count++; //count first word
            for(int i = 0; i<userInput.length(); i++){
                if(userInput.charAt(i)==' ' && userInput.charAt(i+1) != ' '){
                    count++;
                }
            }
        }
    System.out.println("Word count is : "+ count);
    }
    

}
