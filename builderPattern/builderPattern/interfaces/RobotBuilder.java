package builderPattern.interfaces;

import builderPattern.product.Robot;

/** Builder contract */
public interface RobotBuilder {
    void buildHead();
    void buildBody();
    void buildArms();
    void buildLegs();
    Robot getRobot();
}
