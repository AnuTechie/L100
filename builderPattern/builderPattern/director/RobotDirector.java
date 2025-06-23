package builderPattern.director;

import builderPattern.interfaces.RobotBuilder;
import builderPattern.product.Robot;

/** Orchestrates the building steps */
public class RobotDirector {
    private final RobotBuilder builder;

    public RobotDirector(RobotBuilder builder) {
        this.builder = builder;
    }

    public Robot constructRobot() {
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
        return builder.getRobot();
    }
}
