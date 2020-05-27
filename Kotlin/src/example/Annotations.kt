package example
//
//import kotlin.reflect.full.*    // required import
//
//@ImAPlant class Plant {
//    fun trim(){}
//    fun fertilize(){}
//}
//
//fun testAnnotations() {
//    val plantObject = Plant::class
//    val myAnnotationObject = plantObject.findAnnotation<ImAPlant>()
//    println(myAnnotationObject)
//}
//fun main() {
//    testAnnotations()
//}
//
//annotation class ImAPlant
//
//@Target(AnnotationTarget.PROPERTY_GETTER)
//annotation class OnGet
//@Target(AnnotationTarget.PROPERTY_SETTER)
//annotation class OnSet
//
//@ImAPlant class Plant {
//    @get:OnGet
//    val isGrowing: Boolean = true
//
//    @set:OnSet
//    var needsFood: Boolean = false
//}
fun labels() {
    outerLoop@ for (i in 1..100) {
        print("$i ")
        for (j in 1..100) {
            if (i > 10) break@outerLoop  // breaks to outer loop
        }
    }
}

fun main() {
    labels()
}