package krazenn.company.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RodeurTest {

    Hero rodeurPlayer1 = new Rodeur(10, 50, 0, 10, 0, 1);
    Hero rodeurPlayer2 = new Rodeur(10, 50, 0, 10, 0, 2);

    @Test
    void Given_RodeurSelected_When_HeroCreated_Then_DisplayGoodInformation() {
        System.out.println(rodeurPlayer1.presentation());
        assertEquals("Aaaahhh je suis le Rodeur joueur 1 niveau 10 je possède 50 de vitalité, 0 de force, 10 d'agilite et 0 d'intelligence !", rodeurPlayer1.presentation());
    }


    @Test
    public void Given_Attack1Selected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToHero() {
        rodeurPlayer1.basicAttack(rodeurPlayer2);
        assertEquals(40, rodeurPlayer2.getLife());
        assertEquals(50, rodeurPlayer1.getLife());
    }

    @Test
    public void Given_Attack2Selected_When_PlayerTurn_Then_AddGoodAmountOfAgilityAndNoRemoveLifeHero2(){
        rodeurPlayer1.specialAttack(rodeurPlayer2);
        assertEquals(50,rodeurPlayer2.getLife());
        assertEquals(15,rodeurPlayer1.getAgility());
    }
}