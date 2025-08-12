import java.util.HashSet;
public class RugSizes{
    public int rugCount(int area){
        int count = 0;
        int width = 1;
        HashSet<Integer> memo = new HashSet<>();
        //area/width = int with no reminder
        //check is both even
        //check length exist in set
        //if added, count +1
        for(;width<=area;width++){
            double height = area/width;
            if(height%1 != 0){
                continue;
            }
            if((height%2== 0)&&(width%2== 0)&&(height != width)){
                continue;
            }
            if(memo.contains(width)){
                continue;
            }
            if(memo.contains((int)height)){
                continue;
            }
            System.out.println("Area: " + area);
            System.out.println(height%1 == 0);
            System.out.println(width + "-" +area/width);
            memo.add(width);
            memo.add(area/width);
            count += 1;
        }
        

        return count;
    }

    public static void main(String[] args) {
        RugSizes rs = new RugSizes();

        // 示例测试用例
        int[] testAreas = {4, 8};
        int[] expected = {2, 1};

        for (int i = 0; i < testAreas.length; i++) {
            int area = testAreas[i];
            int result = rs.rugCount(area);

            System.out.println("Test Case " + i + ":");
            System.out.println("Area: " + area);
            System.out.println("Expected: " + expected[i]);
            System.out.println("Got: " + result);
            System.out.println("-------------------");
        }
    }

}
