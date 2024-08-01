package number_of_senior_citizens;

public class Solution {
    public int countSeniors(String[] details){
        int count = 0;
        for(String detail : details){
            if(details.length < 14){
                //If the string is shorter than expected, skip it
                continue;
            }
            //Extract the age part(12th and 13th characters
            String ageString = detail.substring(11, 13);
            try{
                int age = Integer.parseInt(ageString);
                if(age > 60){
                    count++;
                }
            }catch(NummberFormatException e){
                //Handle the case where age is not a valid integer
                continue;
                //Skip the detail if age is not a valid number
            }
        }
        return count;
    }
}
