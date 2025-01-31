package flow

/*
val anotherFlow = flowOf(1, 2, 3, 4) // creates flow that emits 1, 2, 3 ,4
    .map { it * 2 }              // creates new flow that emits 2, 4, 6, 8

val anotherFlow = flowOf(1, 2, 3, 4)
    .filter { it % 2 == 0 } // emits 2, 4

flow.collect { println(it) } // prints each element that flow emits

flow.collect() // makes the flow emit same elements but ignores them

folderSizes.collect { doSomethingWith(it) } // check folder sizes once
// ...
folderSizes.collect { doSomethingWith(it) } // and then check if something changes

flowOf(1, 2, 3, 4).reduce { a, b -> a + b } // sum all and return 10

flow.launchIn(scope) // same as: scope.launch { flow.collect() }
*/
