class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return ans;
    }
}