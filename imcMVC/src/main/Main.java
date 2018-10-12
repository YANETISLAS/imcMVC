
package main;
import model.ModelImc;
import views.ViewsImc;
import controllers.ControllersImc;


public class Main {
    private static ViewsImc viewsImc;
    private static ModelImc modelImc;
    private static ControllersImc controllersImc;

  
public static void main(String[] args) {
    ModelImc modelImc = new ModelImc();
    ViewsImc viewsImc = new ViewsImc();
    ControllersImc controllersImc = new ControllersImc(modelImc, viewsImc);
    }
}
