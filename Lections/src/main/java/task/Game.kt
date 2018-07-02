package task

import de.jupf.staticlog.Log

class Game {
    var firstTeam = Team()
    var secondTeam = Team()

    fun getResultOfTheGame() {
        addPlayers()
        when {
            countProcentDifference() <= 0.1 -> Log.info("Draw")
            firstTeam.totalSkillOfTheTeam > secondTeam.totalSkillOfTheTeam -> Log.info("The first team is won with the score: ${firstTeam.totalSkillOfTheTeam}" +
                    " when the second team has ${secondTeam.totalSkillOfTheTeam} score")
            else -> Log.info("The second team is won with the score: ${secondTeam.totalSkillOfTheTeam}" +
                    " when the first team has ${firstTeam.totalSkillOfTheTeam} score")
        }
    }

    fun addPlayers() {
        firstTeam.addPlayerToTheTeam()
        secondTeam.addPlayerToTheTeam()

        firstTeam.skillCount()
        secondTeam.skillCount()
    }

    fun countProcentDifference(): Double {
        val diff: Double
        if (firstTeam.totalSkillOfTheTeam < secondTeam.totalSkillOfTheTeam) {
            diff = (secondTeam.totalSkillOfTheTeam - firstTeam.totalSkillOfTheTeam) * 0.01
            Log.info("Diff: ${diff}% The second team has score: ${secondTeam.totalSkillOfTheTeam}" +
                    " and the first team has ${firstTeam.totalSkillOfTheTeam} score")
        } else {
            diff = ((firstTeam.totalSkillOfTheTeam - secondTeam.totalSkillOfTheTeam) * 0.01)
            Log.info("Diff: ${diff}% The second team has score: ${firstTeam.totalSkillOfTheTeam}" +
                    " and the first team has ${secondTeam.totalSkillOfTheTeam} score")
        }
        return diff
    }
}

fun main(args: Array<String>) {
    var game = Game()
    game.getResultOfTheGame()
}