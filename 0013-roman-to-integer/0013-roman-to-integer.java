class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        int ans = 0;
        int lastInt = 0;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(i!=0 && (map.get(ch) > map.get(s.charAt(i-1))) ){
                int temp = map.get(ch) - lastInt;
                ans -= lastInt;
                ans += temp;
            }
            else{
                ans += map.get(ch);
            }
            lastInt = map.get(s.charAt(i));
        }   
        return ans;
    }
}