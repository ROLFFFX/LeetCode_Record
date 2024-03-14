package Medium;

import java.util.Arrays;

public class Divide_Players_Into_Teams_of_Equal_Skill {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sum = (long)skill[0] + (long)skill[skill.length - 1];
        long prod = (long)skill[0] * (long)skill[skill.length - 1];
        int i = 1;
        int j = skill.length - 2;
        while (i < j){
            if ((long)skill[i] + (long)skill[j] != sum){
                return -1;
            }
            prod += (long)skill[i] * (long)skill[j];
            i++;
            j--;
        }
        return prod;
    }
}
