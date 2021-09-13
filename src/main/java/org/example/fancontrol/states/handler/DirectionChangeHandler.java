package org.example.fancontrol.states.handler;

import org.example.fancontrol.states.FanState;

public class DirectionChangeHandler implements OperationHandler {
    public void handle(FanState fanState) {
        fanState.getDirection().change(fanState);
    }
}