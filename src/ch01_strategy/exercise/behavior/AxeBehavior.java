package ch01_strategy.exercise.behavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("도끼로 찍는다!!");
    }
}
