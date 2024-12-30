//annotation class CustomSuppress(vararg val errorName :String)

/*@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.EXPRESSION)*/
annotation class VeryCool


fun main() {
    @Special
    val name = "Ali"
}
annotation class Special


annotation class Get(val api: String)



/*


@Retention(AnnotationRetention.SOURCE)
@Target(
    AnnotationTarget.LOCAL_VARIABLE,
    AnnotationTarget.FIELD,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.CLASS,
    AnnotationTarget.TYPE_PARAMETER,
    AnnotationTarget.EXPRESSION
)*//*
annotation class Special
annotation class CustomSuppress()*/

/*


fun main() {

   // @CustomSuppress(name = Special())
        val name = "Huck Kim"

   // @CustomSuppress(name = Special())
        val phone = "Huck Kim"

    @Special
    val a = "huck"
    println(@Special name)

}*/
