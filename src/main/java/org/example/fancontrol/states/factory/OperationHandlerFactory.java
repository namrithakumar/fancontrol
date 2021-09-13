package org.example.fancontrol.states.factory;

import org.example.fancontrol.operations.UserOperation;
import org.example.fancontrol.states.handler.DirectionChangeHandler;
import org.example.fancontrol.states.handler.OperationHandler;
import org.example.fancontrol.states.handler.SpeedChangeHandler;

public class OperationHandlerFactory {

    public OperationHandler getMovementChangeHandler(UserOperation userOperation) {
        switch(userOperation) {
            case CHANGE_DIRECTION:
                return new DirectionChangeHandler();

            case CHANGE_SPEED:
                return new SpeedChangeHandler();

            // default : TODO: throw error
        }
        return null;
    }
}