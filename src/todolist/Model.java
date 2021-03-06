/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;
import java.util.Date;
/**
 *
 * @author kevindeng
 */
public class Model {
    int taskCount = 0;
    TaskObjects[] tasks = new TaskObjects[100];
    FileHelper helper = new FileHelper();
    
    Model() {
        // Constructor
        //tasks = helper.readTasks();
        String lines[] = helper.readTasks();
        taskCount = lines.length;
        // loop through each line and create a new task out of it
        for (int i = 0; i < lines.length; i++){
            //creates the ith new task
            tasks[i] = new TaskObjects();
            //split the line where the # is
            String taskLine[] = lines[i].split("#");
            //use the first part to set the new task title
            tasks[i].setTitle(taskLine[0]);
            //use the second part to set the new task description
            tasks[i].setDescription(taskLine[1]);
        }
        
        
    }
    
    void add(String title, String description){
        TaskObjects task = new TaskObjects();
        task.setDescription(description);
        task.setTitle(title);
        
        // add my task to the tasks array
        tasks[taskCount] = task;
        taskCount = taskCount + 1;
        helper.writeTasks(getTasks());
    }
    
    void remove(int index){
        // This is getting into SL IB Comp Sci level now...
        
        for (int i = index; i < taskCount; i = i + 1) {
            tasks[i] = tasks[i + 1];
        }
        
        taskCount = taskCount - 1;
        helper.writeTasks(getTasks());
        
    }
    
    void edit(int index, String title, String description) {
        // how can we update the information of the
        // task at index?
        
        tasks[index].setDescription(description);
        tasks[index].setTitle(title);
        helper.writeTasks(getTasks());
    }
    
    String[] getTasks() {
        // Create a new string array
        String[] tmpTasks = new String[taskCount];
        // Loop through the tasks and add a string representation
        // of each one to the new array
        
        for (int i = 0;i < taskCount; i = i + 1) {
            // Assign a string representation if the ith task
            // to the ith element of tmpTasks
            tmpTasks[i] = tasks[i].toString();
        }
        // return the new array
        return tmpTasks;
    }
    
    String[] getTaskValues(int index) {
        String[] values = new String[2];
        values[0] = tasks[index].getTitle();
        values[1] = tasks[index].getDescription();
        return values;
    }
    
    String[] getTitles() {
        String[] titles = getTasks();
        for(int i = 0; i < taskCount; i++){
            titles[i] = titles[i].split("#")[0];
        }
        return titles;
    }
            
}

