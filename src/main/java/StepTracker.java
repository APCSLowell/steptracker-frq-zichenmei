import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private ArrayList <Integer> myDailySteps;
 private int active;
 public StepTracker(int steps){
  myDailySteps=new ArrayList<Integer>();
  active=steps;
 }
 public void addDailySteps(int steps){
  myDailySteps.add(steps);
 }
 public int activeDays(){
  int days=0;
  for(int i=0;i<myDailySteps.size();i++){
   if(myDailySteps.get(i)>=active){
    days++;
   }
  }
  return days;
 }
 public double averageSteps(){
  if(myDailySteps.size()==0){
   return 0;
  }
  double steps=0;
  for(int i=0;i<myDailySteps.size();i++){
   steps+=myDailySteps.get(i);
  }return steps/myDailySteps.size();
  
  
 }
 
} 
