
var counter = 6

fun main() {

    if(counter == 0) return
    counter = counter - 1
    main(counter)
 //   main()
}

fun main(args: Int) {
    print(args)
}