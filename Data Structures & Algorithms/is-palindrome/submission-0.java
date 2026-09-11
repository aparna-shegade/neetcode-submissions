class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]"," ");
        s=s.replaceAll(" ","");
        s=s.toLowerCase();
        System.out.print(s);
        int n=s.length();

        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}
