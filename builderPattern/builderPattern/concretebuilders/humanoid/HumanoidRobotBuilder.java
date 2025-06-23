package builderPattern.concretebuilders.humanoid;

import builderPattern.interfaces.RobotBuilder;
import builderPattern.product.Robot;

/** Builds a humanoid robot */
public class HumanoidRobotBuilder implements RobotBuilder {
    private final Robot robot = new Robot();

    @Override public void buildHead()  { robot.setHead("Humanoid Head"); }
    @Override public void buildBody()  { robot.setBody("Humanoid Body"); }
    @Override public void buildArms()  { robot.setArms("Humanoid Arms"); }
    @Override public void buildLegs()  { robot.setLegs("Humanoid Legs"); }
    @Override public Robot getRobot()  { return robot; }
}
