import java.sql.SQLOutput;
import java.util.* ;
import java.io.* ;

public class Question3 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter the file path : ");
        String fileName = scn.nextLine() ;

        File file = new File(fileName) ;

        int count=0;
        String input_word;
        try{
            BufferedReader br=new BufferedReader(new FileReader(f));
            System.out.println("Enter the Word to be Searched:");
            input_word=scn.nextLine();
            String line;
            while((line= br.readLine())!=null){
                String words[]=line.split(" ");
                for(String word:words){
                    if(word.equalsIgnoreCase(input_word)){
                        count++;
                    }
                }
            }
            System.out.println("Count of input word: "+count);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }


