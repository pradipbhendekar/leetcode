class Solution {
    public int romanToInt(String s) {
        // using the map and using a array we can solve this problem als
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if(s.length()==1){
            return map.get(s.charAt(0));
        }

        int sum = 0;
        // here we are traverse the strig
        for (int i = 0; i < s.length() - 1; i++) {
            char firstchar = s.charAt(i);
            char secondchar = s.charAt(i + 1);
            int a = map.get(firstchar);
            int b = map.get(secondchar);
            if (map.get(firstchar) < map.get(secondchar)) {
                sum = sum + (b - a);
                i++;
            } else {
                sum = sum + a;
            }
            
        }

        if (s.length()>1 && map.get(s.charAt(s.length() - 2)) >= map.get(s.charAt(s.length() - 1))) {
                sum = sum + map.get(s.charAt(s.length() - 1));
            }

        return sum;
    }
}