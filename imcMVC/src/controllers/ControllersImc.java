package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.ModelImc;
import views.ViewsImc;

public class ControllersImc implements ActionListener{
    ModelImc modelImc;
    ViewsImc viewsImc;
    
public ControllersImc(ModelImc modelImc, ViewsImc viewsImc) {
    this.modelImc = modelImc;
    this.viewsImc = viewsImc;
    this.viewsImc.jb_calcular.addActionListener(this);
    initComponets();
}

    @Override
    public void actionPerformed(ActionEvent e) {
               if(e.getSource() == viewsImc.jb_calcular){
            jb_calcular_action_performed();
        }
    }
    
    public void jb_calcular_action_performed(){
       modelImc.setImc(viewsImc.jtf_estatura.getText());
       modelImc.setImc(viewsImc.jtf_peso.getText());
       viewsImc.jl_imc_total.setText("Su IMC es:" + modelImc.getImc());
       viewsImc.jl_resultado.setText("De acuerdo con el IMC, tiene:" + modelImc.getImc());  
    }
    
    public void initComponets(){
        viewsImc.setVisible(true);
        viewsImc.setVisible(true);
        viewsImc.jtf_estatura.setText(modelImc.getImc());
        viewsImc.jtf_peso.setText(modelImc.getImc());
    }
} 