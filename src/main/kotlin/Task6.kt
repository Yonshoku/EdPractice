import java.awt.Color
import java.awt.Dimension
import java.awt.Font
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JOptionPane

class Task6: MFrame("Task6", 200, 200) {
    private val button = JButton("Button")

    init {
        contentPane.layout = BoxLayout(contentPane, BoxLayout.Y_AXIS)

        button.addMouseListener(object: MouseAdapter() {
            override fun mouseEntered(e: MouseEvent?) {
                button.background = Color(0, 0, 0)
                button.foreground = Color(255, 255, 255)
                button.font = Font("Serif", Font.BOLD, 20)
                button.text = "Hovered"

                JOptionPane.showMessageDialog(contentPane, "HOVERED")
            }
        })

        contentPane.add(button)
        isVisible = true
    }
}