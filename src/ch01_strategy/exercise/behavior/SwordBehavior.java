package ch01_strategy.exercise.behavior;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("칼로 찌릅니다.");
    }
}
