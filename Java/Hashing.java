import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
import java.util.Arrays;

class Hashing {
    public static List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();

        for(int num : nums){ map.put(num,map.getOrDefault(num,0)+1); }
        for(int num : map.keySet()){
            List<Integer> li = new ArrayList<>();
            li.add(num);
            li.add(map.get(num));
            res.add(li);
        }
        return res; 
    }

    public static int mostFrequentElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0, count = 0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(count < map.getOrDefault(num,0)){
                max = num;
                count = map.get(num);
            }
        }
        return max;
    }

    public static Map<Integer, Long> countFrequenciesOptimized(int[] nums){
        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return map;
    }



    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){nums[i] = scan.nextInt();}

        List<List<Integer>> result = new ArrayList<>(countFrequencies(nums));
        System.out.println(result);
        System.out.println();
        System.out.println(mostFrequentElement(nums));
        System.out.println();
        System.out.println(countFrequenciesOptimized(nums));
    }
}