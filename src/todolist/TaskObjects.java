/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

/**
 *
 * @author kevindeng
 */
public class TaskObjects {
    private String description;
    private String title;
    
    public String getDescription(){
        return description;
    }
    
    
    @Override
    public String toString(){
        return title + "#" + description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
}
