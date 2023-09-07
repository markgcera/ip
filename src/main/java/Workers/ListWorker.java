package Workers;

import Tasks.Task;

import java.util.ArrayList;

public class ListWorker extends TaskWorker {
    /**
     * This method prints out the Tasks that are inside the ArrayList.
     * @param taskList
     */
    @Override
    public String work(ArrayList<Task> taskList) {
        String output = "";
        int count = 1;
        for (Task task : taskList) {
            if (task == null) {
                break;
            } else {
                output += count++ + ". " + task + "\n";
            }
        }
        return output;
    }
}