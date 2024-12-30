import java.util.Arrays;

public class TaskListApplication {
    public static void main(String[] args) {
        Task[] tasks = new Task[] {
            new Task("Playing Minecraft", 30),
            new Task("Discovering the Meaning of Life", 60),
            new Task("Searching for the Lost Sock", 45),
            new Task("Mastering the Art of Pancake Flipping", 90),
            new Task("Contemplating Existence", 120),
            new Task("Assembling the Ultimate Sandwich", 15),
            new Task("Assembling the Ultimate Sandwich", 15),
            new Task("Solving Hunger (Making Dinner)", 60)
        };
        TaskList tl = TaskList.from(tasks);
        Out.println("Tasklist Size: "+tl.getSize());
        Out.println(tl);
        Out.println("\nAddSortedTask \"chopping Wood\" duration:20");
        tl.addSorted(new Task("chopping Wood", 20));
        Out.println("\nTasklist Size: "+tl.getSize());
        Out.println(tl);
        Out.println("\nShortest Task: \t"+tl.getShortestTask());
        Out.println("\nLongest Task: \t"+tl.getLongestTask());
        Out.println("\nRemove tasks with duration 15: \tremoved "+tl.remove(15)+" task(s)");
        Out.println("\nRemove longestTask: \tremoved "+tl.remove(tl.getLongestTask().duration)+" task(s)");
        Out.println("\nTasklist within 50 and 100 asArray:\n\t"+Arrays.toString(tl.getTaskListWithin(50, 100).asArray()));
        Out.println("\ncleared tasklist!  -cleared "+tl.clear()+" task(s)");
        Out.println("\nTasklist Size: "+tl.getSize());
        Out.println("Tasklist: "+tl);
    }
}
