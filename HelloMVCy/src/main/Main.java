/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewsMessage;
import models.ModelMessage;
import controller.ControllerMessage;

public class Main {
    private static ViewsMessage viewsMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage controllerMessage;

    public static void main(String[] args) {
        ModelMessage modelMessage = new ModelMessage();
        ViewsMessage viewsMessage = new ViewsMessage();
        ControllerMessage controllerMessage = new ControllerMessage(modelMessage, viewsMessage);
    }
}

