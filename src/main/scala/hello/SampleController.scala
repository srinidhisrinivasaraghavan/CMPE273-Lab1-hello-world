package hello

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import scala.collection.JavaConversions._

/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author srinidhis
 * @since 1.0
 */
object SampleController {

  def main(args: Array[String]) {
    SpringApplication.run(classOf[SampleController])
  }
}

@Controller
@EnableAutoConfiguration
class SampleController {

  @RequestMapping(Array("/"))
  @ResponseBody
  def home(): String = "Hello World!"
}
