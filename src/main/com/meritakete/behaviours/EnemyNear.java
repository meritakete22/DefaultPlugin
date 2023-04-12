package com.meritakete.behaviours;

import java.util.Collection;

import eu.darkbot.api.extensions.Behavior;
import eu.darkbot.api.managers.EntitiesAPI;

public class EnemyNear implements Behaviour{
    
    protected final Collection<? extends Ship> ships;
    
    public EnemyNear( EntitiesAPI entities) {
        super();
    }

    @Override
    public void onTickBehavior() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not yet implemented");   
    }
}
