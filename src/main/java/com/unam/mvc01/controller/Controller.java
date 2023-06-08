/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unam.mvc01.controller;

import com.unam.mvc01.view.View;
import com.unam.mvc01.model.Model;
import com.unam.mvc01.view.View2;
import java.util.ArrayList;

/**
 *
 * @author HSaavedraH
 */
public class Controller {
    private View2 myView;
    private Model myModel;

    public Controller(View2 myView, Model myModel) {
        this.myView = myView;
        this.myModel = myModel;
    }

    public ArrayList<Integer> getLista() {
        return myModel.getLista();
    }

    public void updateView() {
        myView.showData(myModel.getLista());
    }


}
