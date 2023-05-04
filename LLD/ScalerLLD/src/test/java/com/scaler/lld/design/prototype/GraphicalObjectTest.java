package com.scaler.lld.design.prototype;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GraphicalObjectTest {

    private static BackgroundRegistry registry;

    //setup and teardown
    //@Before will run this method before every test
    @Before
    public void setup() {
        registry = new BackgroundRegistry();
        BackgroundObject treeproto = new BackgroundObject(0,0,0,0,BackgroundObjectType.TREE);
        registry.store(BackgroundObjectType.TREE, treeproto);
    }

    @After
    public void tearDown() {
        registry = null;
    }

    @Test
    public void testCloneObject() {
        //step 3- create the prototype
        BackgroundObject prototype = new BackgroundObject(0,0,0,0,BackgroundObjectType.TREE);

        //step 4- clone prototype to create a forest
        BackgroundObject clone = prototype.clone();

        List<GraphicalObject> forest = new ArrayList<>();
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

    @Test
    public void testPrototypeWithRegistry() {
        //get tree prototype
        BackgroundObject prototype = registry.get(BackgroundObjectType.TREE);
        Assert.assertNotNull("If protoyype is created, object should not be null",prototype);

        BackgroundObject clone = prototype.clone();

        clone.setX(new Random().nextInt());
        clone.setY(new Random().nextInt());
        System.out.println("prototype.getX()"+prototype.getX()+", clone.getX():"+clone.getX());
        Assert.assertNotEquals("if prototype is cloned, clone and prototype should not be same",prototype.getX(),clone.getX());
        Assert.assertNotEquals("if prototype is cloned, clone and prototype should not be same",prototype.getY(),clone.getY());

    }
}
