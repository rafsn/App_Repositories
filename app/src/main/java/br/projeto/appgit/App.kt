package br.projeto.appgit

import android.app.Application
import android.app.Presentation
import br.projeto.appgit.data.di.DataModule
import br.projeto.appgit.domain.di.DomainModule
import br.projeto.appgit.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}