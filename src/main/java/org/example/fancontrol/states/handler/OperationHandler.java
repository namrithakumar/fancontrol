package org.example.fancontrol.states.handler;

import org.example.fancontrol.states.FanState;

public interface OperationHandler {
    public void handle(FanState fanState);
}