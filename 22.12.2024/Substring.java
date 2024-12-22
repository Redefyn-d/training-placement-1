class Substring{
    public int strStr(String h, String need) {
        for(int i = 0, j = need.length(); j<=h.length(); i++,j++){
            if(h.substring(i,j).equals(need)){
                return i;
            }
        }
        return -1;
    }
}
