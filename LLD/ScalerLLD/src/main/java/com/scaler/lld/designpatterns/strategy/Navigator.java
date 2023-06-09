package com.scaler.lld.designpatterns.strategy;

import com.scaler.lld.designpatterns.strategy.interfaces.NavigationStrategy;
import lombok.AllArgsConstructor;

//step 3 create context class
@AllArgsConstructor
public class Navigator {

    NavigationStrategy strategy;

    public void navigateTo(String source, String dest) {
        strategy.navigate(source, dest);
    }

}
