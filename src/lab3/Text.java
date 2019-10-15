package lab3;

public class Text {

    public static int wordCount(String str)
    {
        int count=0;

        char ch[]= new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i]= str.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)))
                count++;
        }
        return count;
    }
    public static int sentencesCount(String str){
        int count = 0;
        char ch[]= new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i]= str.charAt(i);
            if( ((i>0)&&(ch[i]!='.')&&(ch[i-1]=='.')) || ((ch[0]!='.')&&(i==0)) )
                count++;
        }
        return count;

    }

    public static int getVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
    public static int getConsonants(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if ((str.charAt(i) >= 'a' && str.charAt(i)<='z') &&(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
                    && str.charAt(i) != 'o' && str.charAt(i) != 'u'))
            {
                count++;
            }
        }
        return count;

    }
    static String getTheLongestWord(String str) {
        int max = 0;
        String longestWord = "";
        String[] myString = str.split(" ");
        for (String s : myString) {
            if (s.length() > max) {
                max = s.length();
                longestWord = s;
            }
        }

        return longestWord;
    }
    static void getRepeatedWords(String str){
        String[] words=str.split(" ");  //Split the word from String
        int wrc=1;    //Variable for getting Repeated word count

        for(int i=0;i<words.length;i++) //Outer loop for Comparison
        {
            for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
            {

                if(words[i].equals(words[j]))  //Checking for both strings are equal
                {
                    wrc=wrc+1;    //if equal increment the count
                    words[j]="0"; //Replace repeated words by zero
                }
            }
            if(words[i]!="0"  && wrc >2)
                System.out.println(words[i]+"--"+wrc); //Printing the word along with count
            wrc=1;

        }
    }

}
