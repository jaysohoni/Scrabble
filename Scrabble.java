import java.util.*;
public class Scrabble
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] words = new String[size];
        int[] count = new int[size];
        for(int i = 0; i < size; i++)
        {
            words[i] = sc.next().toLowerCase();
            int c = 0;
            for(int j = 0; j < words[i].length(); j++)
            {
                
                char b = words[i].charAt(j);
                if(b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'l' || b == 'n' || b == 's' || b == 't' || b == 'r')
                {
                    c = c + 1;
                }
                else if(b == 'd' || b == 'g')
                {
                    c = c + 2;
                }
                else if(b == 'b' || b == 'c' || b == 'm' || b == 'p')
                {
                    c = c + 3;
                }
                else if(b == 'f' || b == 'h' || b == 'v' || b == 'w' || b == 'y')
                {
                    c = c + 4;
                }
                else if(b == 'k')
                {
                    c = c + 5;
                }
                else if(b == 'j' || b == 'x')
                {
                    c = c + 8;
                }
                else if(b == 'q' || b == 'z')
                {
                    c = c + 10;
                }
                
                
            }
            count[i] = c;
            
        }
        
        int temp = 0;
        String t = "";
        for(int i = 1; i < count.length; i++)
        {
            for(int j = 0; j < count.length-1; j++)
            {
                if(count[j] > count[j+1])
                {
                    temp = count[j];
                    count[j] = count[j+1];
                    count[j+1] = temp;
                    
                    t = words[j];
                    words[j] = words[j+1];
                    words[j+1] = t;
                }
                
                if(count[j] == count[j+1])
                {
                   ArrayList<String> wordList = new ArrayList();
                   wordList.add(words[j]);
                   wordList.add(words[j+1]);
                   Collections.sort(wordList);
                   words[j] = wordList.get(0);
                   words[j+1] = wordList.get(1);
                }
                
                
            }
        }
        
        for(int i = 0; i < words.length; i++)
        {
            System.out.println(words[i]);
        }
    }
    
    
    
    
    
}
