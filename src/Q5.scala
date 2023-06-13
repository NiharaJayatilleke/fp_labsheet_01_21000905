object Q5{
  def main(args: Array[String] ) {
    def easy(distance: Int): Int = distance * 8

    def tempo(distance: Int): Int = distance * 7

    def totRunningTime(): Int = easy(2) + tempo(3) + easy(2)

    println("The total running time is " + totRunningTime() + " minutes")
  }
}