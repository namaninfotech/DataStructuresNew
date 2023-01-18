public class CheckIfTwoStringArraysAreEquivalent {

    static  Boolean find(String[] word1,String[] word2)
    {
        StringBuilder first=new StringBuilder();
        StringBuilder second=new StringBuilder();

        for(String word:word1)
        {
            first.append(word);
        }

        for(String word:word2)
        {
            second.append(word);
        }

        return first.toString().equals(second.toString());

    }

    public static  void main(String ars[])
    {
        String[] word1={"ab","c"};
        String[] word2={"a","bc"};

        System.out.println(find(word1,word2));
    }
}
