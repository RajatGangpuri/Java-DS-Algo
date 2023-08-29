//Group Anagram

import java.util.*;
class GroupAnagram {
    public static List<List<String>> Anagrams(String[] string_list) {

        if (string_list.length == 0) {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : string_list) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] nums = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(Anagrams(nums));
    }
}