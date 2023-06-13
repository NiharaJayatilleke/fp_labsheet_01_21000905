object Q4 {
  def main(args: Array[String] ) {
    var cp = 24.95

    def totCoverPrice(noOfCopies: Int): Double = noOfCopies * cp

    def totDiscount(noOfCopies: Int): Double = noOfCopies * cp * 40 / 100

    def totShippingCost(noOfCopies: Int): Double = if (noOfCopies > 50) {
      3 * 50 + (noOfCopies - 50) * 0.75
    } else {
      3 * noOfCopies
    }

    def totWholesaleCost(noOfCopies: Int): Double = totCoverPrice(noOfCopies) - totDiscount(noOfCopies) + totShippingCost(noOfCopies)

    println("The total wholesale cost is " + totWholesaleCost(60))
  }
}
