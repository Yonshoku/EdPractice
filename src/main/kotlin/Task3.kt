import java.awt.*
import javax.imageio.ImageIO
import javax.swing.*

class Task3: MFrame("Task3", 400, 400) {
    private val gbc = GridBagConstraints()

    private val picNameArray = arrayOf("picture 1", "picture 2", "picture 3")
    private val picPathArray = arrayOf("/bg1.jpg", "/bg2.jpg", "/bg3.jpg")

    private var pictureBox = JLabel(ImageIcon(ImageIO.read(this.javaClass.getResource(picPathArray[0]))))
    private val button = JButton("Update picture")
    private val label = JLabel("Picture 1")
    private val comboBox = JComboBox(picNameArray)
    private var comboBoxCurrentItem: String = picNameArray[0]


    init {
        contentPane.layout = GridBagLayout()
        gbc.fill = GridBagConstraints.HORIZONTAL

        pictureBox.preferredSize = Dimension(250, 250)

        label.font = Font("Serif", Font.BOLD, 20)

        comboBox.addActionListener { e ->
            comboBoxCurrentItem = (e.source as JComboBox<*>).selectedItem as String


        }

        button.background = Color(220, 140, 90)
        button.addActionListener {
            when (comboBoxCurrentItem) {
                picNameArray[0] -> {
                    replacePic(picPathArray[0])
                    label.text = picNameArray[0]
                }

                picNameArray[1] -> {
                    replacePic(picPathArray[1])
                    label.text = picNameArray[1]
                }

                picNameArray[2] -> {
                    replacePic(picPathArray[2])
                    label.text = picNameArray[2]
                }
            }
        }

        addGBC(pictureBox, 0, 0)
        addGBC(label, 0, 1)
        addGBC(comboBox, 1, 0)
        addGBC(button, 1, 1)

        isVisible = true
    }

    fun addGBC(component: Component, x: Int, y: Int) {
        gbc.gridx = x
        gbc.gridy = y
        contentPane.add(component, gbc)
    }

    fun replacePic(path: String) {
        remove(pictureBox)
        pictureBox = JLabel(ImageIcon(ImageIO.read(this.javaClass.getResource(path))))
        pictureBox.preferredSize = Dimension(250, 250)
        addGBC(pictureBox, 0, 0)
    }
}