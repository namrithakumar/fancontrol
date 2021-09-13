package org.example.fancontrol.base;

import org.example.fancontrol.operations.UserOperation;
import org.example.fancontrol.states.FanState;

public class Fan {
    private FanState fanState;

    public void operate(UserOperation userOperation) {
        this.fanState.operate(userOperation);
    }

    public FanState getFanState() {
        return fanState;
    }

    public void setFanState(FanState fanState) {
        this.fanState = fanState;
    }
}