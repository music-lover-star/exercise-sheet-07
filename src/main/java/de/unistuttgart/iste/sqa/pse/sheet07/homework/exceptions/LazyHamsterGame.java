package de.unistuttgart.iste.sqa.pse.sheet07.homework.exceptions;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * A SimpleHamsterGame with exceptions
 *
 * @author (your name)
 */
public class LazyHamsterGame extends SimpleHamsterGame {

	/**
	 * This constructor is used for loading a territory for the game and for displaying it.
	 * Do not modify.
	 */
	public LazyHamsterGame(final String territoryFile) {
		this.loadTerritoryFromResourceFile(territoryFile);
		this.displayInNewGameWindow();
		game.startGame();
	}

	/**
	 * Do not modify this operation.
	 */
	@Override
	protected void run() {
		moveMultipleSteps(5);
	}

	// TODO add documentation with contracts here
	public void tryToMove() throws TooLazyException {
		if (Math.random()<0.75{
			paule.move();
		}else {
		 throw new TooLazyException();
		
	}

	
	public void moveMultipleSteps(int numberOfSteps) {
		public void moveMultipleSteps(int n) throws NoWayToGoException {
    int steps = 0;
    while (steps < n) {
        if (paule.frontIsClear()) {
            try {
                tryToMove();
                steps++;
            } catch (TooLazyException e) {
                paule.write("Komm schon, Paule! Du schaffst das!");
            }
        } else {
            paule.turnLeft();
            if (!paule.frontIsClear() && !paule.rightIsClear() && !paule.leftIsClear()) {
                throw new NoWayToGoException();
       
	}
	}
	public boolean isCaged() {
boolean caged = true;
    for (int i = 0; i < 4; i++) {
        if (paule.frontIsClear()) {
            caged = false;
            break;
        }
        paule.turnLeft();
    }
    return caged;

	}
}
