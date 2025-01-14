package ch01_strategy.exercise.behavior;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("활로 화살을 쏩니다.");
    }
}
