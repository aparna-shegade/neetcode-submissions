class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded=new StringBuilder();
        for(String s:strs)
        {
            encoded.append(s.length());
            encoded.append("#");
            encoded.append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
         List<String> decoded=new ArrayList<>();
         int i=0;
         while(i<str.length())
         {
            int j=str.indexOf("#",i);
            int length=Integer.parseInt(str.substring(i,j));
            int start=j+1;
            String s=str.substring(start,start+length);
            decoded.add(s);
            i=start+length;
         }
         return decoded;
    }
}
