/**
 * Author: Nate Reppucci
 * PH1111 Lab 5 Momentum, Energy, and Error Propagation for Collision Two
 */
public class labFiveErrorC2
{
    public static void main(String[] args)
    {
       
        double cartSpring, cartHit, cartSpringUncertainty, cartHitUncertainty; // define variables as double type

        cartSpring = (511.5/1000); // conversion from g to kg
        cartSpringUncertainty = (0.01/1000); // conversion from g to kg

        cartHit = (498.9/1000); // conversion from g to kg
        cartHitUncertainty = (0.01/1000); // conversion from g to kg

        double cartSpringVelocityInit, cartSpringVelocityFinal, cartSpringVelocityInitStDev, cartSpringVelocityFinalStDev, cartHitVelocityInit, cartHitVelocityFinal, cartHitVelocityInitStDev, cartHitVelocityFinalStDev; // define variables as double type
    
        cartSpringVelocityInit = 0.6693; // m/s from Logger Pro
        cartSpringVelocityFinal = 0.2987; // m/s " "
        cartSpringVelocityInitStDev = 0.02189; // m/s " "
        cartSpringVelocityFinalStDev = 0.01856; // m/s " " 
 
        cartHitVelocityInit = 0.0001355; // m/s from Logger Pro
        cartHitVelocityFinal = 0.2960; // m/s " "
        cartHitVelocityInitStDev = 0.001286; // m/s " "
        cartHitVelocityFinalStDev = 0.01938; // m/s " "

        double momentumBefore, momentumAfter, momentumSpringInit, momentumSpringFinal, momentumHitInit, momentumHitFinal, pUncertaintyBefore, pUncertaintyBeforeSpring, pUncertaintyBeforeHit, pUncertaintyAfter, pUncertaintyAfterSpring, pUncertaintyAfterHit; // define variables as double type

        /**
         * Calculates total momentum for both before and after the collision. Uncertainty is then calculated using given formulas.
         */
        momentumSpringInit = cartSpring * cartSpringVelocityInit;
        momentumHitInit = cartHit * cartHitVelocityInit;

        momentumSpringFinal = cartSpring * cartSpringVelocityFinal;
        momentumHitFinal = cartHit * cartHitVelocityFinal;

        momentumBefore = momentumSpringInit + momentumHitInit;
        momentumAfter = momentumSpringFinal + momentumHitFinal;

        pUncertaintyBeforeSpring = ( ((cartSpringUncertainty/cartSpring) + (cartSpringVelocityInitStDev/cartSpringVelocityInit)) * momentumSpringInit);
        pUncertaintyBeforeHit = ( ((cartHitUncertainty/cartHit) + (cartHitVelocityInitStDev/cartHitVelocityInit)) * momentumHitInit);
        pUncertaintyBefore = (pUncertaintyBeforeSpring + pUncertaintyBeforeHit);

        pUncertaintyAfterSpring = ( ((cartSpringUncertainty/cartSpring) + (cartSpringVelocityFinalStDev/cartSpringVelocityFinal)) * momentumSpringFinal);
        pUncertaintyAfterHit = ( ((cartHitUncertainty/cartHit) + (cartHitVelocityFinalStDev/cartHitVelocityFinal)) * momentumHitFinal);
        pUncertaintyAfter = (pUncertaintyAfterSpring + pUncertaintyAfterHit);

        // Results are printed
        System.out.println("The total momentum of the system before the collision is: " + momentumBefore + " kg*m/s" + "\nThe uncertainty is: " + pUncertaintyBefore + " kg*m/s\n");
        System.out.println("The total momentum of the system after the collision is: " + momentumAfter + " kg*m/s" + "\nThe uncertainty is: " + pUncertaintyAfter + " kg*m/s");

        double keBefore, keAfter, keSpringInit, keSpringFinal, keHitInit, keHitFinal, keUncertaintyBefore, keUncertaintySpringBefore, keUncertaintyHitBefore, keUncertaintyAfter, keUncertaintySpringAfter, keUncertaintyHitAfter; // variables defined as double type

        /**
         * Calculates total kinetic energy for both before and after the collision. Uncertainty is then calculated using given formulas.
         */
        keSpringInit = 0.5 * cartSpring * (cartSpringVelocityInit*cartSpringVelocityInit);
        keHitInit = 0.5 * cartHit * (cartHitVelocityInit*cartHitVelocityInit);

        keSpringFinal = 0.5 * cartSpring * (cartSpringVelocityFinal*cartSpringVelocityFinal);
        keHitFinal = 0.5 * cartHit * (cartHitVelocityFinal*cartHitVelocityFinal);

        keBefore = keSpringInit + keHitInit;
        keAfter = keSpringFinal + keHitFinal;

        keUncertaintySpringBefore = ( ((cartSpringUncertainty/cartSpring) + (cartSpringVelocityInitStDev/cartSpringVelocityInit)) * keSpringInit);
        keUncertaintyHitBefore = ( ((cartHitUncertainty/cartHit) + (cartHitVelocityInitStDev/cartHitVelocityInit)) * keHitInit);
        keUncertaintyBefore = (keUncertaintySpringBefore + keUncertaintyHitBefore);

        keUncertaintySpringAfter = ( ((cartSpringUncertainty/cartSpring) + (cartSpringVelocityFinalStDev/cartSpringVelocityFinal)) * keSpringFinal);
        keUncertaintyHitAfter = ( ((cartHitUncertainty/cartHit) + (cartHitVelocityFinalStDev/cartHitVelocityFinal)) * keHitFinal);
        keUncertaintyAfter = (keUncertaintySpringAfter + keUncertaintyHitAfter);

        // Results are printed
        System.out.println("\nThe total kinetic energy of the system before the collision is: " + keBefore + " J" + "\nThe uncertainty is: " + keUncertaintyBefore + " J\n");
        System.out.println("The total kinetic energy of the system after the collision is: " + keAfter + " J" + "\nThe uncertainty is: " + keUncertaintyAfter + " J");


    }
}