/*
package koin

import org.koin.core.Koin
import org.koin.core.component.KoinComponent
import org.koin.core.component.KoinScopeComponent
import org.koin.core.component.createScope
import org.koin.core.component.newScope
import org.koin.core.scope.Scope
import org.koin.dsl.koinApplication
import org.koin.java.KoinJavaComponent.inject

object IsolatedContext {

    val koinApp = koinApplication {
        modules(module1, module2, ...)
    }

    val koin = koinApp.koin
}
abstract class IsolatedKoinComponent : KoinComponent {

    override fun getKoin(): Koin = IsolatedKoinContext.koin
}

class SomeKoinComponent : IsolatedKoinComponent()

module {
    scope<SomeType>{
        scoped { ModuleLayer.Controller() }
    }
}

class OuterScopeComponent : KoinScopeComponent {
    override val scope: Scope by lazy { createScope(this) }
}

class InnerScopeComponent

module {
    scope<OuterScopeComponent> {
        scoped { InnerScopeComponent() }
    }
}

class OuterScopeComponent : KoinScopeComponent {
    override val scope: Scope by lazy { newScope(this) }

    val outer : OuterScopeComponent by inject()

    fun close(){
        scope.close() // don't forget to close current scope
    }
}

module {
    single { ParentScope() }
    scope<ParentScope> {
        scoped { ChildScope() }
    }
    scope<ChildScope> {
        scoped { ChildComponent() }
    }
}*/
