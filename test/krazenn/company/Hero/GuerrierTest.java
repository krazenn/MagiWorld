package krazenn.company.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GuerrierTest {

    Hero guerrierPlayer1 = new Guerrier(10, 50, 10, 0, 0, 1);
    Hero guerrierPlayer2 = new Guerrier(10, 50, 10, 0, 0, 2);

    @Test
    void Given_GuerrierSelected_When_HeroCreated_Then_DisplayGoodInformation() {
        System.out.println(guerrierPlayer1.presentation());
        assertEquals("Woarg je suis le Guerrier joueur 1 niveau 10 je possède 50 de vitalité, 10 de force, 0 d'agilite et 0 d'intelligence !", guerrierPlayer1.presentation());
    }


    @Test
    public void Given_Attack1Selected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToPersonnage2WithoutChangeLifeOfPersonnage1() {
        guerrierPlayer1.basicAttack(guerrierPlayer2);
        assertEquals(40, guerrierPlayer2.getLife());
        assertEquals(50, guerrierPlayer1.getLife());
    }

    @Test
    public void Given_Attack2Selected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToPersonnage2WithLooseLifeOfPersonnage1(){
        guerrierPlayer1.basicAttack(guerrierPlayer2);
        guerrierPlayer2.specialAttack(guerrierPlayer1);
        assertEquals(40,guerrierPlayer2.getLife());
        assertEquals(45,guerrierPlayer2.getLife());
    }
}