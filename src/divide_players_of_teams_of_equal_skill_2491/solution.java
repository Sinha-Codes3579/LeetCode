package divide_players_of_teams_of_equal_skill_2491;
import java.util.*;

public class solution {
    public static long dividePlayers(int[] skill){
        Arrays.sort(skill);
        int n = skill.length;
        int totalSkill = skill[0] + skill[n - 1];
        long chemistrySum = 0;
        for(int i = 0; i < n/2; i++){
            if(skill[i] + skill[n - i - 1] != totalSkill){
               return -1;
            }
            chemistrySum += (long) (skill[i] * skill[n - i- 1]);
        }
        return chemistrySum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] skill = new int[n];
        for(int i = 0; i < n; i++){
            skill[i] = sc.nextInt();
        }
        long skills = dividePlayers(skill);
        System.out.println(skills);
    }
}
