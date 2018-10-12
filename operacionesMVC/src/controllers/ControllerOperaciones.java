
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelOperaciones;
import views.ViewOperaciones;
import extras.DataValidation;

public class ControllerOperaciones implements ActionListener{
  ModelOperaciones modelOperaciones;
  ViewOperaciones viewOperaciones;
  DataValidation dataValidation = new DataValidation();

    public ControllerOperaciones(ModelOperaciones modelOperaciones, ViewOperaciones viewOperaciones) {
        this.modelOperaciones = modelOperaciones;
        this.viewOperaciones = viewOperaciones;
        this.viewOperaciones.jb_suma.addActionListener(this);
        this.viewOperaciones.jb_resta.addActionListener(this);
        this.viewOperaciones.jb_multiplicacion.addActionListener(this);
        this.viewOperaciones.jb_division.addActionListener(this);
        this.viewOperaciones.jb_modulo.addActionListener(this);
        initComponets();
}
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == viewOperaciones.jb_suma){
            jb_suma_action_performed();
        }
       if(e.getSource() == viewOperaciones.jb_resta){
            jb_resta_action_performed();
        }
       if(e.getSource() == viewOperaciones.jb_multiplicacion){
            jb_multiplicacion_action_performed();
        }
       if(e.getSource() == viewOperaciones.jb_division){
            jb_division_action_performed();
        }
       if(e.getSource() == viewOperaciones.jb_modulo){
            jb_modulo_action_performed();
        }
       
}
    private void initComponets() {
        viewOperaciones.setVisible(true);
        viewOperaciones.jtf_numero1.setText(String.valueOf(modelOperaciones.getNumero1()));
        viewOperaciones.jtf_numero2.setText(String.valueOf(modelOperaciones.getNumero2()));
        
    }

    private void jb_suma_action_performed() {
       modelOperaciones.setNumero1(dataValidation.string2Float(viewOperaciones.jtf_numero1.getText()));
       modelOperaciones.setNumero2(dataValidation.string2Float(viewOperaciones.jtf_numero2.getText()));
       modelOperaciones.suma();
       viewOperaciones.jl_resultadoOp.setText(String.valueOf(modelOperaciones.getResultado()));
    }

    private void jb_resta_action_performed() {
       modelOperaciones.setNumero1(dataValidation.string2Float(viewOperaciones.jtf_numero1.getText()));
       modelOperaciones.setNumero2(dataValidation.string2Float(viewOperaciones.jtf_numero2.getText()));
       modelOperaciones.resta();
       viewOperaciones.jl_resultadoOp.setText(String.valueOf(modelOperaciones.getResultado()));
    }

    private void jb_multiplicacion_action_performed() {
       modelOperaciones.setNumero1(dataValidation.string2Float(viewOperaciones.jtf_numero1.getText()));
       modelOperaciones.setNumero2(dataValidation.string2Float(viewOperaciones.jtf_numero2.getText()));
       modelOperaciones.multiplicacion();
       viewOperaciones.jl_resultadoOp.setText(String.valueOf(modelOperaciones.getResultado()));
    }

    private void jb_division_action_performed() {
       modelOperaciones.setNumero1(dataValidation.string2Float(viewOperaciones.jtf_numero1.getText()));
       modelOperaciones.setNumero2(dataValidation.string2Float(viewOperaciones.jtf_numero2.getText()));
       modelOperaciones.division();
       viewOperaciones.jl_resultadoOp.setText(String.valueOf(modelOperaciones.getResultado()));
    }

    private void jb_modulo_action_performed() {
       modelOperaciones.setNumero1(dataValidation.string2Float(viewOperaciones.jtf_numero1.getText()));
       modelOperaciones.setNumero2(dataValidation.string2Float(viewOperaciones.jtf_numero1.getText()));
       modelOperaciones.modulo();
       viewOperaciones.jl_resultadoOp.setText(String.valueOf(modelOperaciones.getResultado()));
    }
}
    
