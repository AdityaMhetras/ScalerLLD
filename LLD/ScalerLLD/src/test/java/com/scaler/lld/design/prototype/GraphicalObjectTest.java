package com.scaler.lld.design.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GraphicalObjectTest {

    @Test
    public void testCloneObject() {
        //step 3- create the prototype
        BackgroundObject prototype = new BackgroundObject(0,0,0,0,BackgroundObjectType.TREE);

        //step 4- clone prototype to create a forest
        BackgroundObject clone = prototype.clone();

        List<BackgroundObject> forest = new ArrayList<>();
        for(int i = 0; i < 1000; i++) {
            BackgroundObject treeClone = prototype.clone();
            treeClone.setX(new Random().nextInt());
            treeClone.setY(new Random().nextInt());
            forest.add(treeClone);
        }

        Assert.assertNotNull("if clone method is called clone is not null", clone);

        clone.setX(1);
        clone.setY(1);

        Assert.assertNotEquals("if prototype is cloned, clone and prototype should not be same",prototype.hashCode(),clone.hashCode());

        Assert.assertNotEquals("if prototype is cloned, clone and prototype should not be same",prototype.getX(),clone.getX());
        Assert.assertNotEquals("if prototype is cloned, clone and prototype should not be same",prototype.getY(),clone.getY());


    }
}
