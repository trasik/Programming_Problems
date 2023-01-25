package Jan252023;

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Last Stone Weight
        int[] stones1 = {2,7,4,1,8,1};
        int[] stones2 = {1};

        System.out.println("Last Stone Value: " + lastStoneWeight(stones1));
        System.out.println("Last Stone Value: " + lastStoneWeight(stones2));
        //Problem 2: Top K Frequent Words
        String[] words1 = {"i","love","leetcode","i","love","coding"};
        int k1 = 2;

        String[] words2 = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k2 = 4;

        printList(topKFrequent(words1, k1));
        printList(topKFrequent(words2, k2));
    }

    //Problem 1: Last Stone Weight
    private static int lastStoneWeight(int[] stones) {
        if(stones == null || stones.length == 0) return 0;

        PriorityQueue<Integer> stonesPQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int s : stones) stonesPQ.add(s);

        while(!stonesPQ.isEmpty()) {
            int x = stonesPQ.poll();
            if(stonesPQ.isEmpty()) {
                return x;
            }
            int y = stonesPQ.poll();

            stonesPQ.add(x - y);
        }

        return stonesPQ.poll();
    }

    //Problem 2: Top K Frequent Words
    private static List<String> topKFrequent(String[] words, int k) {
        List<String> kResults = new ArrayList<>();
        Map<String, Integer> freqMap = new HashMap<>();

        for(String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        Queue<StringPair> wordsPQ = new PriorityQueue<>((a, b) -> {
            if(a.getFreq() != b.getFreq()) return b.getFreq() - a.getFreq();
            return a.getValue().compareTo(b.getValue());
        });

        for(String word : freqMap.keySet()) {
            wordsPQ.add(new StringPair(word, freqMap.get(word)));
        }

        for(int i = 0; i < k; i++) {
            kResults.add(wordsPQ.poll().getValue());
        }

        return kResults;
    }

    private static void printList(List<String> list) {
        System.out.print("[");
        for(int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) System.out.print("\"" + list.get(i) + "\"");
            else System.out.print("\"" + list.get(i) + "\",");
        }
        System.out.print("]");
        System.out.println();
    }
}
