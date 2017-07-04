import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("INPUT.txt"));

        if(scanner.hasNext()){
        String p1,p2;
        p1 = scanner.nextLine();
        p2 = scanner.nextLine();

        Map templates = new HashMap<String,String>();
        templates.put('0',"0");
        templates.put('1',"1");
        templates.put('2',"2");
        templates.put('3',"3");
        templates.put('4',"4");
        templates.put('5',"5");
        templates.put('6',"6");
        templates.put('7',"7");
        templates.put('8',"8");
        templates.put('9',"9");
        templates.put('a',"0123");
        templates.put('b',"1234");
        templates.put('c',"2345");
        templates.put('d',"3456");
        templates.put('e',"4567");
        templates.put('f',"5678");
        templates.put('g',"6789");
        templates.put('?',"0123456789");

        int result = 1;
        for(int i = 0; i < p1.length(); i++){
            int count = 0;
            String p1_value = templates.get(p1.charAt(i)).toString();
            String p2_value = templates.get(p2.charAt(i)).toString();
            for(int j=0;j<p1_value.length();j++){
                for(int k=0;k<p2_value.length();k++){
                    if(p1_value.charAt(j) == p2_value.charAt(k)){
                        count++;
                    }
                }
            }
            result *= count;
        }

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("OUTPUT.txt"), "UTF-8"));
            out.write(Integer.toString(result));
            out.close();
        }
        else{
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("OUTPUT.txt"), "UTF-8"));
            out.write(Integer.toString(0));
            out.close();
        }
    }
}
