package Balls;

import java.util.Random;
public class Ball {

    private String name;
    private float catchChance;
    private float useChance;

    public Ball(){
        this.name = "Pokeball";
        this.catchChance = 0.5f;
        this.useChance = 0.5f;
    }

    public Ball(String name, float catchChance, float useChance) {
        this.name = name;
        this.catchChance = catchChance;
        this.useChance = useChance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCatchChance() {
        return catchChance;
    }

    public void setCatchChance(float catchChance) {
        this.catchChance = 1.0f;
    }

    public float getUseChance() {
        return useChance;
    }

    public void setUseChance(float useChance) {
        double randomValue = Math.random();
    }

    @Override
    public String toString() {
        return "Ball [name=" + name + ", catchChance=" + catchChance + ", useChance=" + useChance + "]";
    }


    public void pokeCalChance(int grade, float catchChance){  
        
        if (useChance > 0.3){
            if(grade == 1){
                catchChance = catchChance * 0.7f;
            }else {
            System.out.println("Pokemon was freed");
            }

            if ((grade == 2) || (grade == 3)){
                catchChance = catchChance * 0.2f;
            } else {
                System.out.println("Pokemon was freed");
            }
        }else {
            System.out.println("Use chance is too low. Ball may fail to work.");
        }
        // if(grade >= 4){
        //     catchChance = catchChance * 0.1f;
        // }else {
        //     System.out.println("Pokemon was freed");
        // }

    }
    
    public void greatCalChance(int grade, float catchChance){  
        if (useChance > 0.5){
            if(grade == 1){
                catchChance = catchChance * 0.8f;
            }else {
            System.out.println("Pokemon was freed");
            }

            if ((grade == 2) || (grade == 3)){
                catchChance = catchChance * 0.4f;
            } else {
                System.out.println("Pokemon was freed");
            }
        }
    }

    public void ultraCalChance(int grade, float catchChance){  
        if (useChance > 0.7){
            if(grade == 1){
                catchChance = catchChance * 0.9f;
            }else {
            System.out.println("Pokemon was freed");
            }

            if ((grade == 2) || (grade == 3)){
                catchChance = catchChance * 0.6f;
            } else {
                System.out.println("Pokemon was freed");
            }
        }
    }

    public void masterCalChance(int grade, float catchChance){  
        if (useChance > 0.9){
            if(grade >= 1){
                catchChance = catchChance * 1.0f;
            }else {
                System.out.println("Pokemon was freed");
            }
        }
    }
}
