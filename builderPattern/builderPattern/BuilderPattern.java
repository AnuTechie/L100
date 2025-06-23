package builderPattern;

import builderPattern.concretebuilders.humanoid.HumanoidRobotBuilder;
import builderPattern.concretebuilders.industrial.IndustrialRobotBuilder;
import builderPattern.director.RobotDirector;
import builderPattern.interfaces.RobotBuilder;
import builderPattern.product.Robot;

public class BuilderPattern {

    public static void main(String[] args) {
        // ----- Humanoid robot -----
        RobotBuilder humanoidBuilder = new HumanoidRobotBuilder();
        RobotDirector director       = new RobotDirector(humanoidBuilder);
        Robot humanoid               = director.constructRobot();
        System.out.println(humanoid);

        // ----- Industrial robot -----
        RobotBuilder industrialBuilder = new IndustrialRobotBuilder();
        director                       = new RobotDirector(industrialBuilder);
        Robot industrial               = director.constructRobot();
        System.out.println(industrial);
    }
}
