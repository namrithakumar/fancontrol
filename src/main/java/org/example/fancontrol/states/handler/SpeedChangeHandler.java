package org.example.fancontrol.states.handler;

import org.example.fancontrol.states.FanState;

public class SpeedChangeHandler implements OperationHandler {
    public void handle(FanState fanState) {
        fanState.getSpeed().change(fanState);
    }
}