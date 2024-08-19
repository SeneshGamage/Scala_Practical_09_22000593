object BankInterestCalculator {
  // Using a lambda function to calculate interest
  val calculateInterest: Double => Double = (deposit: Double) => deposit match {
    case d if d <= 20000 => d * 0.02
    case d if d <= 200000 => d * 0.04
    case d if d <= 2000000 => d * 0.035
    case d if d > 2000000 => d * 0.065
  }

  // Main function to get user input and calculate interest
  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount in Rs:")

    // Get user input
    val depositInput = scala.io.StdIn.readLine()

    // Convert input to Double and calculate interest
    try {
      val depositAmount = depositInput.toDouble
      val interestEarned = calculateInterest(depositAmount)
      
      println(s"Deposit: Rs. $depositAmount, Interest Earned: Rs. $interestEarned")
    } catch {
      case e: NumberFormatException =>
        println("Invalid input! Please enter a valid number.")
    }
  }
}
