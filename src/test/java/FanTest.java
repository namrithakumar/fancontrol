import org.example.fancontrol.base.Fan;
import org.example.fancontrol.operations.UserOperation;
import org.example.fancontrol.states.FanState;
import org.example.fancontrol.states.direction.Clockwise;
import org.example.fancontrol.states.speed.Off;
import org.example.fancontrol.states.values.DirectionType;
import org.example.fancontrol.states.values.SpeedType;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class FanTest {

    Fan fan;

    @Before
    public void setup() {
        fan = new Fan();
        fan.setFanState(new FanState(new Off(), new Clockwise()));
    }

    //SpeedType Change - OFF to LOW
    @Test
    public void testOperateSpeedChangeOffToLow() {
        this.fan.operate(UserOperation.CHANGE_SPEED);
        assertEquals(SpeedType.LOW.getLabel(), this.fan.getFanState().getSpeed().getDisplayName());
        assertEquals(DirectionType.CLOCKWISE.getLabel(), this.fan.getFanState().getDirection().getDisplayName());
    }

    //SpeedType Change - OFF - LOW - MEDIUM
    @Test
    public void testOperateSpeedChangeOffToMedium() {
        this.fan.operate(UserOperation.CHANGE_SPEED);
        this.fan.operate(UserOperation.CHANGE_SPEED);
        assertEquals(SpeedType.MEDIUM.getLabel(), this.fan.getFanState().getSpeed().getDisplayName());
        assertEquals(DirectionType.CLOCKWISE.getLabel(), this.fan.getFanState().getDirection().getDisplayName());
    }

    //SpeedType Change - OFF - LOW - MEDIUM - HIGH
    @Test
    public void testOperateSpeedChangeOffToHigh() {
        this.fan.operate(UserOperation.CHANGE_SPEED);
        this.fan.operate(UserOperation.CHANGE_SPEED);
        this.fan.operate(UserOperation.CHANGE_SPEED);
        assertEquals(SpeedType.HIGH.getLabel(), this.fan.getFanState().getSpeed().getDisplayName());
        assertEquals(DirectionType.CLOCKWISE.getLabel(), this.fan.getFanState().getDirection().getDisplayName());
    }

    //SpeedType Change - OFF - LOW - MEDIUM - HIGH - OFF
    @Test
    public void testOperateSpeedChangeOffToOff() {
        this.fan.operate(UserOperation.CHANGE_SPEED);
        this.fan.operate(UserOperation.CHANGE_SPEED);
        this.fan.operate(UserOperation.CHANGE_SPEED);
        this.fan.operate(UserOperation.CHANGE_SPEED);
        assertEquals(SpeedType.OFF.getLabel(), this.fan.getFanState().getSpeed().getDisplayName());
        assertEquals(DirectionType.CLOCKWISE.getLabel(), this.fan.getFanState().getDirection().getDisplayName());
    }

    //DirectionType Change - CLOCKWISE to COUNTER CLOCKWISE
    @Test
    public void testOperateDirectionChangeClockwiseToCounterClockwise() {
        this.fan.operate(UserOperation.CHANGE_DIRECTION);
        assertEquals(SpeedType.OFF.getLabel(), this.fan.getFanState().getSpeed().getDisplayName());
        assertEquals(DirectionType.COUNTERCLOCKWISE.getLabel(), this.fan.getFanState().getDirection().getDisplayName());
    }

    //DirectionType Change - CLOCKWISE - COUNTER CLOCKWISE - CLOCKWISE
    @Test
    public void testOperateDirectionChangeLoop() {
        this.fan.operate(UserOperation.CHANGE_DIRECTION);
        this.fan.operate(UserOperation.CHANGE_DIRECTION);
        assertEquals(SpeedType.OFF.getLabel(), this.fan.getFanState().getSpeed().getDisplayName());
        assertEquals(DirectionType.CLOCKWISE.getLabel(), this.fan.getFanState().getDirection().getDisplayName());
    }

    // SpeedType change - OFF TO LOW - MEDIUM
    // DirectionType Change - CLOCKWISE - COUNTER CLOCKWISE
    @Test
    public void testOperateSpeedChangeDirectionChange() {
        this.fan.operate(UserOperation.CHANGE_SPEED);
        this.fan.operate(UserOperation.CHANGE_SPEED);
        this.fan.operate(UserOperation.CHANGE_DIRECTION);
        assertEquals(SpeedType.MEDIUM.getLabel(), this.fan.getFanState().getSpeed().getDisplayName());
        assertEquals(DirectionType.COUNTERCLOCKWISE.getLabel(), this.fan.getFanState().getDirection().getDisplayName());
    }
}