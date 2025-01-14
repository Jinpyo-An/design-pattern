package ch01_strategy.exercise.behavior;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("칼로 밴다!");
    }
}
