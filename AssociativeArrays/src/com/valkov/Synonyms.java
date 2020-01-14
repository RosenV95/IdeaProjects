package com.valkov;

        import java.util.*;

public class Synonyms {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        Map<String, List<String>>resMap=new LinkedHashMap<>();
        for(int i=0;i<num;i++){
            String key=scanner.nextLine();//add key
            String value=scanner.nextLine();//add value
            resMap.putIfAbsent(key,new ArrayList<>());//if the key doesnt exist, put it in the map along with an arraylist of synonyms
            resMap.get(key).add(value);//add the synonym to the arraylist

        }
        String pattern="%s - %s";
        for (Map.Entry<String, List<String>> kvp : resMap.entrySet()) {
            String key=kvp.getKey();
            String value=String.join(", ",kvp.getValue());
            System.out.println(String.format(pattern,key,value));


        }
    }
}
