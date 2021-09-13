package org.example.fancontrol.states;

import org.example.fancontrol.operations.UserOperation;
import org.example.fancontrol.states.direction.Direction;
import org.example.fancontrol.states.factory.OperationHandlerFactory;
import org.example.fancontrol.states.handler.OperationHandler;
import org.example.fancontrol.states.speed.Speed;

public class FanState {
    private Speed speed;
    private Direction direction;

    public FanState(Speed speed, Direction direction) {
        this.speed = speed;
        this.direction = direction;
    }

    public Speed getSpeed() {
        return this.speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void operate(UserOperation userOperation) {

        //Get the correct change handler - SpeedType or direction from the handler factory
        OperationHandlerFactory operationHandlerFactory = new OperationHandlerFactory();
        OperationHandler changeHandler = operationHandlerFactory.getMovementChangeHandler(userOperation);

        //Change the speed or direction
        changeHandler.handle(this);

        //Display latest values once the speed/direction changes
        this.display();
    }

    public void display() {
        System.out.println("SpeedType : " + this.speed.getDisplayName());
        System.out.println("DirectionType : " + this.direction.getDisplayName());
    }
}