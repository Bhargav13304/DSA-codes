import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Activity> activityList = new ArrayList<>();

    // Sample Activities - you may modify or extend this list
    activityList.add(new Activity("A1", 1, 3));
    activityList.add(new Activity("A2", 2, 5));
    activityList.add(new Activity("A3", 4, 7));
    activityList.add(new Activity("A4", 1, 8));
    activityList.add(new Activity("A5", 5, 9));
    activityList.add(new Activity("A6", 8, 9));
    activityList.add(new Activity("A7", 9, 11));
    activityList.add(new Activity("A8", 11, 14));

    // Execute Activity Selection
    ActivitySelection.activitySelection(activityList);
  }
}
