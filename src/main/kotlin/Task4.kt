import java.awt.*
import java.awt.event.WindowEvent
import java.io.File
import java.nio.charset.Charset
import javax.swing.*


class Task4: MFrame("Task4", 400, 400) {
    private val menuBar = JMenuBar()
    private val menuBarFile = JMenu("File")
    private val openItem = JMenuItem("Open")
    private val saveItem = JMenuItem("Save")
    private val closeItem = JMenuItem("Close")

    private val textArea = JTextArea(15, 15)
    private val fileChooser = JFileChooser()
    private lateinit var file: File

    init {
        contentPane.layout = BorderLayout()

        // Menu bar
        openItem.addActionListener {
            fileChooser.showOpenDialog(this)
            file = fileChooser.selectedFile
            textArea.text = file.inputStream().readBytes().toString(Charset.defaultCharset())
        }

        saveItem.addActionListener {
            if (showSaveDialog() == 0) {
                file.writeText(textArea.text)
            }
        }

        closeItem.addActionListener {
            if (showSaveDialog() == 0) {
                file.writeText(textArea.text)
            }

            dispatchEvent(WindowEvent(this, WindowEvent.WINDOW_CLOSING))
        }

        menuBarFile.add(openItem)
        menuBarFile.add(saveItem)
        menuBarFile.add(closeItem)
        menuBar.add(menuBarFile)
        jMenuBar = menuBar

        // Text area
        contentPane.add(JScrollPane(textArea,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER),
            BorderLayout.CENTER)

        // Show frame
        isVisible = true
    }

    private fun showSaveDialog(): Int {
        return JOptionPane.showOptionDialog(this,
            "Do u want to save changes?",
            "Save",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            arrayOf("Save", "Cancel"),
            "Cancel"
        )
    }

}