object StringFormatter {
  // Method to convert a string to uppercase
  def toUpper(str: String): String = str.toUpperCase

  // Method to convert a string to lowercase
  def toLower(str: String): String = str.toLowerCase

  // Higher-order method to apply a given format function to a string
  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    // Test cases with specific formatting
    println(formatNames("Benny")(toUpper))            // Output: BENNY
    println(formatNames("Niroshan")(name => {
      val prefix = name.substring(0, 2).toUpperCase
      val suffix = name.substring(2).toLowerCase
      prefix + suffix
    }))                                              // Output: NIroshan
    println(formatNames("Saman")(toLower))            // Output: saman
    println(formatNames("Kumara")(name => {
      val prefix = name.substring(0, name.length - 1)
      val suffix = name.substring(name.length - 1).toUpperCase
      prefix + suffix
    }))                                              // Output: KumarA
  }
}
