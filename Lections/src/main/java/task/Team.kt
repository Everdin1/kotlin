package task

class Team {
    var teamName: String = ""
    var listOfPlayers: MutableList<Player> = mutableListOf()
    var player = Player()
    var totalSkillOfTheTeam: Int = skillCount()

    fun skillCount(): Int {
        listOfPlayers.stream().forEach { o ->
            run {
                totalSkillOfTheTeam += o.skill
            }
        }
        return totalSkillOfTheTeam
    }

    fun addPlayerToTheTeam() {
        listOfPlayers.add(player)
    }
}