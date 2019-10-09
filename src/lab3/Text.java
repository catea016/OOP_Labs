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

}
