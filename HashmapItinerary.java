//Hashmap Find itinerary from the given list of departure and arrival airports
import java.util.*;

public class HashmapItinerary {
    public static String findStart(HashMap<String,String> hash){
        for(Map.Entry <String,String> e:hash.entrySet()){
            if(!hash.containsValue(e.getKey())){
                return e.getKey();
            }
        }
        return null;
    }
        public static void printmap(HashMap<String,String> hash){
            String start=findStart(hash);
            while(hash.containsKey(start)){
                System.out.print(start+" -->");
                start=hash.get(start); 
            }
            System.out.print(start);
        }
    public static void main(String[] args){
        HashMap<String,String> hash=new HashMap<>();
        //hash.put('A','A');
        hash.put("HKG","DXB");
        hash.put("FRA","HKG");
        hash.put("DEL","FRA");
        printmap(hash);
    } 
}

