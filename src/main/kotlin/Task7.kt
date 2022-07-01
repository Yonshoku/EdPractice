import java.awt.*
import java.lang.Math.cos
import java.lang.Math.sin
import java.util.*
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities

class Task7(): MFrame("Trajectory", 600, 800) {
    private var scores: List<Double> = listOf()
    private val k = 20
    private val twicePI = 6.3
    private val scoresNum = 64
    private val step = 4 / 64

    private val R2 = 90
    private val R1 = R2 / k

    private var x: Double = 0.0
    private var y: Double = 0.0

    init {
        // Get points
        for (i in 0..scoresNum) {
            x=R1*(k-1)*(cos(i.toDouble())+cos((k-1)*i.toDouble())/(k-1));
            y=R1*(k-1)*(sin(i.toDouble())-sin((k-1)*i.toDouble())/(k-1));
        }


        contentPane.add(GraphPanel(listOf(2.0, 3.0, 4.0, 5.0, 6.0, 7.0)))
        isVisible = true
    }

}