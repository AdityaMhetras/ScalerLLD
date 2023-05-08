package com.scaler.lld.design.abstractfactory.interfaces;

import com.scaler.lld.design.abstractfactory.models.Button;
import com.scaler.lld.design.abstractfactory.models.Checkbox;

//step 3 create abstract factory interface
public interface FormFactory {

    //step 3.5 add factory methods for Products
    Button createButton();

    Checkbox createCheckbox();
}

//Exanple families
//form btm , chkbox, input
// theme cars,box,bin
//database - database, connectionpool driver