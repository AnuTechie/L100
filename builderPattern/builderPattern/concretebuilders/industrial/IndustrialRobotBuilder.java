package builderPattern.concretebuilders.industrial;

import builderPattern.interfaces.RobotBuilder;
import builderPattern.product.Robot;

/** Builds an industrial robot */
public class IndustrialRobotBuilder implements RobotBuilder {
    private final Robot robot = new Robot();

    @Override public void buildHead()  { robot.setHead("Industrial Head"); }
    @Override public void buildBody()  { robot.setBody("Industrial Body"); }
    @Override public void buildArms()  { robot.setArms("Industrial Arms"); }
    @Override public void buildLegs()  { robot.setLegs("Industrial Legs"); }
    @Override public Robot getRobot()  { return robot; }
}
