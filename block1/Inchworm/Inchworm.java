package SPWeekPrac.block1.Inchworm;
import java.util.HashSet;
import java.util.Set;

public class Inchworm {
    /**
     * Returns the number of times the inchworm stops to eat leaves.
     *
     * @param branch the length of the branch in inches
     * @param rest   the distance the inchworm travels before resting
     * @param leaf   the spacing of leaves on the branch
     * @return the number of leaves the inchworm eats
     */
    public int lunchtime(int branch, int rest, int leaf) {
        //caculate leaves
        Set<Integer> leafPostion = new HashSet<>();
        for(int i = 0; i <= branch; i+=leaf){
            leafPostion.add(i);
        }
        // System.out.println(leafPostion);

        int leafCount = 0;
        for(int i = 0; i <= branch; i+=rest){
            if (leafPostion.contains(i)) {
                leafCount += 1;
            }
        }
        // System.out.println(leafPostion);

        return leafCount;
    }
    // public static void main(String[] args) {
    //     Inchworm worm = new Inchworm();

    //     int branch = 1000;
    //     int rest = 7;
    //     int leaf = 3;

    //     int leavesEaten = worm.lunchtime(branch, rest, leaf);
    //     System.out.println(leavesEaten);
    // }
}

//https://chatgpt.com/share/6891853a-c3e8-8001-8976-80b4842580c8