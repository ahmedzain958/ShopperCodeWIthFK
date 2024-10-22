import android.app.Application
import org.koin.core.context.startKoin

class ShopperApp: Application()  {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(domainMccodule, dataModule, presentationModule))
        }
    }
}