import java.lang.Integer;
import java.util.*;


public class test {

    public static void main(String[] args) {
        System.out.println("\nNormal List");
        String [] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for(String item : weekDays){
            System.out.println(item);
        }

        System.out.println("\nReversed List");
        ArrayList <String> weekDaysReversed = new ArrayList<>();
        weekDaysReversed.addAll(Arrays.asList(weekDays));
        Collections.reverse(weekDaysReversed);
        for(String item : weekDaysReversed){
            System.out.println(item);
        }

        List<String> daysToRemove = new ArrayList<>();
        daysToRemove.add("Thursday");
        daysToRemove.add("Tuesday");

        for(String item : daysToRemove){
            int indexWordToRemove = weekDaysReversed.lastIndexOf(item);
            if(indexWordToRemove!= -1){
                weekDaysReversed.remove(indexWordToRemove);
            }
        }

        System.out.println("\nWeekDays without Thursday and Tuesday");
        for( String item: weekDaysReversed){
            System.out.println(item);
        }

        HashMap<String, Integer> daysToInt = new HashMap<>();
        for(int i = 0; i<= weekDays.length - 1 ; i++){
            daysToInt.put(weekDays[i], i+1);
        }

        if(daysToInt.containsKey("Wednesday")){
            System.out.println(daysToInt.get("Wednesday"));
        }
    }
}
