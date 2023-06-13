import scala.math._

object Q3{
  def main(args: Array[String] ) {
    def sphereVolume(r: Double): Double = 4 / 3 * Pi * r * r * r

    println("The volume of the sphere is " + sphereVolume(5))
  }
}
