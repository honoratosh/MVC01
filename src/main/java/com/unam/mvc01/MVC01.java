package com.unam.mvc01;

import com.unam.mvc01.DataFile.TextFile;
import com.unam.mvc01.controller.Controller;
import com.unam.mvc01.model.Model;
import com.unam.mvc01.view.View;
import com.unam.mvc01.view.View2;

public class MVC01 {

    public static void main(String[] args) {
        
        //View aView = new View();
        View2 aView2 = new View2();
        Model aModel = new Model();
        Controller aController = new Controller(aView2, aModel);
        TextFile aTextFile = new TextFile();
        aModel.setLista(aTextFile.getLista());
        
        aController.updateView();
        aView2.setVisible(true);

    }
}
