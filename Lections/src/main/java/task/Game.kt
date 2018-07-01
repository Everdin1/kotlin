package task

import de.jupf.staticlog.Log

class Game{
    var firstTeam = Team()
    var secondTeam = Team()

    fun getResultOfTheGame(){
        addPlayers()
        var diff = (firstTeam.totalSkillOfTheTeam*10)/100 + (secondTeam.totalSkillOfTheTeam*10)/100
        when {
            diff<=10 -> Log.info("even")
            firstTeam.totalSkillOfTheTeam> secondTeam.totalSkillOfTheTeam -> Log.info("The first team is won with the score:  ${firstTeam.totalSkillOfTheTeam}")
            else -> Log.info("The second team is won with the score:  ${secondTeam.totalSkillOfTheTeam}")
        }
    }

    fun addPlayers(){
        firstTeam.addPlayerToTheTeam()
        secondTeam.addPlayerToTheTeam()

        firstTeam.skillCount()
        secondTeam.skillCount()
    }
}

fun main(args: Array<String>) {
    var game = Game()

    game.getResultOfTheGame()
}