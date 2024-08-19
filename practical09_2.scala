object NumberCategorizer {
  // Lambda function to categorize the number using pattern matching
  val categorizeNumber: Int => String = (num: Int) => num match {
    case n if n <= 0 => "Negative/Zero is input"
    case n if n % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }

  // Main function to get input from the command line and categorize the number
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer as input.")
    } else {
      try {
        // Convert command-line argument to integer
        val input = args(0).toInt
        // Categorize the number using the lambda function
        val result = categorizeNumber(input)
        // Print the result
        println(result)
      } catch {
        case e: NumberFormatException =>
          println("Invalid input! Please enter a valid integer.")
      }
    }
  }
}
