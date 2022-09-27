class Fabric(var color: String) {
    var pattern: String = "none"
    var patternColor: String = "none"

    init {
        println("$color fabric is created")
    }

    constructor(color: String, pattern: String, patColor: String): this(color) {
        this.pattern = pattern
        this.patternColor = patColor
        println("$patternColor $pattern pattern is printed on the fabric")
    }
}
