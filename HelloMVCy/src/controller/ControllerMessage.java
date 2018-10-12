
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMessage;
import views.ViewsMessage;

public class ControllerMessage implements ActionListener  {
    ModelMessage modelMessage;
    ViewsMessage viewsMessage;

    public ControllerMessage(ModelMessage modelMessage, ViewsMessage viewsMessage) {
        this.modelMessage = modelMessage;
        this.viewsMessage = viewsMessage;
        this.viewsMessage.jb_nombre.addActionListener(this);
        initComponets();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == viewsMessage.jb_nombre){
           jb_nombre_actionPerformed();
       } 
    }
    public void jb_nombre_actionPerformed(){
        modelMessage.setName(viewsMessage.jtf_nombre.getText());
        viewsMessage.jl_hello.setText("Hello " + modelMessage.getName());
    }
    public void initComponets(){
        viewsMessage.setVisible(true);
        viewsMessage.jtf_nombre.setText(modelMessage.getName());   
    }
 
}