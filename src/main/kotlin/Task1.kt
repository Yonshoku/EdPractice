import java.awt.Component
import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JTextField

class Task1: MFrame("Task 1", 400, 400) {
    private val button = JButton("Copy")
    private val textField = JTextField(30)
    private val label = JLabel("Текст")

    init {
        contentPane.layout = FlowLayout(FlowLayout.LEFT)

        button.alignmentX = Component.CENTER_ALIGNMENT
        label.alignmentX = Component.CENTER_ALIGNMENT
        textField.alignmentX = Component.CENTER_ALIGNMENT

        button.addActionListener {
            label.text = textField.text
        }

        add(textField)
        add(label)
        add(button)

        isVisible = true
    }
}