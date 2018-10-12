
package main;
import models.ModelOperaciones;
import views.ViewOperaciones;
import controllers.ControllerOperaciones;

 class Main {
    private static ViewOperaciones viewOperaciones;
    private static ModelOperaciones modelOperaciones;
    private static ControllerOperaciones controllerOperaciones;
   
    public static void main(String[] args) {
         ModelOperaciones modelOperaciones = new ModelOperaciones();
         ViewOperaciones viewOperaciones = new ViewOperaciones();
         ControllerOperaciones controllerOperaciones = new ControllerOperaciones(modelOperaciones, viewOperaciones);
    }  
}
