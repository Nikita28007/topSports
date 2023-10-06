package com.games.types7.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo

class SportFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.sport_fragment, container, false)
        var counter = 0
        val titles = addDataSports()
        val descriptions = addDataDescription()
        val backgroundPics = addDrawable()
        val sportTitle = view.findViewById<TextView>(R.id.sportTitle)
        val sportDesc = view.findViewById<TextView>(R.id.sportDescription)
        val button = view.findViewById<TextView>(R.id.nextButton)
        val containerLinear = view.findViewById<LinearLayout>(R.id.mainContainerLinear)
        YoYo.with(Techniques.FadeIn)
            .duration(700)
            .repeat(2)
            .playOn(view.findViewById<TextView>(R.id.mainTitle));

        button.text = "Start"
        button.setOnClickListener {
            button.text = "Next"
            sportTitle.text = titles[counter]
            sportDesc.text = descriptions[counter]
            containerLinear.setBackgroundResource(backgroundPics[counter])
            counter++
            if (counter == 7) {
                counter = 0
            }

        }
        return view
    }


    private fun addDataSports(): ArrayList<String> {
        val arraySports = ArrayList<String>()
        arraySports.add("Football")
        arraySports.add("Cricket")
        arraySports.add("Hockey")
        arraySports.add("Tennis")
        arraySports.add("Volleyball")
        arraySports.add("Table Tennis")
        arraySports.add("Basketball")
        return arraySports
    }
    private fun addDrawable(): ArrayList<Int> {
        val arrayDraw = ArrayList<Int>()
        arrayDraw.add(R.drawable.back1)
        arrayDraw.add(R.drawable.back2)
        arrayDraw.add(R.drawable.back3)
        arrayDraw.add(R.drawable.back4)
        arrayDraw.add(R.drawable.back5)
        arrayDraw.add(R.drawable.back6)
        arrayDraw.add(R.drawable.back7)

        return arrayDraw
    }

    private fun addDataDescription(): ArrayList<String> {
        val arrayDesc = ArrayList<String>()
        arrayDesc.add(
            "More commonly known as football or soccer, is a team sport played between " +
                    "two teams of 11 players each, who primarily use their feet to propel a ball around" +
                    " a rectangular field called a pitch. The objective of the game is to score more " +
                    "goals than the opposing team by moving the ball beyond the goal line into a " +
                    "rectangular-framed goal defended by the opposing team. Traditionally, the game " +
                    "has been played over two 45-minute halves, for a total match time of 90 minutes." +
                    " With an estimated 250 million players active in over 200 countries and " +
                    "territories, it is the world's most popular sport."
        )
        arrayDesc.add(
            "Cricket is a bat-and-ball game played between two teams of eleven players " +
                    "on a field at the centre of which is a 22-yard (20-metre) pitch with a wicket at " +
                    "each end, each comprising two bails balanced on three stumps. The batting side " +
                    "scores runs by striking the ball bowled at one of the wickets with the bat and " +
                    "then running between the wickets, while the bowling and fielding side tries to " +
                    "prevent this (by preventing the ball from leaving the field, and getting the ball " +
                    "to either wicket) and dismiss each batter (so they are out)." +
                    " Means of dismissal include being bowled, when the ball hits the stumps and " +
                    "dislodges the bails, and by the fielding side either catching the ball after" +
                    " it is hit by the bat, but before it hits the ground, or hitting a wicket with" +
                    " the ball before a batter can cross the crease in front of the wicket. When ten " +
                    "batters have been dismissed, the innings ends and the teams swap roles. The game " +
                    "is adjudicated by two umpires, aided by a third umpire and match referee in " +
                    "international matches. They communicate with two off-field scorers who record " +
                    "the match's statistical information."
        )

        arrayDesc.add(
            "Hockey is a term used to denote a family of various types of both summer " +
                    "and winter team sports which originated on either an outdoor field, sheet of ice," +
                    " or dry floor such as in a gymnasium. While these sports vary in specific rules, " +
                    "numbers of players, apparel, and playing surface, they share broad characteristics" +
                    " of two opposing teams using a stick to propel a ball or disk into a goal." +
                    " Games played with curved sticks and a ball can be found in the histories of many" +
                    " cultures. In Egypt, 4000-year-old carvings feature teams with sticks and a" +
                    " projectile, hurling dates to before 1272 BC in Ireland, and there is a depiction" +
                    " from approximately 600 BC in Ancient Greece, where the game may have been called" +
                    " kerētízein (κερητίζειν) because it was played with a horn or horn-like stick" +
                    " (kéras, κέρας).[10] In Inner Mongolia, the Daur people have been playing beikou, " +
                    "a game similar to modern field hockey, for about 1,000 years."
        )

        arrayDesc.add(
            "Tennis is a racket sport that is played either individually against a " +
                    "single opponent (singles) or between two teams of two players each (doubles)." +
                    " Each player uses a tennis racket that is strung with cord to strike a " +
                    "hollow rubber ball covered with felt over or around a net and into the opponent's" +
                    " court. The object of the game is to manoeuvre the ball in such a way that the" +
                    " opponent is not able to play a valid return. The player who is unable to return" +
                    " the ball validly will not gain a point, while the opposite player will"
        )
        arrayDesc.add(
            "Volleyball is a team sport in which two teams of six players are separated " +
                    "by a net. Each team tries to score points by grounding a ball on the other team's" +
                    " court under organized rules.[1] It has been a part of the official program of the" +
                    " Summer Olympic Games since Tokyo 1964. Beach volleyball was introduced to the " +
                    "programme at the Atlanta 1996 Summer Olympics. The adapted version of volleyball " +
                    "at the Summer Paralympic Games is sitting volleyball."
        )

        arrayDesc.add(
            "Table tennis (also known as ping-pong) is a racket sport derived from tennis " +
                    "but distinguished by its playing surface being atop a stationary table, rather " +
                    "than the court on which players stand. Either individually or in teams of two, " +
                    "players take alternating turns returning a light, hollow ball over the table's " +
                    "net onto the opposing half of the court using small rackets until they fail to " +
                    "do so, which results in a point for the opponent. Play is fast, requiring quick " +
                    "reaction and constant attention, and is characterized by an emphasis on spin " +
                    "relative to other ball sports, which can heavily affect the ball's trajectory."
        )
        arrayDesc.add(
            "Basketball is a team sport in which two teams, most commonly of five players" +
                    " each, opposing one another on a rectangular court, compete with the primary " +
                    "objective of shooting a basketball (approximately 9.4 inches (24 cm) in diameter) " +
                    "through the defender's hoop (a basket 18 inches (46 cm) in diameter mounted 10 feet" +
                    " (3.048 m) high to a backboard at each end of the court), while preventing the " +
                    "opposing team from shooting through their own hoop. A field goal is worth two " +
                    "points, unless made from behind the three-point line, when it is worth three. " +
                    "After a foul, timed play stops and the player fouled or designated to shoot a " +
                    "technical foul is given one, two or three one-point free throws. The team with " +
                    "the most points at the end of the game wins, but if regulation play expires with" +
                    " the score tied, an additional period of play (overtime) is mandated."
        )

        return arrayDesc
    }
}