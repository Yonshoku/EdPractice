import javax.swing.JFrame

open class MFrame(mTitle: String = "Window", mWidth: Int = 200, mHeight: Int = 200): JFrame() {

    init {
        title = mTitle
        setSize(mWidth, mHeight)

        defaultCloseOperation = EXIT_ON_CLOSE
        setLocationRelativeTo(null)
    }

}