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
public class ToDoList {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        // Code starts here
        Model model = new Model();
        ListViewController viewController = new ListViewController(model);
        viewController.setVisible(true);
      }
    
}
