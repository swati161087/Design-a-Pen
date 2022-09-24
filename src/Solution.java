import java.util.ArrayList;

public class Solution {
    public boolean isPalindrom(String s){

        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                return false;
            }

        }
        return true;
    }
    public void createPartition(String s, ArrayList<String> temp, ArrayList<ArrayList<String>> list){
        int n=s.length();
        if(n==0)
        {
            ArrayList<String> t=new ArrayList<String> (temp);
            list.add(t);
            return;
        }
        int [] ar=new int[1000000000];
        for(int j=1;j<=n;j++)
        {
            String sub=s.substring(0,j);
            if(isPalindrom(sub))
            {
                temp.add(sub);
                createPartition(s.substring(j),temp,list);
                temp.remove(temp.size()-1);
            }
        }
    }

    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>();
        ArrayList<String> s =new ArrayList<String>();
        createPartition(a,s,list);
        return list;
    }

}
