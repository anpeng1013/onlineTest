
import java.util.*;

/**
 * @ClassName: Main.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/31 15:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] supported = new int[n + 1];
        int[] fans = new int[k];
        int i = 1;
        int j = 0;
        while(n > 0){
            int x = input.nextInt();
            int y = input.nextInt();
            supported[i] = x + 2 * y;
            n--;
            i++;
        }
        for(; j < k; j++){
            int max = supported[1];
            int index = 1;
            for( i = 1; i < supported.length; i++){
                 if(supported[i] > max){
                     max = supported[i];
                     index = i;
                 }
            }
            supported[index]=0;
            fans[j] = index;
        }
        Arrays.sort(fans);
        for (int fan : fans) {
            System.out.print(fan + " ");
        }

    }


//    static HashSet<String > keywords = new HashSet<>();
//    static class Commodity{
//        String name;
//        int keywordCount;
//        int index;
//
//        public Commodity(String name, int keywordCount, int index){
//            this.name = name;
//            this.keywordCount = keywordCount;
//            this.index = index;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int commodityCount = input.nextInt();
//        int queryCount = input.nextInt();
//        input.nextLine();
//        String[] keys = input.nextLine().split(" ");
//        Collections.addAll(keywords,keys);
//        PriorityQueue<Commodity> queue = new PriorityQueue<>(
//                (o1, o2) -> {
//                    if(o1.keywordCount != o2.keywordCount){
//                        return o2.keywordCount - o1.keywordCount;
//                    }else{
//                        return o1.index - o2.index;
//                    }
//                }
//        );
//
//        for (int i = 0; i < commodityCount; i++) {
//            int keywordCount = 0;
//            String name = input.next();
//            int count = input.nextInt();
//            for( int j=0; j < count; j++){
//                String temp = input.next();
//                if(keywords.contains(temp)){
//                    keywordCount++;
//                }
//            }
//            queue.add(new Commodity(name,keywordCount,i));
//        }
//
//        while(!queue.isEmpty()){
//            Commodity commodity = queue.poll();
//            System.out.println(commodity.name);
//        }
//    }
}
