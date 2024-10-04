import java.util.Arrays;
import java.util.List;

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0, j = 0, c = 0;
        while (c < commands.size()) {
            if (commands.get(c).equals("RIGHT"))
                j++;
            else if (commands.get(c).equals("LEFT"))
                j--;
            else if (commands.get(c).equals("UP"))
                i--;
            else if (commands.get(c).equals("DOWN"))
                i++;
            c++;
        }
        return (i * n) + j;
    }

    public static void main(String args[]) {
        Solution obj = new Solution();
        // Correctly create the list without square brackets
        List<String> commands = Arrays.asList("DOWN","RIGHT","UP");
        System.out.println(obj.finalPositionOfSnake(3, commands));
    }
}