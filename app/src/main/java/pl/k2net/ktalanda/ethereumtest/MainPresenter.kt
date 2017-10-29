package pl.k2net.ktalanda.ethereumtest

class MainPresenter {

    private var view: ViewInterface? = null

    fun bind(viewInterface: ViewInterface) {
        this.view = viewInterface
    }

    interface ViewInterface
}
