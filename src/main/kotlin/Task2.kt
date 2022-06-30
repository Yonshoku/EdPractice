import java.awt.Component
import java.awt.FlowLayout
import java.io.File
import javax.imageio.ImageIO
import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JOptionPane
import javax.swing.JPanel
import javax.swing.JTextField

class Task2: MFrame("Task2", 400, 400) {
    private val button = JButton("Show dialog")
    private val textField = JTextField(30)
    private val label1 = JLabel("Input your name")
    private val label2 = JLabel("Name:")
    private val textFieldPanel = JPanel(FlowLayout(FlowLayout.CENTER))

    init {
        contentPane.layout = BoxLayout(contentPane, BoxLayout.Y_AXIS)

        button.alignmentX = Component.CENTER_ALIGNMENT
        label1.alignmentX = Component.CENTER_ALIGNMENT
        label2.alignmentX = Component.CENTER_ALIGNMENT
        textField.alignmentX = Component.CENTER_ALIGNMENT

        button.addActionListener {
            JOptionPane.showMessageDialog(this, textField.text)
        }

        textFieldPanel.add(label2)
        textFieldPanel.add(textField)

        add(label1)
        add(textFieldPanel)
        add(button)

        isVisible = true
    }
}